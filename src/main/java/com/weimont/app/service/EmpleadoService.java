package com.weimont.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.app.entity.Empleado;
import com.weimont.app.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> traerTodos(){
		return (List<Empleado>) empleadoRepository.findAll();
	}
	
	public List<Empleado> traerPorNomEmp(String nomEmp){
		return empleadoRepository.findByNomEmpContainingIgnoreCase(nomEmp);
	}
	
	public Optional<Empleado> traerPorId(Long id){
		return empleadoRepository.findById(id);
	}
	
	public Empleado crear(Empleado empleado){
		return empleadoRepository.save(empleado);
	}
}
