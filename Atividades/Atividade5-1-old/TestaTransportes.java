public class TestaTransportes {
    public static void main(String[] args) {
        Transporte[] transportes = new Transporte[5];

        transportes[0] = new Bicicleta("B01", "Bicicleta Urbana", 100, 2, 10, true);
        transportes[1] = new Moto("M01", "Moto 125cc", 150, 3, 20, 125);
        transportes[2] = new Automovel("A01", "Carro Sedan", 4, 50, 5, true);
        transportes[3] = new Onibus("O01", "Ônibus Urbano", 8, 100, 50, 45, 2);
        transportes[4] = new Caminhao("C01", "Caminhão Baú", 3000, 5, 60, 3);

        for (Transporte t : transportes) {
            t.imprimeDados();
        }
    }
}