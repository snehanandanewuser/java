class Student{
    String name;
    int age;
    int marks;

    public void getinfo(){

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);

    }

    // constructor - non-parameterized

  /*   Student(){
        System.out.println("constructor called");
    }
        */

    //constructor - paramterized

    Student(String name, int age, int marks){

        this.name = name;
        this.age = age;
        this.marks = marks;


    }
}

public class constructor {

    public static void main(String[] args){
        Student s1 = new Student("Sneha", 19, 84);

        //s1.name = "Sneha";
        //s1.age = 19;
        //s1.marks = 84;
        s1.getinfo();

        Student s2 = new Student("Anshi", 19, 78);

        //s2.name = "Anshi";
        //s2.age = 19;
        //s2.marks = 78;
        s2.getinfo();

    }
}
    
