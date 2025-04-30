public class Longo extends Aluno {
    // Attibutes
    private String duracao;
    private float nota3;

    // Constructors
    public Longo(String nome, String matricula, String anoEntrada, float nota1, float nota2, String duracao, float n3) {
        super(nome, matricula, anoEntrada, nota1, nota2);
        this.duracao = duracao;
        this.nota3 = n3;
    }

    // Getters and Setters
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    // Methods
    public String calculaConceito() {
        float media = (getNota1() + getNota2() + nota3) / 3;

        if (media >= 9.01 && media <= 10) {
            return "A";
        } else if (media >= 7.01 && media <= 9) {
            return "B";
        } else if (media >= 5.01 && media <= 7) {
            return "C";
        } else {
            return "D";
        }
    }

    public String verificaConceito() {
        String conceito = calculaConceito();
        if (conceito.equals("A") || conceito.equals("B")) {
            return "Aprovado, com conceito: " + conceito;
        } else if (conceito.equals("C")) {
            return "Recuperação, com conceito: " + conceito;
        } else {
            return "Reprovado, com conceito: " + conceito;
        }
    }
}
