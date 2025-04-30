public class Atividade3_2 {
    public static void main(String[] args){

        Data d1 = new Data(21, 3, 2025);
        Data d2 = new Data(5, 10, 1624);
        Data d3 = new Data(33, 3, 2025);
        Data d4  = new Data("21/03/2025");

        System.out.println("----- Teste getDia() -----");
        System.out.println("dia d1: " + d1.getDia());
        System.out.println("dia d2: " + d2.getDia());
        System.out.println("dia d3: " + d3.getDia());
        System.out.println("");
        
        System.out.println("----- Teste getMes() -----");
        System.out.println("Mês d1: " + d1.getMes());
        System.out.println("Mês d2: " + d2.getMes());
        System.out.println("Mês d3: " + d3.getMes());
        System.out.println("");

        System.out.println("--- Teste getMesExtenso() ---");
        System.out.println("Mês d1: " + d1.getMesExtenso());
        System.out.println("Mês d2: " + d2.getMesExtenso());
        System.out.println("Mês d3: " + d3.getMesExtenso());
        System.out.println("Mês d4: " + d4.getMesExtenso());
        System.out.println("");

        System.out.println("----- Teste getAno() -----");
        System.out.println("Ano d1: " + d1.getAno());
        System.out.println("Ano d2: " + d2.getAno());
        System.out.println("Ano d3: " + d3.getAno());
        System.out.println("");

        System.out.println("--- Teste getAno2Dig() ---");
        System.out.println("d1: " + d1.getAno2Dig());
        System.out.println("d2: " + d2.getAno2Dig());
        System.out.println("d3: " + d3.getAno2Dig());
        System.out.println("");

        System.out.println("--- Teste isBissexto() ---");
        System.out.println("d1: " + d1.isBissexto());
        System.out.println("d2: " + d2.isBissexto());
        System.out.println("d3: " + d3.isBissexto());
        System.out.println("");

        System.out.println("---- Teste toString() ----");
        System.out.println("d1: " + d1.toString());
        System.out.println("d2: " + d2.toString());
        System.out.println("d3: " + d3.toString());
        System.out.println("");

        System.out.println("---- Teste clone() ----");
        System.out.println("d1: " + d1.clone());
        System.out.println("d2: " + d2.clone());
        System.out.println("d3: " + d3.clone());
        System.out.println("");

        System.out.println("----- Teste compare() -----");
        System.out.println("Comparing d1 and d2: " + d1.compare(d2));
        System.out.println("Comparing d2 and d4: " + d2.compare(d4));
        System.out.println("Comparing d1 and d4: " + d1.compare(d4));
    }
}
