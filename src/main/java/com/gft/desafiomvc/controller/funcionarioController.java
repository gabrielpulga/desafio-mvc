package com.gft.desafiomvc.controller;

import com.gft.desafiomvc.model.Funcionario;
import com.gft.desafiomvc.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/wa/funcionarios")
public class funcionarioController {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @RequestMapping
    public ModelAndView pesquisar(@RequestParam(defaultValue = "" +
            "") String nome) {
        List<Funcionario> funcionarioList = funcionariosRepository.findTitulosByNomeContaining(nome);

        ModelAndView modelAndView = new ModelAndView("funcionarios");
        modelAndView.addObject("funcionarios", funcionarioList);
        return modelAndView;
    }

    @RequestMapping("/novo")
    public ModelAndView novo() {
        ModelAndView modelAndView = new ModelAndView("cadastrarFuncionarios");
        modelAndView.addObject(new Funcionario());
        return modelAndView;
    }


    @RequestMapping(method = RequestMethod.POST)
    public String salvar(@Validated Funcionario funcionario, Errors errors, RedirectAttributes redirectAttributes) {
        if (errors.hasErrors()) {
            return "cadastrarFuncionarios";
        }

        try {
            // TODO: Salvar no banco de dados
            funcionariosRepository.save(funcionario);

            redirectAttributes.addFlashAttribute("mensagem", "Titulo salvo com sucesso.");
            return "redirect:/wa/funcionarios/novo";
        } catch (IllegalArgumentException e) {
            errors.rejectValue("inicio_wa", null, e.getMessage());
            errors.rejectValue("termino_wa", null, e.getMessage());
            return "cadastrarFuncionarios";
        }
    }
}