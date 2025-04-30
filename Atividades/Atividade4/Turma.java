public class Turma {
    // Atributtes
    private String codigoTurma;
    private String nomeTurma;
    Student alunos[] = new Student[50];
    private int count = 0;

    //Constructor
    public Turma(String codigoTurma, String nomeTurma){
        setCodigoTurma(codigoTurma);
        setNomeTurma(nomeTurma);
    }

    // Getters and Setters
    public void setCodigoTurma(String codigoTurma){
        this.codigoTurma = codigoTurma;
    }
    public void setNomeTurma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }

    public String getCodigoTurma(){
        return this.codigoTurma;
    }
    public String getNomeTurma(){
        return this.nomeTurma;
    }
    public Student[] getAlunos(){
        return this.alunos;
    }
    public int getCount(){
        return this.count;
    }

    // Methods
    public void adicionaAluno(Student aluno){
        // for(int i = 0; i < alunos.length; i++){ // CRIAR ATRIBUTO COUNT PARA INDEXAR VETOR E NAO PERCORRER TODA VEZ E TER O COUNT FÁCIL
        //     if(alunos[i] == null){
        //         alunos[i] = aluno;
        //         System.out.println("Aluno " + alunos[i].getNome());
        //         break;
        //     } else System.out.println("Deu Broken");
        // }
        if (count < 50) {
            alunos[count] = aluno;
            count++;
        } else
            System.out.println("Turma cheia, não é possível adicionar mais alunos.");
    }

    public int getNumAlunos(){
        return alunos.length;
    }

    public String mostraAlunos(){
        String result = "";
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                result += alunos[i].getNome() + "\n";
            }
        }
        return result;
    }

    public String mostraAlunosAprovados(){
        String result = "";
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                if(alunos[i].getNotaRec() == 0){
                    result += alunos[i].getNome() + "\n";
                }
            }
        }
        return result;
    }
}
