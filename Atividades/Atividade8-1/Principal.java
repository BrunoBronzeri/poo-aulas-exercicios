

public class Principal {
	
	public static void main(String args[]) throws InterruptedException {
		
		Dispositivo d1 = new MeuSensorR1();
		
		for (int i = 0; i < 10; i++) {
			DataV1 d = d1.getData();
			System.out.println(d.toString());
			
			// espera 2 segundos
			Thread.sleep(2000);
		}
	}

}

