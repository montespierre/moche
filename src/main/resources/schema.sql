DROP TABLE IF EXISTS empleados;
CREATE TABLE empleados(
	idEmpleado SERIAL PRIMARY KEY,
	nomEmp VARCHAR(50),
	puestoEmp VARCHAR(50),
	telEmp INTEGER
	);
