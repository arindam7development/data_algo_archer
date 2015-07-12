package code_practice;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Father Charles Goes Down And Ends Battle";
		// Put it in the stack frontward
		Stack myStack = new Stack( );
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens( )) myStack.push(st.nextElement( ));
		// Print the stack backward
		System.out.print('"' + s + '"' + " backwards by word is:\n\t\"");
		while (!myStack.empty( )) {
		System.out.print(myStack.pop( ));
		System.out.print(' ');
		}
		System.out.println('"');
		

	}

}
