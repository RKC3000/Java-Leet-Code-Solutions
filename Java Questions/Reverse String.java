// Write a Java Program to reverse a string without using String inbuilt function.

import java.io.*;
import java.util.*;

public class HelloWorld {
   public static void main(String[] args) {
      String input = "tutorialspoint";
      char[] try1 = input.toCharArray();
      for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);
   }
}
