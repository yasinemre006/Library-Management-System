/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Library library = new Library("My Library", 7);
    Magazine m1 = new Magazine("Science Weekly",532);
    Magazine m2 = new Magazine("Tech Monthly",234);
    
    Book b1 = new Book("Java", "Ali");
    Book b2 = new Book("Python", "Ayse");
    
    ReferenceBook r1 = new ReferenceBook("Dictionary", "John");
    ReferenceBook r2 = new ReferenceBook("Encyclopedia", "Mary");
    System.out.println(library.addItem(m1));
    System.out.println(library.addItem(m2));
    System.out.println(library.addItem(b1));
    System.out.println(library.addItem(b2));
    System.out.println(library.addItem(r1));
    System.out.println(library.addItem(r2));
    
    Book b3 = new Book("C Programming", "Mehmet");
    Book b4 = new Book("Algorithms", "Zeynep");
    
    System.out.println(library.addItem(b3));
    System.out.println(library.addItem(b4));
    
    System.out.println(library.borrowItem("Java"));
    System.out.println(library.borrowItem("Java"));
    
    System.out.println(library.returnItem("Java"));
    System.out.println(library.returnItem("Java"));
    
    System.out.println(library.findItemByTitle("Python"));
    System.out.println(library.findItemByTitle("Unknown Book"));
    
    library.printAllItems();
    try {
    Library invalidLibrary = new Library("Invalid Library", -1);
    } catch (IllegalArgumentException e) {
    System.out.println("Invalid library capacity: " + e.getMessage());    
    }
    try {
    Book invalidBook = new Book("", "Ali");    
    }catch (IllegalArgumentException e) {
    System.out.println("Invalid book: " + e.getMessage());    
    }
    }
    
}
