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
    
    

