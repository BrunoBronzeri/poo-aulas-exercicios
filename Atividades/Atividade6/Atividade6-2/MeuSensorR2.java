import java.text.SimpleDateFormat;
import java.util.Date;

public class MeuSensorR2 implements Dispositivo {
    
    private String idDispositivo;
    // Constructor
    public MeuSensorR2(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
    
    
    @Override
    public Data getData() {
        
        String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());		
        return new Data(this.idDispositivo, date, (float)Math.random());
    }
}