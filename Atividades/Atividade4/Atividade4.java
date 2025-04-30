public class Atividade4 {
    public static void main(String[] args){
        DataHora dh1 = new DataHora(32, 12, 2022, 12, 30, 45);
        DataHora dh2 = new DataHora(10, 3, 1998);
        DataHora dh3 = new DataHora(12, 30);
        DataHora dh4 = new DataHora(new Data(21, 5, 2025), new Hora(15, 40, 15));

        System.out.println("------- Teste DataHora -------");
        System.out.println(dh1.toString());
        System.out.println(dh2.toString());
        System.out.println(dh3.toString());
        System.out.println(dh4.toString());

        System.out.println("------- Teste Clone (4th date) -------");
        DataHora dh5 = dh4.clone();
        System.out.println(dh5.toString());

        System.out.println("------- Teste Student Complete -------");
        Student aluno1 = new Student("2021000001", "João", 8.5f, 7.5f, 9.0f, 10, 3, 2015);
        Student aluno2 = new Student("2021000002", "Maria", 6.5f, 5.5f, 7.0f, 15, 5, 2001);
        Student aluno3 = new Student("2021000003", "José", 7.5f, 6.5f, 8.0f, 20, 7, 1877);
        Student aluno4 = new Student("2021000004", "Ana", 5.5f, 4.5f, 6.0f, 25, 9, 2003);
        Student aluno5 = new Student("2021000005", "Carlos", 4.5f, 3.5f, 5.0f, 30, 11, 1994);
        Student aluno6 = new Student("2021000006", "Marta", 3.5f, 2.5f, 4.0f, 5, 1, 2005);

        System.out.println("Aluno 1: " + aluno1.getNome() + "\nMédia: " + aluno1.getMedia()
            + (aluno1.getNotaRec() > 0 ? "\nNota Rec: " + aluno1.getNotaRec() : "") + "\nNascimento: " + aluno1.dataNasc.toString());
        System.out.println("--------------------------");
        System.out.println("Aluno 1: " + aluno5.getNome() + "\nMédia: " + aluno5.getMedia()
            + (aluno5.getNotaRec() > 0 ? "\nNota Rec: " + aluno5.getNotaRec() : "") + "\nNascimento: " + aluno5.dataNasc.toString()); 

        System.out.println("--------- Test List Students ---------");
        Turma T1 = new Turma("20210001", "Turma 1");
        T1.adicionaAluno(aluno1);
        T1.adicionaAluno(aluno2);
        T1.adicionaAluno(aluno3);
        T1.adicionaAluno(aluno4);
        T1.adicionaAluno(aluno5);
        T1.adicionaAluno(aluno6);

        System.out.println("Existem " + T1.getCount() + " alunos na turma.");
        System.out.print("Alunos da turma: " + T1.mostraAlunos());

        System.out.println("--------- Students Average ----------");
        for (Student aluno : T1.getAlunos()) {
            if (aluno != null) {
                System.out.println("Aluno: " + aluno.getNome() + " - Média: " + aluno.getMedia());
            }
        }

        System.out.println("--------- Test List Approved Students ----------");
        System.out.println("Alunos aprovados: " + T1.mostraAlunosAprovados());

    }
}
