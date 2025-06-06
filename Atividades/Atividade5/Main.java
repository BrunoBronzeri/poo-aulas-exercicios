public class Main {
    public static void main(String[] args){
        Aluno a1 = new Aluno("João", "12345", "2020", 7.5f, 8.0f);

        Curto aluno1 = new Curto("Maria", "54321", "2021", 6.0f, 7.0f, "Janeiro");
        Semestral aluno2 = new Semestral("Ana", "09876", "2023", 8.0f, 9.0f, "1 semestre", 7.5f, 8.5f);
        Anual aluno3 = new Anual("Pedro", "11223", "2024", 6.5f, 7.5f, "2024", 8.0f, 9.0f);
        Longo aluno4 = new Longo("Carlos", "67890", "2022", 5.0f, 6.0f, "2 anos", 7.5f);

        // Exibindo os dados dos alunos
        System.out.println("Aluno (curto): " + aluno1.getNome() + ", Ano de entrada: " + aluno1.getAnoEntrada() + ", Situação: " + aluno1.verificarAprovacao() + "\n");
        System.out.println("Aluno (Semestral): " + aluno2.getNome() + ", Ano de entrada: " + aluno2.getAnoEntrada() + ", Situação: " + aluno2.verificarAprovacao() + "\n");
        System.out.println("Aluno (Anual): " + aluno3.getNome() + ", Ano de entrada: " + aluno3.getAnoEntrada() + ", Situação: " + aluno3.verificarAprovacao() + "\n");
        System.out.println("Aluno (Longo): " + aluno4.getNome() + ", Ano de entrada: " + aluno4.getAnoEntrada() + ", Situação: " + aluno4.verificaConceito() + "\n");
    }
}