import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int count = 0;
    
        while(count<n){
            System.out.println(first);
            int third = first + second;
            first =second;
            second = third;

            count ++;     
        }
    }
    
}
