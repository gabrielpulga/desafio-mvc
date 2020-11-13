package com.gft.desafiomvc.controller;

import com.gft.desafiomvc.model.Funcionario;
import com.gft.desafiomvc.model.Tecnologia;
import com.gft.desafiomvc.model.Vaga;
import com.gft.desafiomvc.repository.TecnologiasRepository;
import com.gft.desafiomvc.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/wa/vagas")
public class vagaController {

    @Autowired
    private VagasRepository vagasRepository;

    @Autowired
    private TecnologiasRepository tecnologiasRepository;

    @RequestMapping
    public ModelAndView pesquisar(@RequestParam(defaultValue = "" +
            "") String projeto) {
        List<Vaga> vagaList = vagasRepository.findVagasByProjetoContainingAndQtdVagaIsGreaterThan(projeto, 0);

        ModelAndView modelAndView = new ModelAndView("vagas");
        modelAndView.addObject("vagas", vagaList);
        return modelAndView;
    }

    @RequestMapping("/nova")
    public ModelAndView novo() {
        ModelAndView modelAndView = new ModelAndView("cadastrarVagas");
        modelAndView.addObject(new Vaga());
        return modelAndView;
    }


    @RequestMapping(method = RequestMethod.POST)
    public String salvar(@Validated Vaga vaga, Errors errors, RedirectAttributes redirectAttributes) {
        if (errors.hasErrors()) {
            return "cadastrarVagas";
        }

        try {
            // TODO: Salvar no banco de dados
            vagasRepository.save(vaga);

            redirectAttributes.addFlashAttribute("mensagem", "Vaga salva com sucesso.");
            return "redirect:/wa/vagas/nova";
        } catch (IllegalArgumentException e) {
            errors.rejectValue("abertura_vaga", null, e.getMessage());
            return "cadastrarVagas";
        }
    }

    @ModelAttribute("todasAsTecnologias")
    public List<Tecnologia> todasAsTecnologias() {
        return tecnologiasRepository.findAll();
    }
}
