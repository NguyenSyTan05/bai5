package b5numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class B5NumberGuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1; 
        int guess = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Toi da chon mot so tu 1 den 50. Hay doan xem do la so nao!");

    
        while (guess != numberToGuess) {
            System.out.print("Nhap so ban doan: ");
            
           
            if (scanner.hasNextInt()) { 
                guess = scanner.nextInt(); 

              
                if (guess < numberToGuess) {
                    System.out.println("So cua ban cao hon. Hay thu lai..");
                } else if (guess > numberToGuess) {
                    System.out.println("So cua ban cao thap hon . Hay thu lai.");
                } else {
                    System.out.println("Chuc mung! Ban da doan dung so.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le."); 
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
