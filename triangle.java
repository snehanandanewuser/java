import java.util.Scanner;


public class triangle {
    public void areaoftriangle(int h, int b){
        
        int area = (h * b)/2;
        System.out.println(area);
    }

    public static void main(String[] args) {

        triangle area = new triangle();
         
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the height");
        int height = sc.nextInt();

        System.out.println("Enter the value of the base");
        int base = sc.nextInt();

        area.areaoftriangle(height,base);

    }
    
}
