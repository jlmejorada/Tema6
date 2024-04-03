package primerosherencia.ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo="";

	public NoPerecedero(String nombre, double d, String tipo) {
		super(nombre, d);
		if (tipo!=null && !tipo.equals("")) {
			this.tipo = tipo;			
		}
	}

	public String tipo() {
		return tipo;
	}

	public void tipo(String tipo) {
		if (tipo!=null && !tipo.equals("")) {
			this.tipo = tipo;			
		}
	}
	
	@Override
	public String toString() {
		String res=super.toString() + " Tipo: " + this.tipo ;
		return res;
	}
	
	@Override
	public double calcular(int productos) {
		return super.calcular(productos);
	}
}
