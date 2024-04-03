package primerosherencia.ejercicio3;

public class Perecedero extends Producto {

	private int diasACaducar=0;

	public Perecedero(String nombre, double d, int diasACaducar) {
		super(nombre, d);
		if (diasACaducar>0) {
			this.diasACaducar = diasACaducar;			
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar>0) {
			this.diasACaducar = diasACaducar;			
		}
	}
	
	@Override
	public String toString() {
		String res=super.toString() + " Días para caducar: " + this.diasACaducar ;
		return res;
	}
	
	@Override
	public double calcular(int productos) {
		double precio=super.calcular(productos);
		double precioFinal=precio;
		if (this.diasACaducar==3) {
			precioFinal=precio/2;
		} else if (this.diasACaducar==2) {
			precioFinal=precio/3;
		} else if (this.diasACaducar==1) {
			precioFinal=precio/3;
		}
		return precioFinal;
	}
	
}
