package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimont.app.entity.Empleado;
import com.weimont.app.service.EmpleadoService;

@RestController
@RequestMapping("/api/v2/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> traerTodos(){
		return empleadoService.traerTodos();
	}
	
	@GetMapping("/{nomEmp}")
	public List<Empleado> traerPorNomEmp(@PathVariable("nomEmp") String nomEmp){
		return empleadoService.traerPorNomEmp(nomEmp);
	}
	
}
