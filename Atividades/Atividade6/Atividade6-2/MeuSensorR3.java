import java.text.SimpleDateFormat;
import java.util.Date;

public class MeuSensorR3 implements Dispositivo {
    
    private String idDispositivo;
    // Constructor
    public MeuSensorR3(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
    
    
    @Override
    public Data getData() {
        
        String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());		
        return new Data(this.idDispositivo, date,  (float)Math.random() * 100);
    }
}
