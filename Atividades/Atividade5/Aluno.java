public class Aluno {
    // Attributes
    protected String nome;
    protected String matricula;
    protected String anoEntrada;
    protected float nota1;
    protected float nota2;

    // Constructor
    public Aluno(String nome, String matricula, String anoEntrada, float nota1, float nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoEntrada = anoEntrada;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getAnoEntrada() {
        return anoEntrada;
    }
    public void setAnoEntrada(String anoEntrada) {
        this.anoEntrada = anoEntrada;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    // Method
    // public String verificarAprovacao()
}