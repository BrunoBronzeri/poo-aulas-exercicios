package projetoa.sensores;




import java.text.SimpleDateFormat;
import java.util.Date;

/** Sensor dummy que retorna sempre o valor 1 nas leituras
 * 
 * @author mauri
 *
 */

public class MeuSensorR1 implements Dispositivo {
	
	private String idDispositivo = "S1";

	@Override
	public DataV1 getData() {		
		String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());		
		return new DataV1(this.idDispositivo, date, 1f);
	}

}
