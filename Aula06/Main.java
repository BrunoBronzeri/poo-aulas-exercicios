public class Main {

    private static int x = 10;
    public static void main(String args[]) {
        Robo r1 = new Robo(10,5);
        System.out.println(Robo.qntde);

        Robo r2 = new Robo(10,57);
        System.out.println(Robo.qntde);

        System.out.println(r1.calculaDistanciaParaOutroRobo(r2));
        System.out.println(Robo.calculaDistancia(r1, r2));


        // mostraDadosRobo(r1);

        // private static void mostraDadosRobo(Robo r1) {
        //     x++;
        // }
    }
} 