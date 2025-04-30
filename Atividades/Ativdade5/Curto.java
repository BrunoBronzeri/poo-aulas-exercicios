public class Curto extends Aluno {
    // Attributes
    private String mes;
    
    // Constructor
    public Curto(String nome, String matricula, String anoEntrada, float nota1, float nota2, String mes) {
        super(nome, matricula, anoEntrada, nota1, nota2);
        this.mes = mes;
    }

    // Methods
    public float calcularMedia() {
        return (getNota1() + getNota2()) / 2;
    }

    public String verificarAprovacao() {
        float media = calcularMedia();
        if (media >= 5) {
            return "Aprovado, com nota: " + media;
        } else {
            return "Reprovado, com nota: " + media;
        }
    }
}
