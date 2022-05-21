package com.trabajo.Grupo02OO22022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.entity.Edificio;
import com.trabajo.Grupo02OO22022.entity.Laboratorio;
import com.trabajo.Grupo02OO22022.entity.Tradicional;
import com.trabajo.Grupo02OO22022.entity.User;
import com.trabajo.Grupo02OO22022.helper.ViewRouteHelper;
import com.trabajo.Grupo02OO22022.service.IAulaService;
import com.trabajo.Grupo02OO22022.service.IEdificioService;

@Controller
@RequestMapping("/edificios")
public class EdificioController {
	
	@Autowired
	private IEdificioService edificioService;

	@Autowired
	private IAulaService aulaService;
	
	
	@GetMapping("/")
	public ModelAndView listarEdificios() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RESULTADOEDIFICIO);
		List<Edificio> listaEdif = edificioService.listaEdificios();
		
		
		mAV.addObject("edif", listaEdif);
     

		return mAV;

	}
	
	
	
	/*
	 * @GetMapping("/") public String listarEdificios(Model model) { List<Edificio>
	 * listaEdif = edificioService.listaEdificios(); List<Aula> aulas =
	 * aulaService.listaAulas();
	 * 
	 * 
	 * 
	 * System.out.println(aulas);
	 * 
	 * model.addAttribute("titulo","Lista Edificios"); model.addAttribute("edif",
	 * listaEdif); model.addAttribute("aulas", aulas);
	 * 
	 * System.out.println(listaEdif);
	 * 
	 * 
	 * return ViewRouteHelper.RESULTADOEDIFICIO; }
	 */
	
}
