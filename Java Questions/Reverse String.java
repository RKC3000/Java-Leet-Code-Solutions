// Write a Java Program to reverse a string without using String inbuilt function.

import java.util.*;
public class ReverseString {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   
  String str = sc.nextLine();
  String revString = "";

  for (int i = str.length() - 1; i >= 0; --i) {
   revString += str.charAt(i);
  }

  System.out.println(revString);
 }
}
