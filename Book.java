public class Book {
    // 2. Instance variables
    String title;
    String author;
    int pages;

    // 3. Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 4. Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages);
    }

    public static void main(String[] args) {
        // 5. Create two Book objects
        Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 208);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        // 6. Call the displayBookInfo method for each object
        System.out.println("Book 1 Details:");
        book1.displayBookInfo();

        System.out.println("\nBook 2 Details:");
        book2.displayBookInfo();
    }
}