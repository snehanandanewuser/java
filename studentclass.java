 class Student{
    String name;
    int age;
    int marks;

    public void getinfo(){

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);

    }

}
public class studentclass {
    
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Sneha";
        s1.age = 19;
        s1.marks = 84;
        s1.getinfo();

        Student s2 = new Student();

        s2.name = "Anshi";
        s2.age = 19;
        s2.marks = 78;
        s2.getinfo();

    }
}
