package code_practice;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String count[] = {"Arindam","Mishra","Bangalore"};
		
	     Set<String> set = new HashSet<String>();
	     
	        for(int i = 0; i<=count.length; i++){
	           set.add(count[i]);
	        }
	        System.out.println(set);*/
		 Set<String> set = new HashSet<String>();
		 set.add("Arindam");
		 set.add("Mishra");
		 set.add("Bangalore");
		 set.add("Bangalore is lovely");
		 set.add("I am a software engineer");
		 System.out.println(set) ;
		 boolean r = set.contains("Bangalore is lovely");
		 
		 System.out.println(r) ;
	}

}
