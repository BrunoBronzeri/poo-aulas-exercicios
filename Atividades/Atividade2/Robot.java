public class Robot {
    // Atributtes
    private int id;
    private double coordX;
    private double coordY; 
    
    // Getters and Setters
    public void setId(int id){
        this.id = id;
    }
    public void setCoordX(double coordX){
        this.coordX = coordX;
    }
    public void setCoordY(double coordY){
        this.coordY = coordY;
    }
    public void getId(int id){
        this.id = id;
    }
    public void getCoordX(double coordX){
        this.coordX = coordX;
    }
    public void getCoordY(double coordY){
        this.coordY = coordY;
    }

    // Methods
    public void displays(){
        System.out.println("Robot Id: " + id + " | CoordX: " +
            coordX + " CoordY: " + coordY);
    }
}
