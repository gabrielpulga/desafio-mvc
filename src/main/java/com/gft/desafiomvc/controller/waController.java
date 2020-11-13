package com.gft.desafiomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/wa")
public class waController {

    @RequestMapping
    public ModelAndView paginaInicial() {
        ModelAndView modelAndView = new ModelAndView("wa");
        return modelAndView;
    }
}
