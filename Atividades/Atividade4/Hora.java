public class Hora {
    // Atributtes
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Hora(int hora, int minuto, int segundo) {
        if(isHoraValid(hora, minuto, segundo)){
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        } else {
            setHora(0);
            setMinuto(0);
            setSegundo(0);
        }
    }

    // Getters and Setters
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }
    public int getMinuto() {
        return this.minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }

    // Methods
    public boolean isHoraValid(int hora, int minuto, int segundo) {
        return (hora >= 0 && hora < 24) && (minuto >= 0 && minuto < 60) && (segundo >= 0 && segundo < 60);
    }
}
