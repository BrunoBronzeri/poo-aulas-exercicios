public class TestaVeiculos {
    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[5];
        veiculos[0] = new Caminhao("C002", "Caminhão 2", 7000, 15, 200, 6);
        veiculos[1] = new Moto("M002", "Moto 2", 250, 7, 80, 200);
        veiculos[2] = new Bicicleta("B001", "Bicicleta 1", 100, 3, 20, true);
        veiculos[3] = new Automovel("A001", "Automóvel 1", 5, 5, 60, true);
        veiculos[4] = new Onibus("O001", "Onibus 1", 50, 30, 10, 100, 4);

        for (Veiculo v : veiculos) {
            v.imprimeDados();
            System.out.println("Fator de custo locação: " + v.fatorCustoLocacao());
            System.out.println();
        }

        // Criação de objetos
        // Veiculo veiculo1 = new Caminhao("C001", "Caminhão 1", 5000, 10, 100, 4);
        // Veiculo veiculo2 = new Moto("M001", "Moto 1", 200, 5, 50, 150);
        
        // // Impressão dos dados dos veículos
        // veiculo1.imprimeDados();
        // System.out.println("Fator de custo locação: " + veiculo1.fatorCustoLocacao());
        
        // System.out.println();
        
        // veiculo2.imprimeDados();
        // System.out.println("Fator de custo locação: " + veiculo2.fatorCustoLocacao());

        // Testar veículos com desconto
        System.out.println("-------------------------------");
        System.out.println("Veiculo com desconto:");

        IFatorCustoDesconto[] locaveis = new IFatorCustoDesconto[2];
        locaveis[0] = new Automovel("A002", "Automovel 2", 5, 5, 60, true);
        locaveis[1] = new Bicicleta("B002", "Bicileta 2", 1, 3, 20, true);

        int quantidadeVeiculosLocados = 6; // Exemplo de quantidade de veículos locados

        for (int i = 0; i < locaveis.length; i++) {
            Veiculo v = (Veiculo) locaveis[i]; // Convertendo para Veiculo para imprimir dados
            v.imprimeDados();
            System.out.println("Fator custo locacao COM desconto (" + 
                                quantidadeVeiculosLocados + " veiculos): " + 
                                locaveis[i].fatorCustoLocacaoComDesconto(quantidadeVeiculosLocados));
            System.out.println();
        }
    }
}
