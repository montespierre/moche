DROP TABLE IF EXISTS empleados;
CREATE TABLE empleados(
	idEmpleado SERIAL PRIMARY KEY,
	nomEmp VARCHAR(255),
	puestoEmp VARCHAR(255),
	telEmp INTEGER
	);
