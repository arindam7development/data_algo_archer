package code_practice;

import com.sun.xml.internal.ws.util.StringUtils;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = " hello DGSJkhello djladfjhello ";
		String findStr = "hello";
		str.trim();
		/*str.replaceAll(" ","");*/
		str.replaceAll("\\s+", "AND");	
		System.out.print(str);
		/*int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);*/

	}

}
