public class Atividade2 {
    public static void main(String[] args){
        Robot r1 = new Robot();
        Robot r2 = new Robot();

        r1.setId(0);
        r1.setCoordX(12.4);
        r1.setCoordY(8.45);

        r2.setId(1);
        r2.setCoordX(8.45);
        r2.setCoordY(12.4);

        r1.displays();
        r2.displays();
    }
}
