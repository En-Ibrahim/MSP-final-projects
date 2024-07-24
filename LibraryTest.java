/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Haneen
 */
public class LibraryTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
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

    /**
     * Test of addAuthor method, of class Library.
     */
    @Test
    public void testAddAuthor() {
        System.out.println("addAuthor");
        Class1.Author author = null;
        Library instance = new Library();
        instance.addAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthor method, of class Library.
     */
    @Test
    public void testRemoveAuthor() {
        System.out.println("removeAuthor");
        int id = 0;
        Library instance = new Library();
        instance.removeAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAuthor method, of class Library.
     */
    @Test
    public void testPrintAuthor() {
        System.out.println("printAuthor");
        int id = 0;
        Library instance = new Library();
        instance.printAuthor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAuthorBooks method, of class Library.
     */
    @Test
    public void testPrintAuthorBooks() {
        System.out.println("printAuthorBooks");
        int id = 0;
        Library instance = new Library();
        instance.printAuthorBooks(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class Library.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        Library instance = new Library();
        instance.addBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBook method, of class Library.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        int id = 0;
        Library instance = new Library();
        instance.removeBook(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    

