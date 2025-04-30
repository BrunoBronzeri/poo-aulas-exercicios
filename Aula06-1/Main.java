public class Main {
    
    public static void main(String args[]) {
        Circulo c1 = new Circulo(5.0f);
        System.out.println("Área do círculo: " + c1.calcularArea());
        System.out.println("Perímetro do círculo: " + c1.calcularPerimetro());

        Retangulo r1 = new Retangulo(4.0f, 6.0f);
        System.out.println("Área do retângulo: " + r1.calcularArea());
        System.out.println("Perímetro do retângulo: " + r1.calcularPerimetro());

        // Forma f1 = new Circulo(3.0f); // circula only accesses Forma methods
        // Forma f2 = new Retangulo(2.0f, 5.0f); // retangulo only accesses Forma methods
        
        Forma formas[] = new Forma[5];
        formas[0] = new Circulo(3.0f);
        formas[1] = new Retangulo(2.0f, 5.0f);
        formas[2] = c1;
        formas[3] = r1;
        formas[4] = new Circulo(7.0f);

        for (Forma f: formas) { // interface Forma asures that all objects have the same methods
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());
            System.out.println("--------------");
            if(f instanceof Circulo) { // check if the object is an instance of Circulo
                System.out.println("É um círculo!");
                Circulo circulo = (Circulo) f; // cast the object to Circulo type
            }
        }

    }
}
