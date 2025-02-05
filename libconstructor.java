class Book {
    String title;
    String author;
    Double price;
    String Newspaper;

    public void Book(String Newspaper){    
        this.Newspaper = Newspaper;
    }

    public void SetDetails(String T, String author, double price) { // Change int to double
        title = T;
        this.author = author;
        this.price = price;
    }
   
    public void getinfo(){

        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);

    }
}

public class libconstructor {
    public static void main(String[] args) {
        Book book1 = new Book(); 
        
        book1.SetDetails("The Author", "Palo", 1599); 
        book1.getinfo(); 

        Book book2 = new Book();
        book2.SetDetails("The ABC", "Nal", 18999);
        book2.getinfo(); 
        System.out.println("you have to come in library with a newspaper");
    }
}
