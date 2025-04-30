public class Semaforo {
	private int id;
	Lampada lampadaVermelha;
	Lampada lampadaAmarela;
	Lampada lampadaVerde;
	private int status; // 0 = fechado; 1 = alerta; 2 = aberto; 3 = desligado
	
	public Semaforo(int id) {
		this.id = id;
		this.inicializaLampadas();
	}	
	
	public Semaforo() {
		this.inicializaLampadas();
	}
	
	public Semaforo(int id, int status) {
		this.id = id;
		this.inicializaLampadas();
		if (status == 0) {
			this.fecha();
		}else if (status == 1) {
			this.alerta();
		} else if (status == 2) {
			this.abre();
		} else {
			this.status = 3;
		}
	}
	
	private void inicializaLampadas() {
		lampadaVermelha = new Lampada(false, 100, this);
		lampadaAmarela = new Lampada(false, 100, this);
		lampadaVerde = new Lampada(false, 100, this);
		this.status = 3;
	}	
	
	public void abre() {
		lampadaVermelha.apaga();
		lampadaAmarela.apaga();
		lampadaVerde.acende();
		this.status = 2;
	}

	public void alerta() {
		lampadaVermelha.apaga();
		lampadaAmarela.acende();
		lampadaVerde.apaga();
		this.status = 1;
	}
	public void fecha() {
		lampadaVermelha.acende();
		lampadaAmarela.apaga();
		lampadaVerde.apaga();
		this.status = 0;
	}

	@Override
	public String toString() {
		return "Semaforo [id=" + id + ", lampadaVermelha=" + lampadaVermelha + ", lampadaAmarela=" + lampadaAmarela
				+ ", lampadaVerde=" + lampadaVerde + ", status=" + status + "]";
	}
	
	
	
}
