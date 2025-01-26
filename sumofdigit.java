import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find sum of the digits");
        int number = sc.nextInt();
        int sum = 0;
        while(number!=0){
            int lastdigit = number%10;
            sum = sum + lastdigit;
            number = number/10;
        }
        System.out.println("Sum of digits are" + sum);
    }
    
}
