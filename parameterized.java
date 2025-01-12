class Person {
    String name;
    int age;

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;  // Assigning the value of the parameter 'name' to the instance variable 'name'
        this.age = age;    // Assigning the value of the parameter 'age' to the instance variable 'age'
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class parameterized {
    public static void main(String[] args) {
        // Create an object of the Person class using the parameterized constructor
        Person person1 = new Person("John", 25);

        // Display the details of the person
        person1.displayDetails();

        // Create another object of the Person class using the parameterized constructor
        Person person2 = new Person("Alice", 30);

        // Display the details of the second person
        person2.displayDetails();
    }
    
}
