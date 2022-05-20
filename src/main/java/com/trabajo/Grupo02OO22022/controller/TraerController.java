package com.trabajo.Grupo02OO22022.controller;

import com.trabajo.Grupo02OO22022.entity.Edificio;
import com.trabajo.Grupo02OO22022.entity.Laboratorio;
import com.trabajo.Grupo02OO22022.entity.Tradicional;
import com.trabajo.Grupo02OO22022.helper.ViewRouteHelper;
import com.trabajo.Grupo02OO22022.service.AulaServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/views/traer")
public class TraerController {

    @Autowired
    @Qualifier("aulaService")
    public AulaServiceImplements aulaService;
    
	@GetMapping("/buscar")
	public ModelAndView buscarpersona() {
		long idabuscar = 0;
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.BUSCARAULA);
		mAV.addObject("idabuscar", idabuscar);
		
		return mAV;

	}
	@PostMapping("/aulaxid")
	public ModelAndView buscarporpersona(long idabuscar) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RESULTADOAULA);
        Tradicional tradicional = aulaService.buscarPorID(idabuscar);
        Laboratorio laboratorio = aulaService.buscarPorIDLab(idabuscar);
		if(tradicional.getEdificio() != null){
			laboratorio.setEdificio(new Edificio());
		}else if(laboratorio.getEdificio() != null){
			tradicional.setEdificio(new Edificio());

		}
		
		mAV.addObject("tradicional", tradicional);
        mAV.addObject("laboratorio", laboratorio);

		return mAV;

	}

}
