import java.util.Scanner;

public class simpleInterest {

    public void interest(float P, float R, float T){

        float Si = (P * R * T)/100;
        System.out.println("The SIMPLE INTEREST IS " + Si);
    }
    public static void main(String[] args){

        simpleInterest SI = new simpleInterest();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of  principal");
        float P = sc.nextInt();

        System.out.println("enter the value of rate");
        float R = sc.nextInt();

        System.out.println("enter the value of time in years");
        float T = sc.nextInt();

        SI.interest(P, R, T);
    }
    
}
