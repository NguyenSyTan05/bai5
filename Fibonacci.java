
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Nguyen Sy Tan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen duong.");
        } else {
            System.out.print("Day Fibonacci voi " + n + " phan tu: ");

            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " "); 

              
                int next = a + b;
                a = b;
                b = next;
            }
        }

        scanner.close();
    }
}
    

