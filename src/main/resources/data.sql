DROP TABLE IF EXISTS empleados;
create table empleados(
	idEmpleado SERIAL PRIMARY KEY,
	nomEmp varchar(50),
	puestoEmp varchar(50),
	telEmp int(11)
);

insert into empleados(nomEmp ,puestoEmp , telEmp) 
values('Juan','jefe','55450');

