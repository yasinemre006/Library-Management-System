/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public abstract class LibraryItem implements Borrowable {
private String title; 
private ItemStatus status;
protected LibraryItem(String title){
if(title==null || title.trim().isEmpty()){
   throw new IllegalArgumentException("Title can not be null or empty. ");
}
this.title=title;
this.status = ItemStatus.AVAILABLE;
}
public String getTitle() {
        return title;
    }
public void setTitle(String title) {
        this.title = title;
    }
public ItemStatus getStatus(){
return status;    
}
public boolean borrow(){
if(status == ItemStatus.AVAILABLE){
status = ItemStatus.BORROWED;
return true;
}
return false;
}
 public boolean returnItem(){
 if(status == ItemStatus.BORROWED){
 status = ItemStatus.AVAILABLE; 
 return true;
 }
 return false;
 }
 public boolean isAvailable() {
 if(status == ItemStatus.AVAILABLE){
 return true;    
 }else{
 return false;
 }    
 }public abstract int getLoanPeriodDays();
  public String toString(){
  return "Title: "+title+ ", "+ "Status: "+ status;    
  }     
 



    
}
