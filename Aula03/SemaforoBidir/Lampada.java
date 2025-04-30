
public class Lampada {
	// atributos
	private boolean status;
	private int potencia;
	private Semaforo semaforo;
	
	//construtores	
	public Lampada() {		
	}
	
	public Lampada(boolean status, int potencia) {
		this.status = status;
		this.potencia = potencia;
	}

	public Lampada(boolean status, int potencia, Semaforo s) {
		this.status = status;
		this.potencia = potencia;
		this.semaforo = s;
	}

	
	
	public Semaforo getSemaforo() {
		return semaforo;
	}

	public void setSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}

	public void acende() {
		this.status = true;
	}

	public void apaga() {
		this.status = false;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Lampada [status=" + status + ", potencia=" + potencia + "]";
	}	
	
	public void panico() {
		semaforo.fecha();
	}
	
	
}
