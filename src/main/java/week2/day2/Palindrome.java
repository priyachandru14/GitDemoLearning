package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34343;
		int rem=0;
		int sum= 0,temp;
		temp=num;		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
		System.out.println("not a palindrome number");
		}  
}}
