package com.hidroginastica.hidroginastica.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.hidroginastica.hidroginastica.moldels.Turma;
import com.hidroginastica.hidroginastica.repository.TurmaRepository;

@Controller
public class TurmaController {
	
	@Autowired 
	 private TurmaRepository tr;
	
	@RequestMapping(value="/CadastrarTurmas", method=RequestMethod.GET)
	public String form() {
		return "templates/CadastroTurma";
	}
	@RequestMapping(value="/CadastrarTurmas", method=RequestMethod.POST)
	public String form(@Valid Turma e,BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/CadastrarTurmas";
		}
		tr.save(e);
		attributes.addFlashAttribute("mensagem", "Evento cadastrado com sucesso!");
		return "redirect:/CadastrarTurmas";
	}
	@RequestMapping("/turmas")
	public ModelAndView listaTurmas() {
		ModelAndView mv = new ModelAndView("templates/ListaTurma");
		Iterable<Turma> turmas = tr.findAll();
		mv.addObject("turmas", turmas);
		return mv;
	}


}
