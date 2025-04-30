public class Principal {
	
	public static void main(String args[]) throws InterruptedException {
		
		Dispositivo d1 = new MeuSensorR1();
        Dispositivo d2 = new MeuSensorR2("S2");
        Dispositivo d3 = new MeuSensorR3("S3");
		
		for (int i = 0; i < 5; i++) {
			Data D1 = d1.getData();
            Data D2 = d2.getData();
            Data D3 = d3.getData();
			System.out.println("SensorR1: " + D1.toString());
            System.out.println("SensorR2: " + D2.toString());
            System.out.println("SensorR3: " + D3.toString());
            System.out.println("-------------------------------------------------");
			
			// espera 2 segundos
			Thread.sleep(2000);
		}
	}


}
