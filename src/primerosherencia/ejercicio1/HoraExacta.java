package primerosherencia.ejercicio1;

public class HoraExacta extends Hora{

	private int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
		
	}
	
	boolean setSegundo(int valor) {
		boolean asignado=false;
		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			asignado=true;
		}
		return asignado;
	}
	
	void inc() {
		segundo++;
		if (segundo==60) {
			segundo=0;
			super.inc();
		}
	}
}
