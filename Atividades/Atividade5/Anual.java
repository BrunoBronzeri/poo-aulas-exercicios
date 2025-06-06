public class Anual extends Aluno {
    // Attributes
    private String ano;
    private float nota3;
    private float nota4;

    // Constructor
    public Anual(String nome, String matricula, String anoEntrada, float nota1, float nota2, String ano, float n3, float n4) {
        super(nome, matricula, anoEntrada, nota1, nota2);
        this.ano = ano;
        this.nota3 = n3;
        this.nota4 = n4;
    }

    // Getters and Setters
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
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

    // Methos
    public float calcularMedia() {
        return ((getNota2() + nota4)/2)*0.8f + ((getNota1() + nota3)/2)*0.2f;
    }

    public String verificarAprovacao() {
        float media = calcularMedia();
        if (media >= 7) {
            return "Aprovado, com nota: " + media;
        } else {
            return "Reprovado, com nota: " + media;
        }
    }
}
