import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        int v[] = {10,3,6,4,2,0,9,1,2,3,4,5};
        
        System.out.println(Arrays.toString(v));

        Arrays.sort(v);
        System.out.println(Arrays.toString(v));

        // Returns negative when index indicates the position where the element would be inserted *(-1)
        System.out.println(Arrays.binarySearch(v, 5));
        System.out.println(Arrays.binarySearch(v, 7));

        // Object array
        Pessoa pessoas[] = new Pessoa[5];
        pessoas[0] = new Pessoa(3, "Lucas", 20);
        pessoas[1] = new Pessoa(6, "Ana", 25);
        pessoas[2] = new Pessoa(1, "João", 30);
        pessoas[3] = new Pessoa(4, "Maria", 35);
        pessoas[4] = new Pessoa(2, "Pedro", 40);

        System.out.println(Arrays.toString(pessoas));

        Arrays.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                if(p1.getCodigo() > p2.getCodigo()) {
                    return 1;
                } else if(p1.getCodigo() < p2.getCodigo()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(pessoas));

        Comparator<Pessoa> comparaIdade = new Comparator<Pessoa>() {
            @Override
                public int compare(Pessoa p1, Pessoa p2) {
                    if(p1.getIdade() > p2.getIdade()) {
                        return 1;
                    } else if(p1.getIdade() < p2.getIdade()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        };

        System.out.println("-------------------------------------");
        Arrays.sort(pessoas, comparaIdade);
        System.out.println(Arrays.toString(pessoas));

        System.out.println("-------------------------------------");
        Arrays.sort(pessoas);
        System.out.println(Arrays.toString(pessoas));

        // System.out.println("-------------------------------------");
        // Arrays.sort(pessoas, );
        // System.out.println(Arrays.toString(pessoas));
        
    }
}
