/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public class Book extends LibraryItem {
private final String author ;
private final String isbn; 

public Book(String title, String author){
 super(title);
if(author==null || author.trim().isEmpty()){
throw new IllegalArgumentException("Author can not be null or empty.");

}
this.author=author;
this.isbn = null;

}public Book(String title, String author, String isbn) {
super(title);
if(author==null || author.trim().isEmpty()){
throw new IllegalArgumentException("Author can not be null or empty.");    
}
this.author=author;
if(isbn==null || isbn.trim().isEmpty()){
throw new IllegalArgumentException("Isbn can not be null or empty.");    
}
this.isbn=isbn;
}
public String getAuthor() {
        return author;
    }
public String getIsbn() {
        return isbn;
    }
@Override
public int getLoanPeriodDays(){
 return 21;       
    }
@Override
public String toString(){
return super.toString() + ", " +"Author: "+ author+ " ,"+ "Isbn: "+ isbn;
}


}
