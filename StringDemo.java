package code_practice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//str1.toLowerCase().contains(str2.toLowerCase()
		String str1 = "Bangalore is lovely Bangalore";
		String str2 = "Bangalore" ;
		
		boolean result = str1.toLowerCase().contains(str2.toLowerCase()) ;	
		int i = str1.indexOf("Bangalore") ;
		System.out.print(result+""+i);
		
	}

}
