package projetoa.sensores;



import java.text.SimpleDateFormat;
import java.util.Date;

/** Sensor dummy que retorna sempre o valor 2 nas leituras para valor e 1 para valorAnterior
 * 
 * @author mauri
 *
 */

public class MeuSensorR2 implements Dispositivo {
	
	private String idDispositivo = "S1";

	@Override
	public DataV2 getData() {		
		String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());		
		return new DataV2(this.idDispositivo, date, 2f, 1f);
	}

}
