import java.util.InputMismatchException;
import java.util.Scanner;

public class DivZeroException {
    
    // Demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possível divisão por zero
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please anter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please anter an integer denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = quotient(numerator, denominator);
            System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
        } catch (ArithmeticException e) {
            System.out.printf("%nException: %s%n", e.getMessage());
            System.out.println("You can't divide by zero!");
        } catch(InputMismatchException e) {
            System.out.println("%nException: " + e.getMessage());
        }finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}
