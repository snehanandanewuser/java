import java.util.Scanner;

public class targetnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("The target number " + target + " occurs " + count + " times in the array.");

        scanner.close();
    }
}
