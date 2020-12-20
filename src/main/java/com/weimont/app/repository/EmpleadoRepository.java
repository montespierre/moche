package com.weimont.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.weimont.app.entity.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{
	
	List<Empleado> findByNomEmpContainingIgnoreCase(String nomEmp);

}
