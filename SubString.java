package code_practice;

import java.util.Scanner;

public class SubString {

	public static void main(String args[])
	   {
	      String string, sub;
	      int i, c, length;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to print it's all substrings");
	      string  = in.nextLine();
	 
	      length = string.length();  
	      int n =0;
	 
	      System.out.println("Substrings of \""+string+"\" are :-");
	 
	      for( c = 0 ; c < length ; c++ )
	      {
	         for( i = 1 ; i <= length - c ; i++ )
	         {
	            sub = string.substring(c, c+i);
	            n++;
	            System.out.println(sub);
	         }
	      }
	   System.out.println("Total"+" "+n+" "+"substrings");
	   }
	

}
