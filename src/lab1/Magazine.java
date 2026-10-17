/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Lenovo
 */
public class Magazine extends LibraryItem {
private final int issueNumber;
public Magazine(String title, int issueNumber){
super(title);
if(issueNumber<1){
throw new IllegalArgumentException("Issue number can not be smaller than 1. ");    
}
this.issueNumber=issueNumber;
}
public int getIssueNumber() {
return issueNumber;
    }
@Override
public int getLoanPeriodDays() {
return 7;    
}
@Override
public String toString(){
return super.toString() +", " + "Issue Number: "+ issueNumber;
}
    
}
