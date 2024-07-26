package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Priyadharshini";
		String rev="";
		System.out.println(rev);
		int length = name.length();
		System.out.println(length);
		 //convert string into Character Array
		char[] charArray = name.toCharArray();
		for (int i=charArray.length-1;i>=0;i--)
		{
			rev=rev+charArray[i];
			
		}
		System.out.println("original String :" +name);
		System.out.println("reversed String :"  +rev);
		
	}

}
