public class Atividade3 {
    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student("20201432", "Bruno Teste");
        Student s3 = new Student("20204055", "Bruno Teste1", 9, 8.5f, 10);
        Student s4 = new Student("20201856", "Bruno Teste2", 6, 7.5f, 4);

        s3.getMedia();
        s4.getMedia();
        System.out.println("-----------------------------");
        s1.getNotaRec();
        s2.getNotaRec();
        s3.getNotaRec();
        s4.getNotaRec();

    }
}
