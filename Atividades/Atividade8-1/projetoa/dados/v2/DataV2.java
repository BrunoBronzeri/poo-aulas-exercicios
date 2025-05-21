package projetoa.dados.v2;


public class DataV2 extends DataV1{
	
	float valorAnterior;

	public DataV2(String idDispositivo, String timestamp, float valor, float valorAnterior) {
		this.idDispositivo = idDispositivo;
		this.timestamp = timestamp; 
		this.valor = valor;
		this.valorAnterior = valorAnterior;
	}
	
	
}
