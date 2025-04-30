public class Student {
    private String matricula;
    private String nome;
    private float notaP1;
    private float notaP2;
    private float notaTrab;

    // Construtores
    public Student(){
        setMatricula("0000000");
        setNome("Nome não definido");
    }

    public Student(String matricula, String nome){
        setMatricula(matricula);
        setNome(nome);
    }

    public Student(String matricula, String nome, float notaP1, float notaP2, float notaTrab){
        setMatricula(matricula);
        setNome(nome);
        setNotaP1(notaP1);
        setNotaP2(notaP2);
        setNotaTrab(notaTrab);
    }

    // Getters e setters
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNotaP1(float notaP1){
        this.notaP1 = notaP1;
    }
    public void setNotaP2(float notaP2){
        this.notaP2 = notaP2;
    }
    public void setNotaTrab(float notaTrab){
        this.notaTrab = notaTrab;
    }

    public void getMatricula(String matricula){
        this.matricula = matricula;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    public void getNotaP1(float notaP1){
        this.notaP1 = notaP1;
    }
    public void getNotaP2(float notaP2){
        this.notaP2 = notaP2;
    }
    public void getNotaTrab(float notaTrab){
        this.notaTrab = notaTrab;
    }

    // Métodos
    public float getMedia(){
        float media = notaP1*0.25f + notaP2*0.25f + notaTrab*0.5f;
        System.out.println("O Aluno(" + matricula + "): " + nome + "teve média: " + media);
        return media;
    }

    public float getNotaRec(){
        float rec = 12 - (notaP1*0.25f + notaP2*0.25f + notaTrab*0.5f);
        if(rec >= 6.25 && rec <= 8.5 ){
            System.out.println("Para ser aprovado é preciso tirar " + rec + " na rec.");
            return rec;
        }
        else if(rec > 8.5){
            System.out.println("O aluno " + nome + " não tem média suficiente para fazer rec");
            return -1;
        }
        else{
            System.out.println("O aluno está aprovado!");
            return 0;
        }
    }
}
