public abstract class Pessoa {
    // Attributes
    protected String nome; // protected means that this attribute can be accessed by subclasses and classes in the same package
    // private would't allow subclasses to access this attribute directly, only through getters and setters or super

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Contructors
    public Pessoa(String nome) {
    }

    // Methods
    public abstract String MostraDados();
}
