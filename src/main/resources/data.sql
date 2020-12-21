create table empleados
(
	idEmpleado int(11) not null
		constraint users_table_pk
			primary key,
	nomEmp varchar(50),
	puestoEmp varchar(50),
	telEmp int(11)
);

insert into empleados(idEmpleado ,nomEmp ,puestoEmp , telEmp) 
values('1','Juan','jefe','55450');

