package primerosherencia.ejercicio3;

public class Producto {

	private String nombre="";
	
	private double precio=0;

	public Producto(String nombre, double precio) {
		if (nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio>0) {
			this.precio = precio;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio>0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	public double calcular(int cantidad) {
		double res=0;
		res=this.precio*(double)cantidad;
		return res;
	}
	
	@Override
	public String toString() {
		String res="";
		res+="Nombre: " + this.nombre + "\n";
		res+="Precio: " + this.precio;
		return res;
	}
	
	
}
