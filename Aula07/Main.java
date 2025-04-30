public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Forma c1 = new Circulo(3);
        Forma q1 = new Quadrado(5);

        // Exibição das áreas
        System.out.println(c1.calcularArea());
        System.out.println(q1.calcularArea());

        // Upcasting happens implicitly
        Forma f = c1;

        // Downcasting needs to be explicit
        Circulo c2 = (Circulo) f;

        Forma f2 = new Quadrado(5);

        Forma formas[] = new Forma[4];
        formas[0] = c1;
        formas[1] = c2;
        formas[2] = new Circulo(6);
        formas[3] = new Quadrado(7);

        System.out.println("------------------");

        for(Forma forma : formas) {
            System.out.println(forma.toString());
        }
    }
}