import java.util.LinkedList;
import java.util.List;

public class Principal {

	@SuppressWarnings("unused")
    public static void main(String[] args) {
	
        // Primitive types
		int a = 5, b = 10;
		double d = 10.5;
		char e = 'x';
		boolean f = true;
		
		// String isn't a primitive, but an Object
		String g = "banana";

        System.out.println(g.toUpperCase().charAt(2));
        g = "";
		
		//wrapper class (There's structures, like lists, that do not allow the use of primitive types)
		Integer aa = 10;
		Float cc = 10.5f;
        Double dd = 10.5;
        Character ee = 'a';
        Boolean ff = false;

        aa = a + 10; // I can interact primitives with wrappers
        System.out.println(aa);

        // If i try to create a list of int, it's not allowed (List<int>)
        List<Integer> listInt = new LinkedList<>();

        //--------------------------------------------------------------------------------------------
        
        // Conditionals
        if(a == 30)
            System.out.println("a igual a 3");
        else if (a == 5)
            System.out.println("a igual a 5");
        else
            System.out.print("a não é igual a 3 nem 5");

        // Switch case
        int x = 1;
        switch (x) {
            case 0:
                System.out.println("x é igual a 0");
                break;
            case 1:
                System.out.println("x é igual a 1");
                break;
            default:
                System.out.println("x não é 0 nem 1");
        }

        //--------------------------------------------------------------------------------------------

        // While
        int n = 0;
        while (n<3) {
            System.out.println(n);
            n++;
        }

        // Do while
        n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n < 8);

        // For
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //--------------------------------------------------------------------------------------------

        // Arrays
        int v1[] = new int[5];
        v1[0] = 1;
        v1[1] = 8;
        v1[2] = 5;
        for(int i = 0; i < v1.length; i++){
            System.out.println("v1: " + v1[i]);
        }

        String v2[] = new String[3];
        v2[0] = "string 1";
        v2[1] = "string 2";
        for(int i = 0; i < v2.length; i++){
            System.out.println("v2: " + v2[i]);
        }

        Object v3[] = new String[3];
        
        // Matrices
        int m1[][] = new int[5][4];
        m1[0][0] = 2;
        m1[1][2] = 3;
        m1[4][1] = 4;

        System.out.println(m1.length);
        System.out.println(m1[0].length);

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }

        // Funtions / Métodos
        a = multiply(a, 10);
        System.out.println("Valor de a é: " + a);

        multiplyArray(v1, 5); // doesn't retunr anything once that the multiplication changes the value in the memory
        // So I can use the changed value just accessing the array        
        
    }
        
    static int multiply(int a, int i) {
        return a * i;
    }

    static void multiplyArray(int[] v1, int k) {
        for(int i = 0; 1 < v1.length; i++){
            v1[i] = v1[i] * k;
        }
    }

}