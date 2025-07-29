package pbl;

class Author {
    String Name;
    String email;
    char gender;

    Author(String Name, String email, char gender) {
        this.Name = Name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}

class Book1 {
    String Name;
    Author author;   
    double Price;
    int stock;

    Book1(String Name, Author author, double Price, int stock) {
        this.Name = Name;
        this.author = author;
        this.Price = Price;
        this.stock = stock;
    }

    public String getName() {
        return Name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return Price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

public class book {
    public static void main(String[] args) {
        Author a1 = new Author("Megha", "megha22@gmail.com", 'F');
        Book1 b1 = new Book1("Java Programming", a1, 2000, 10);
        System.out.println("Book Name: " + b1.getName());
        System.out.println("Author: " + b1.getAuthor().getName());
        System.out.println("Author Email: " + b1.getAuthor().getEmail());
        System.out.println("Price: " + b1.getPrice());
        System.out.println("Stock: " + b1.getStock());
    }
}
