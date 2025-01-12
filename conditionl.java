import java.util.Scanner;

public class conditionl {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true or false");
        Boolean answer = sc.nextBoolean();
        System.out.println(answer);

        if(answer == true)

            System.out.println("yes");
        else
            System.out.println("no");




    }
    
}
