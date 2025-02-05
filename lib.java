class Book {
    String title;
    String author;
    Double price;

    public void SetDetails(String title, String author, double price) { // Change int to double
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Display() {  // Fix method name and return type
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class lib {
    public static void main(String[] args) {
        Book book1 = new Book(); // Fix "mew" to "new"
        book1.SetDetails("The Author", "Palo", 1599); 
        book1.Display(); // Fix method call
        
        Book book2 = new Book();
        book2.SetDetails("The ABC", "Nal", 18999);
        book2.Display(); // Should call book2.Display(), not book1.Display()
    }
}

