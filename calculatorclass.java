import java.util.Scanner;

class calculatorclass {


    public void addnum(int A, int B){
        int sum = A+B;
        System.out.println(sum);
    }
    public static void main(String[] args)
    {

         calculatorclass calc = new calculatorclass();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int number1 = sc. nextInt();
        System.out.println(number1);

        System.out.println("Enter value of B");
        int number2 = sc. nextInt();
        System.out.println(number2);

        calc.addnum(number1, number2);
        

    }
    
}
