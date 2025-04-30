public class Quadrado extends Forma {
    // Atributos
    private float lado;

    // Construtor
    public Quadrado(float lado) {
        this.lado = lado;
    }

    // Método para calcular a área
    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + calcularArea() +
                '}';
    }
}
