public class Atividade1 {
    
    public static void main(String[] args){

        int A[] = {1, 3, 5, 6, 8, 9};
        int M[][] = new int[6][6];
        int sum = 0;

        System.out.println("Vetor A: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.println("Matriz M: ");
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                M[i][j] = A[i]*A[j];
                System.out.print(M[i][j] + "\t");
                sum = sum + M[i][j];
            }
            System.out.println();
        }
        System.out.println("Soma dos elementos da matriz: " + sum);
        
        float avg = average(M);
        System.out.println("Média dos valores da matriz M: " + avg);
        
        sum = 0;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                if(M[i][j] > avg){
                    sum = sum + M[i][j];
                }
            }
        }
        System.out.println("Soma dos valores da matriz M maiores que a média: " + sum);
        
    }

    private static float average(int[][] m) {

        float sum = 0.0f;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                sum = sum + m[i][j];
            }
        }
        return sum/(m.length*m[0].length);
    }

}
