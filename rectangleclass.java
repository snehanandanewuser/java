import java.util.Scanner;
class Rectangle{
    int length;
    int width;

    public void calarea(int A, int B){
        int area = A * B;
        System.out.println(area);
    }

    public void calperi(int A, int B){
        int perimeter = 2*(A + B);
        System.out.println(perimeter);
    }

}

public class rectangleclass {
    public static void main(String[] args){

        Rectangle rec = new Rectangle();


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of length");
        int length = sc.nextInt();

        System.out.println("enter the value of width");
        int width = sc.nextInt();
        
        rec.calarea(length,width);
        rec.calperi(length,width);

    }
    
}
