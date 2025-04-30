public class Semestral extends Aluno {
    // Attributes
    private String semestre;
    private float nota3;
    private float nota4;

    // Constructor
    public Semestral(String nome, String matricula, String anoEntrada, float nota1, float nota2, String semestre, float n3, float n4) {
        super(nome, matricula, anoEntrada, nota1, nota2);
        this.semestre = semestre;
        this.nota3 = n3;
        this.nota4 = n4;
    }

    // Getters and Setters
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    public float getNota4() {
        return nota4;
    }
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    // Methods
    public float calcularMedia() {
        return ((getNota1() + getNota2() + nota4)/3)*0.5f + (nota3*0.5f);
    }

    public String verificarAprovacao() {
        float media = calcularMedia();
        if (media >= 6) {
            return "Aprovado, com nota: " + media;
        } else {
            return "Reprovado, com nota: " + media;
        }
    }
}
