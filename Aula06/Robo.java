public class Robo {
    // Attributes
    private int x;
    private int y;
    public static int qntde = 0;

    // Constructor
    public Robo(int x, int y) {
        this.x = x;
        this.y = y;
        Robo.qntde++;
    }

    // Methods
    public float calculaDistanciaParaOutroRobo(Robo outroRobo) { // precisa acessar a classe
        return (float) Math.sqrt(Math.pow(this.x - outroRobo.x, 2) + Math.pow(this.y - outroRobo.y, 2));
    }

    public static float calculaDistancia(Robo r1, Robo r2){ // pois não precisa acessar a classe
        return (float) Math.sqrt(Math.pow(r1.x - r2.x, 2) + Math.pow(r1.y - r2.y, 2));
    }

    // private static void mostraDadosRobo(Robo r) {
    //     System.out.println("X: " + r.x + ", Y: " + r.y);
    // }
}
