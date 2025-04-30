public class Funcionario {
    // Attributes
    private int code;
    private String name;
    private float workedHours;
    private float hourValue;

    // Constructor
    public Funcionario(){ // Constructor default. I can change whatever I want
        this.name = "Name Default"; // or empty
    }

    public Funcionario(int code){ // the parameter differs constructors (if there's code, execute this one)
        // this.code = code; // possible as well
        setCode(code);
    }

    public Funcionario(int code, String name){ // the parameter differs constructors (if there's code, execute this one)
        // this.code = code; // possible as well
        // this.name;
        setCode(code);
        setName(name);
    }

    // Setters and getters
    public void setCode(int code){
        this.code = code; // 'this' indicates which one is the attribute (same of self from python)
    }
    public int getCode(){
        return code;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setWorkedHours(float workedHours){
        this.workedHours = workedHours;
    }
    public float getWorkedHours(){
        return workedHours;
    }

    public void setHourValue(float hourValue){
        this.hourValue = hourValue;
    }
    public float getHourValue(){
        return hourValue;
    }

    // Methods
    public float calcSal(){
        return workedHours * hourValue;
    }

    public void mostra(){
        System.out.println("Codigo: " + code + " Nome: " +
            name + " Salario: " + calcSal());
    }
}
