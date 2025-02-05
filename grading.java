import java.util.Scanner;

class Grade{

public int average(int m1, int m2, int m3){

    int avg = (m1 + m2 + m3)/3;
    
    if(avg>=90){
        System.out.println("GRADE - A");
    }
    else if(avg<90 && avg>=75){
        System.out.println("GRADE - B");
    }
    else if(avg<75 && avg>=50){
        System.out.println("GRADE - C");
    }
    else{
        System.out.println("GRADE - F");
    }

    return avg;

}

}

public class grading {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("enter the marks for maths");
        int m1 = sc.nextInt();
        System.out.println("enter the marks of english");
        int m2 = sc.nextInt();
        System.out.println("enter the marks of science");
        int m3 = sc.nextInt();
        
        int result = grade.average(m1,m2,m3);
        System.out.println("THE TOTAL AVERAGE IS " + result);
    }
    
}
