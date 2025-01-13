import java.util.Scanner;

class Range {
    public void perRange(Scanner sc) {
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter start number:");
        int start = sc.nextInt();
        System.out.println("Enter end number:");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Invalid Range. Enter Again.");
            return; // Exit the method
        }

        for (int i = start; i <= end; i++) {
            System.out.println("Square of " + i + " is: " + (i * i));
            sum += i;

            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Sum of numbers in range: " + sum);
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}

class Maths {
    public void perMaths(Scanner sc) {
        int randomNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
        System.out.println("Random number is: " + randomNumber);

        System.out.println("Enter number:");
        double number = sc.nextDouble();
        System.out.println("Enter base:");
        double base = sc.nextDouble();

        double logWithBase = Math.log(number) / Math.log(base);
        System.out.println("Logarithm of " + number + " with base " + base + " is: " + logWithBase);

        System.out.println("Enter angle in degrees:");
        double angleInDegrees = sc.nextDouble();
        double angleInRadians = Math.toRadians(angleInDegrees);

        System.out.println("Sine: " + Math.sin(angleInRadians));
        System.out.println("Cosine: " + Math.cos(angleInRadians));
        System.out.println("Tangent: " + Math.tan(angleInRadians));
    }
}

public class rangeandmaths {
    public static void main(String[] args) {
        Range range = new Range();
        Maths maths = new Maths();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Your Choice:");
            System.out.println("1. Perform Range Operations");
            System.out.println("2. Perform Maths Operations");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    range.perRange(sc);
                    break;
                case 2:
                    maths.perMaths(sc);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close(); // Close the scanner to release resources
    }
}
