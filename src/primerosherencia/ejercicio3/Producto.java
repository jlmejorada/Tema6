package primerosherencia.ejercicio3;

public class Producto {

	protected String nombre="";
	
	protected double precio=0;

	public Producto(String nombre, double precio) {
		if (nombre!=null && !nombre.equals("")) {
			this.nombre = nombre;			
		}
		if (precio>0) {
			this.precio = precio;			
		}
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		if (precio>0) {
			this.precio = precio;			
		}
	}

	public String getNombre() {
		return this.nombre;
	} 
	
	@Override
	public String toString() {
		String res=this.nombre + ": " + this.precio + "€";
		return res;
	}
	
	public double calcular(int productos) {
		double precioFinal=this.precio*productos;
		return precioFinal;
	}
	
}
