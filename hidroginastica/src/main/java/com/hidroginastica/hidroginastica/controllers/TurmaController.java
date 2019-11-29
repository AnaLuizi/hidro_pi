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
	
 @RequestMapping(value="/cadastroTurma", method=RequestMethod.GET)
 public String form() {
	 return "CadastroTurma";
 }
 @RequestMapping(value="/cadastroTurma", method=RequestMethod.POST)
 public String form(Turma turma) {
	 
	 tr.save(turma);
	 
	 return "redirect:/cadastroTurma";
	 
 }
	@RequestMapping("/listaTurmas")
	public ModelAndView listaTurmas() {
		ModelAndView mv = new ModelAndView("ListaTurma"); 
		Iterable<Turma> turmas= tr.findAll();
		mv.addObject("turmas", turmas);
		return mv;
		
	}
	
	@RequestMapping("/{codigo}")
	public ModelAndView detalhesTurma(@PathVariable("codigo") long codigo) {
	Turma turma =tr.findByCodigo(codigo);
	ModelAndView mv = new ModelAndView("DetalhesTurma"); 
	mv.addObject("turma",turma);
	return mv;
		
	}
	

}
