public class Main {
    
    public static void main(String args[]) {
        Soma s1 = new Soma(5.0f, 3.0f);
        System.out.println(s1.mostraOpName() + " (" + s1.mostraOpSimbolo() + "): " + s1.calcula());

        Subtracao s2 = new Subtracao(5.0f, 3.0f);
        System.out.println(s2.mostraOpName() + " (" + s2.mostraOpSimbolo() + "): " + s2.calcula());

        Multipplicacao s3 = new Multipplicacao(5.0f, 3.0f);
        System.out.println(s3.mostraOpName() + " (" + s3.mostraOpSimbolo() + "): " + s3.calcula());

        Divisao s4 = new Divisao(5.0f, 3.0f);
        System.out.println(s4.mostraOpName() + " (" + s4.mostraOpSimbolo() + "): "  + s4.calcula());

        // IOperacaoMatematica s5 = new IOperacaoMatematica(5.0f, 3.0f); // This line will cause an error since IOperacaoMatematica is an interface and cannot be instantiated.


    }
}