/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberpyramid;



      import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua kim tu thap: ");
        int n = scanner.nextInt();

        System.out.println("Kim tu thap so:");
        
        // Vòng lặp bên ngoài để kiểm soát số hàng
        for (int i = 1; i <= n; i++) {
            // Vòng lặp bên trong để in số trên mỗi hàng
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Xuống dòng sau khi in xong mỗi hàng
        }

        scanner.close(); // Đóng đối tượng scanner
    }
}

    