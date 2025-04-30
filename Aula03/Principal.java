
public class Principal {
	public static void main(String args[]) {
		Semaforo s1 = new Semaforo(10, 0);
		System.out.println(s1.toString());
		
		s1.abre();
		System.out.println(s1.toString());
		
		s1.alerta();
		System.out.println(s1.toString());
		
		s1.fecha();
		System.out.println(s1.toString());
		
	}

}
