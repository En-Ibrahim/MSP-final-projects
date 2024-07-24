/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haneen
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        // Create an Author object
        Author author = new Author(1, "Haneen", "123-456-7890", "haneen@example.com");

        // Print the author's details
        System.out.println("Author Details:");
        System.out.println("ID: " + author.getId());
        System.out.println("Name: " + author.getName());
        System.out.println("Phone: " + author.getPhone());
        System.out.println("Email: " + author.getEmail());

        // Update the author's phone number
        author.setPhone("987-654-3210");
        System.out.println("Updated Phone: " + author.getPhone());

        // Create another Author object
        Author anotherAuthor = new Author(2, "Malak", "555-123-4567", "malak@example.com");

        // Print the another author's details
        System.out.println("\nAnother Author Details:");
        System.out.println("ID: " + anotherAuthor.getId());
        System.out.println("Name: " + anotherAuthor.getName());
        System.out.println("Phone: " + anotherAuthor.getPhone());
        System.out.println("Email: " + anotherAuthor.getEmail());
        
    }
}
      public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
        // Create an Author object
        Author author = new Author(1, "Haneen", "123-456-7890", "haneen@example.com");

        // Create a Book object
        Book book = new Book(1, "The Great Gatsby", "1925-04-10", 1, author);

        // Create another Book object
        Book anotherBook = new Book(2, "The Catcher in the Rye", "1951-07-16", 1, author);

        // Add the second book to the first book's list
        book.addBook(anotherBook);

        // Print the first book's details
        System.out.println("First Book Details:");
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Publishing Date: " + book.getPublishingDate());
        System.out.println("Version: " + book.getVersion());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Embedded Books:");
        book.listBooks();

        // Remove the second book from the first book's list
        book.removeBook(anotherBook.getId());

        // Print the first book's details after removing the second book
        System.out.println("\nFirst Book Details After Removing Embedded Book:");
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Publishing Date: " + book.getPublishingDate());
        System.out.println("Version: " + book.getVersion());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Embedded Books:");
        book.listBooks();

        // Print the second book's details
        System.out.println("\nSecond Book Details:");
        System.out.println("ID: " + anotherBook.getId());
        System.out.println("Title: " + anotherBook.getTitle());
        System.out.println("Publishing Date: " + anotherBook.getPublishingDate());
        System.out.println("Version: " + anotherBook.getVersion());
        System.out.println("Author: " + anotherBook.getAuthor().getName());
    }
}

// keep it and remove other code
    public class Main {
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();

        // Create some Author objects
        Author author1 = new Author(1, "Haneen", "123-456-7890", "haneen@example.com");
        Author author2 = new Author(2, "Malak", "987-654-3210", "malak@example.com");

        // Add the authors to the library
        library.addAuthor(author1);
        library.addAuthor(author2);

        // Create some Book objects
        Book book1 = new Book(1, "The Great Gatsby", "1925-04-10", 1, author1);
        Book book2 = new Book(2, "The Catcher in the Rye", "1951-07-16", 1, author1);
        Book book3 = new Book(3, "Pride and Prejudice", "1813-01-28", 1, author2);

        // Add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Print the authors
        System.out.println("Authors:");

       /*
       // make method in library classs
              
       */
        for (Author author : library.authors) {
            System.out.println("Author ID: " + author.getId());
            System.out.println("Author Name: " + author.getName());
            System.out.println("Author Phone: " + author.getPhone());
            System.out.println("Author Email: " + author.getEmail());
            System.out.println();
        }

        // Print the books
        System.out.println("Books:");
        /*
       // make method in library classs
              
       */
        for (Book book : library.books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Publishing Date: " + book.getPublishingDate());
            System.out.println("Book Version: " + book.getVersion());
            System.out.println("Book Author: " + book.getAuthor().getName());
            System.out.println();
        }

        // Print the books for a specific author
        System.out.println("Books by Author ID 1:");
        library.printAuthorBooks(1);

        // Remove a book
        library.removeBook(2);

        // Print the books again
        System.out.println("Books after removing Book ID 2:");
         /*
       // make method in library classs
              
       */
        for (Book book : library.books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Publishing Date: " + book.getPublishingDate());
            System.out.println("Book Version: " + book.getVersion());
            System.out.println("Book Author: " + book.getAuthor().getName());
            System.out.println();
        }
    }
}
    


    

