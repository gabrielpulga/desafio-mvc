package com.gft.desafiomvc.controller;

import com.gft.desafiomvc.model.Funcionario;
import com.gft.desafiomvc.model.Vaga;
import com.gft.desafiomvc.repository.FuncionariosRepository;
import com.gft.desafiomvc.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/wa/alocados")
public class alocadosController {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Autowired
    private VagasRepository vagasRepository;

    @RequestMapping
    public ModelAndView pesquisar(@RequestParam(defaultValue = "" + "") String nome) {

        List<Funcionario> alocadosList = funcionariosRepository.findFuncionariosByAlocadoIsTrueAndNomeIsContaining(nome);

        ModelAndView modelAndView = new ModelAndView("historico");
        modelAndView.addObject("alocados", alocadosList);
        return modelAndView;
    }

    @RequestMapping("/novo")
    public ModelAndView novo() {
        ModelAndView modelAndView = new ModelAndView("alocar");
        modelAndView.addObject(new Funcionario());
        modelAndView.addObject(new Vaga());
        return modelAndView;
    }


    @RequestMapping(method = RequestMethod.POST)
    public String alocar(Funcionario funcionario, Errors errors , String matricula, String codigo,
                         RedirectAttributes redirectAttributes) {

        if (errors.hasErrors()) {
            return "alocar";
        }

        try {
            Funcionario funcionarioAlocado = funcionariosRepository.findByMatricula(matricula);
            funcionarioAlocado.setAlocado(true);

            Vaga vagaAlocada = vagasRepository.findByCodigo(codigo);
            vagaAlocada.setQtdVaga(vagaAlocada.getQtdVaga() - 1);

            funcionarioAlocado.setVaga(vagaAlocada);

            funcionariosRepository.save(funcionarioAlocado);
            vagasRepository.save(vagaAlocada);

            redirectAttributes.addFlashAttribute("mensagem", "Funcionário alocado com sucesso.");
            return "redirect:/wa/alocados/novo";
        } catch (NullPointerException e) {
            return "alocar";
        }
    }
}