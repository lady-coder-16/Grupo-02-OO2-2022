package com.trabajo.Grupo02OO22022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trabajo.Grupo02OO22022.entity.Aula;
import com.trabajo.Grupo02OO22022.entity.Edificio;
import com.trabajo.Grupo02OO22022.entity.Espacio;
import com.trabajo.Grupo02OO22022.entity.Laboratorio;
import com.trabajo.Grupo02OO22022.entity.Tradicional;
import com.trabajo.Grupo02OO22022.helper.ViewRouteHelper;
import com.trabajo.Grupo02OO22022.service.AulaServiceImplements;
import com.trabajo.Grupo02OO22022.service.EspacioServiceImplements;

@Controller
@RequestMapping("/espacio")
public class EspacioController {
	
	@Autowired
    @Qualifier("espacioService")
    public EspacioServiceImplements espacioService;
    
	@Autowired
    @Qualifier("aulaService")
    public AulaServiceImplements aulaService;

	@GetMapping("/buscarespacio")
	public ModelAndView buscarAula() {
		LocalDate fecha = LocalDate.now();
		char turno = 'm';
		long idaula = 0;
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.BUSCARESPACIO);
		mAV.addObject("fecha", fecha);
		mAV.addObject("turno", turno);
		mAV.addObject("idaula",idaula);
		return mAV;

	}
	
	
	@PostMapping("/espacioencontrado")
	public ModelAndView aulaEncontrada(String fecha, char turno, long idaula) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RESULTADOESPACIO);
		LocalDate fecha1 = LocalDate.parse(fecha);
		Espacio espacio = new Espacio();
		Tradicional tradicional = aulaService.buscarPorID(idaula);
        Laboratorio laboratorio = aulaService.buscarPorIDLab(idaula);
		if(tradicional.getEdificio() != null){
			laboratorio.setEdificio(new Edificio());
			espacio = espacioService.traerEspacio(fecha1, turno, (Aula) tradicional);
		}else if(laboratorio.getEdificio() != null){
			tradicional.setEdificio(new Edificio());
			espacio = espacioService.traerEspacio(fecha1, turno, (Aula) laboratorio);

		}
		mAV.addObject("espacio",espacio);
		return mAV;

	}

	
	}
