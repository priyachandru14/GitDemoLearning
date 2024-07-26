package week2.day1;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input="TestLeaf";
			
			int count =0;
			char[] charArray = input.toCharArray();
			for (int i=0;i<charArray.length;i++)
			{
				if(input.charAt(i)=='e')
				{
					count++;
				}
			}	System.out.println("no of e in testleaf is"  +count);	
	}

}
