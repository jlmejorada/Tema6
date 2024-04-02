package primerosherencia.ejercicio1;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}
	
	void inc() {
		minuto++;
		if (minuto==60) {
			minuto=0;
			hora++;
		}
		if (hora==24) {
			hora=0;
		}
	}
	
	boolean setMinutos(int valor) {
		boolean asignar=false;
		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			asignar=true;
		}
		return asignar;
	}
	
	boolean setHoras(int valor) {
		boolean asignar=false;
		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			asignar=true;
		}
		return asignar;
	}
	
	public String toString() {
		String mostrar="";
		
		if (hora<10) {
			mostrar += 0 + this.hora + ":";
		} else mostrar += this.hora + ":";
		
		if (minuto<10) {
			mostrar += 0 + this.minuto;
		} else mostrar += this.minuto;		
		
		return mostrar;
	}
	
	
}
