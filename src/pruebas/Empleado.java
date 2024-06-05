package pruebas;

class Empleado extends Persona {

	double salario;
	
	public Empleado(String nombre, int edad, double estatura, double salario){
		super(nombre,edad,estatura);
		if (salario>=0) {
			this.salario=salario;			
		}
	}
}
