package projetoa.dados.v1;

import projetoa.dados.v1.DataV1;



public class DataV1 {
	private String idDispositivo;
	private String timestamp;
	private float valor;
	
	public DataV1() {
		
	}
	
	/**
	 * Construtor da classe DataV1.
	 * @param idDispositivo id do dispositivo
	 * @param timestamp timestamp da leitura
	 * @param valor valor lido
	 */
	public DataV1(String idDispositivo, String timestamp, float valor) {
		this.idDispositivo = idDispositivo;
		this.timestamp = timestamp;
		this.valor = valor;
	}

	/**
	 * Retorna o id do dispositivo.
	 * @return id do dispositivo
	 */
	public String getIdDispositivo() {
		return idDispositivo;
	}

	/**
	 * Retorna o timestamp.
	 * @return timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * Retorna o valor.
	 * @return valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * Define o id do dispositivo.
	 * @param idDispositivo id do dispositivo
	 */
	@Override
	public String toString() {
		return "Data [idDispositivo=" + idDispositivo + ", timestamp=" + timestamp + ", valor=" + valor + "]";
	}
	
	
}
