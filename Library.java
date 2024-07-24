/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Haneen
 */
public class Library {
    // Library.java

    private ArrayList<Class1.Author> authors;
    private ArrayList<Class1.Book> books;

    public Library() {
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addAuthor(Class1.Author author) {
        authors.add(author);
    }

    public void removeAuthor(int id) {
        authors.removeIf(author -> author.getId() == id);
    }

    public void printAuthor(int id) {
        for (Class1.Author author : authors) {
            if (author.getId() == id) {
                System.out.println("Author Name: " + author.getName());
                System.out.println("Author Phone: " + author.getPhone());
                System.out.println("Author Email: " + author.getEmail());
                break;
            }
        }
    }

    public void printAuthorBooks(int id) {
        for (Class1.Author author : authors) {
            if (author.getId() == id) {
                for (Class1.Book book : books) {if (book.getAuthor().getId() == id) {
                        System.out.println("Book Title: " + book.getTitle());
                        System.out.println("Book Publishing Date: " + book.getPublishingDate());
                        System.out.println("Book Version: " + book.getVersion());
                    }
                }
                break;
            }
        }
    }

    public void addBook(Class1.Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}    


    

