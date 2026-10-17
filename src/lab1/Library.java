/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public class Library {
private final String name; 
private final LibraryItem[] items; 
private int size; 
public Library(String name, int capacity){
this.name=name;
this.items= new LibraryItem [capacity];
this.size=0;

}
 public boolean addItem(LibraryItem item){
 if(item==null){
  return false;
 }
 if(size>=items.length){
 return false;    
 }
 for(int i=0; i<size; i++){
 if(items[i].getTitle().equals(item.getTitle())){
  return false;   
 }
 }
 items[size]=item;
 size++;
 return true;
 }public LibraryItem findItemByTitle(String title){
 if(title==null || title.isBlank() ) {
  return null;   
 }
 for(int i=0; i<size; i++){
 if(items[i].getTitle().equals(title)){
 return items[i];    
 }    
 }
 return null;
 }public boolean borrowItem(String title) {
  LibraryItem item = findItemByTitle(title);
  if(item==null){
   return false;   
  }
  return item.borrow();
 }public boolean returnItem(String title) {
  LibraryItem item = findItemByTitle(title);
  if(item==null){
  return false;    
  }
  return item.returnItem();
 }public int countAvailableItems() {
  int count = 0;
  for(int i=0; i<size; i++){
  if (items[i].getStatus()== ItemStatus.AVAILABLE) {
  count++;    
      
  }    
  }
  return count;
 }
  public int getSize(){
  return size;    
  }public void printAllItems(){
   for (int i = 0; i < size; i++) {
    System.out.println(items[i].toString());    
   }    
  }
}
