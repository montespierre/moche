DROP TABLE IF EXISTS empleados;
CREATE TABLE empleados(
	idEmpleado SERIAL PRIMARY KEY,
	nomEmp VARCHAR(50),
	puestoEmp VARCHAR(50),
	telEmp INTEGER
	);

INSERT INTO empleados(nomEmp ,puestoEmp , telEmp) values('Juan','jefe',55450);
INSERT INTO empleados(nomEmp ,puestoEmp , telEmp) values('Juan','jefe',55450);
INSERT INTO empleados(nomEmp ,puestoEmp , telEmp) values('Juan','jefe',55450);

