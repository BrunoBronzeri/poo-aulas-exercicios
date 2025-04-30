public class DataHora {
    //Atributtes
    Data data;
    Hora hora;

    // Constructor
    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto, segundo);
    }
    public DataHora(int dia, int mes, int ano){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(0, 0, 0);
    }
    public DataHora(int hora, int minuto){
        this.data = new Data(1, 1, 1);
        this.hora = new Hora(hora, minuto, 0);
    }
    public DataHora(Data data, Hora hora){
        this.data = data;
        this.hora = hora;
    }

    // Getters and Setters
    public void setData(Data data){
        this.data = data;
    }
    public void setHora(Hora hora){
        this.hora = hora;
    }

    public Data getData(){
        return this.data;
    }
    public Hora getHora(){
        return this.hora;
    }

    // Methods
    public String toString() {
        return String.format("%02d/%02d/%04d %02d:%02d:%02d",
                Integer.parseUnsignedInt(String.valueOf(data.getDay())), Integer.parseInt(data.getMes()), Integer.parseInt(data.getAno()),
                hora.getHora(), hora.getMinuto(), hora.getSegundo());
    }

    public DataHora clone() {
        Data clonedData = new Data(this.data.getDay(), this.data.getMonth(), this.data.getYear());
        Hora clonedHora = new Hora(this.hora.getHora(), this.hora.getMinuto(), this.hora.getSegundo());
        return new DataHora(clonedData, clonedHora);
    }
}
