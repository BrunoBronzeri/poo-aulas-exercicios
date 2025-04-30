public class Data {
	private String idDispositivo;
	private String timestamp;
	private float valor;
	
	public Data(String idDispositivo, String timestamp, float valor) {
		super();
		this.idDispositivo = idDispositivo;
		this.timestamp = timestamp;
		this.valor = valor;
	}


	public String getIdDispositivo() {
		return idDispositivo;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public float getValor() {
		return valor;
	}


	@Override
	public String toString() {
		return "Data [idDispositivo=" + idDispositivo + ", timestamp=" + timestamp + ", valor=" + valor + "]";
	}
	
	
}
