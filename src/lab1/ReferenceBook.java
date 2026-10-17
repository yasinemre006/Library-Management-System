/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public class ReferenceBook extends Book {
public ReferenceBook(String title, String author) {
super(title, author);    
}

public ReferenceBook(String title, String author, String isbn) {
super(title, author, isbn); 
    }
@Override
public int getLoanPeriodDays() { 
return 0;   
}
}
