package com.hidroginastica.hidroginastica.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hidroginastica.hidroginastica.moldels.Aluno;

@Controller
public class HidroController {
	@RequestMapping(value="/CadastrarAluno", method=RequestMethod.GET)
	public String form() {
		return "eventos/formAluno";
	}
	@RequestMapping(value="/CadastrarAluno", method=RequestMethod.POST)
	public String form(@Valid Aluno e,BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/CadastrarEvento";
		}
	
		attributes.addFlashAttribute("mensagem", "Evento cadastrado com sucesso!");
		return "redirect:/CadastrarAluno";
	}
}
