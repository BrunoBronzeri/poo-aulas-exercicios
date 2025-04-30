public class Circulo extends Forma {
    // Atributos
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", area=" + calcularArea() +
                '}';
    }
    
}
