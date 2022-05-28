package com.trabajo.Grupo02OO22022.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import com.trabajo.Grupo02OO22022.entity.Curso;
import com.trabajo.Grupo02OO22022.entity.Final;
import com.trabajo.Grupo02OO22022.entity.Materia;
import com.trabajo.Grupo02OO22022.entity.NotaPedido;
import com.trabajo.Grupo02OO22022.helper.ViewRouteHelper;
import com.trabajo.Grupo02OO22022.service.MateriaServiceImplements;
import com.trabajo.Grupo02OO22022.service.NotaPedidoServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.bytebuddy.asm.Advice.Local;

@Controller
@RequestMapping("/pedido")
public class PedidoController {


	@Autowired
	@Qualifier("notaPedidoService")
	public NotaPedidoServiceImplements pedidoService;

    @Autowired
	@Qualifier("materiaService")
	public MateriaServiceImplements materiaService;

	@GetMapping("/pedidoParaFinal")
	public ModelAndView pedirParaFinal() {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PEDIRAULAFINAL);
        Final finalPedido = new Final();
        LocalDate fecha = LocalDate.now();
        char turno = ' ';
        String aula = " ";
        List<Materia> listaMateria = materiaService.listaMaterias();
        int cantEstudiantes = 0;
        String observaciones = " ";
        LocalDate fechaExamen = LocalDate.now();
        mAV.addObject("finalPedido", finalPedido);
        mAV.addObject("fecha", fecha);
        mAV.addObject("turno",turno);
        mAV.addObject("listaMateria",listaMateria);
        mAV.addObject("cantEstudiantes",cantEstudiantes);
        mAV.addObject("observaciones",observaciones);
        mAV.addObject("aula",aula);
        mAV.addObject("fechaExamen",fechaExamen);
        finalPedido.setFecha(fecha);
        finalPedido.setFechaExamen(fechaExamen);

		return mAV;

	}

    @PostMapping("/pedidoenviadofinal")
    public ModelAndView pedidoFinalEnviado(@Valid @ModelAttribute Final finalPedido, RedirectAttributes attributes){
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.REDIRECT_HOME);
        pedidoService.insertOrUpdate(finalPedido);
       
        attributes.addFlashAttribute("success", "Pedido enviado con exito");

        return mAV;
    }

    @GetMapping("/pedidoParaCurso")
	public ModelAndView pedirParaCurso() {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PEDIRAULACURSO);
        Curso cursoPedido = new Curso();
        LocalDate fecha = LocalDate.now();
        char turno = ' ';
        String aula = " ";
        List<Materia> listaMateria = materiaService.listaMaterias();
        int cantEstudiantes = 0;
        String carrera = " ";
        boolean proyector = false;
        String observaciones = " ";
        mAV.addObject("cursoPedido", cursoPedido);
        mAV.addObject("fecha", fecha);
        mAV.addObject("turno",turno);
        mAV.addObject("listaMateria",listaMateria);
        mAV.addObject("cantEstudiantes",cantEstudiantes);
        mAV.addObject("observaciones", observaciones);
        mAV.addObject("carrera",carrera);
        mAV.addObject("aula",aula);
        mAV.addObject("proyector",proyector);
        cursoPedido.setFecha(fecha);

		return mAV;

	}

    @PostMapping("/pedidoenviadocurso")
    public ModelAndView pedidoCursoEnviado(@Valid @ModelAttribute Curso cursoPedido, RedirectAttributes attributes){
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.REDIRECT_HOME);
        pedidoService.insertOrUpdateCurso(cursoPedido);
       
        attributes.addFlashAttribute("success", "Pedido enviado con exito");

        return mAV;
    }
}
