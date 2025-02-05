import java.util.Scanner;
//inheritence
class Guest{
    public void read(){
       System.out.println("read only");
    }

}

class Developer{
public void write(){
    System.out.println("write only");
}
}

class Admin{
public void manager(){
    System.out.println("manage also");

    Guest guest = new Guest();
    Developer developer = new Developer();

   developer.write();
   guest.read();
}
}


public class assignment2 {
    public static void main(String[] args){

    
       Scanner sc = new Scanner(System.in);

       Guest guest = new Guest();
       guest.read();
       Developer developer = new Developer();
       developer.write();
       Admin admin = new Admin();
       admin.manager();
    }
    
}
