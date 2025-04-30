public class Data {
    // Attributes
    private int day;
    private int month;
    private int year;
    // private String date;
    
    // Contructor
    public Data(int day, int month, int year) {
        if(isDataValid(day, month, year)){
            setDay(day);
            setMonth(month);
            setYear(year);
        } else {
            setDay(1);
            setMonth(1);
            setYear(1);
        }
    }

    public Data(String date) {
        String[] parts = date.split("/");
        if (parts.length == 3) {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            if((day > 0 && day <= 31) && (month > 0 && month <= 12) && (year >= 0)){
                setDay(day);
                setMonth(month);
                setYear(year);
            } else {
                setDay(1);
                setMonth(1);
                setYear(1);
            }
        } else {
                setDay(1);
                setMonth(1);
                setYear(1);
        }
    }

    public Data(int year) {
        this(1, 1, year);
    }

    // Getters and Setters
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    // Methods
    public boolean isDataValid(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }
    
        int[] diasNoMes = { 31, (isBissexto(year) ? 29 : 28), 31, 30, 31, 30, 
                            31, 31, 30, 31, 30, 31 };
    
        return day <= diasNoMes[month - 1];
    }

    public String getDia(){
        // System.out.println("Dia: " + (day < 10 ? "0" + day : day));
        return ("" + (day < 10 ? "0" + day : day));
    }

    public String getMes(){
        // System.out.println("Mês: " + (month < 10 ? "0" + month : month));
        return (""+(month < 10 ? "0" + month : month));
    }

    public String getMesExtenso(){
        String[] months = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (month >= 1 && month <= 12) return months[month - 1];
        else return "-Mês Inválido";
        
    }

    public String getAno(){
        // System.out.println("Ano: " + (year < 1000 ? (year < 100 ? (year < 10 ? "000" : "00") : "0"): "") + year);
        return("" + (year < 1000 ? (year < 100 ? (year < 10 ? "000" : "00") : "0"): "") + year);
    }

    public String getAno2Dig(){
        return String.format("%02d", year % 100);
    }

    public boolean isBissexto(){
        // System.out.println("É bissexto: "+ ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)));
        return isBissexto(this.year);
    }

    public boolean isBissexto(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String toString(){
        // System.out.println(getDia() + "/" + getMes() + "/" + getAno());
        return(getDia() + "/" + getMes() + "/" + getAno());
    }

    public Data clone(){
        return new Data(getDay(), getMonth(), getYear());
    }

    public int compare(Data other) {
        if (this.year == other.year && this.month == other.month && this.day == other.day) {
            return 0;
        } else if (this.year > other.year || (this.year == other.year && this.month > other.month) || 
                   (this.year == other.year && this.month == other.month && this.day > other.day)) {
            return 1;
        } else {
            return -1;
        }
    }
}
