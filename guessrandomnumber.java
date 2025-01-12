import java.util.Scanner;

public class guessrandomnumber {
    public static void main(String[] args) {
        // MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100); // Random number between 1 and 100
        int userNumber = 0;

        do {
            System.out.print("Guess my number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        } while (userNumber >= 0);

        System.out.println("My number was: " + myNumber);
        sc.close(); // Close the scanner to avoid resource leaks
    }
}

