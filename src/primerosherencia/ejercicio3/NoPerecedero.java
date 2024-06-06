package primerosherencia.ejercicio3;

public class NoPerecedero extends Producto {
	
	private String tipo="";

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo!=null && !tipo.equals("")) {
			this.tipo = tipo;			
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo!=null && !tipo.equals("")) {
			this.tipo = tipo;			
		}
	}
	
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res+="\n" + "Tipo: " + this.tipo;
		return res;
	}
	
}
