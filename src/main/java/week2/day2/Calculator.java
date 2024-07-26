package week2.day2;

public class Calculator 
{
	
	public int addition(int a, int b)
		{
		int add=a+b;
		return add;	
		}
public void subtraction(int x,float y)
{
	float z=x-y;
	System.out.println(z);
}
public void multiply(int i,float j)
{
	float k=i*j;
	System.out.println(k);
	
	}
public void division(int c,int d)
{
	int e=c/d;
	System.out.println(e);
}
	
	
public static void main(String[] args) {
	Calculator cal=new Calculator();
	int addition=cal.addition(3,3);
	System.out.println(addition);
	cal.subtraction(5,2.5f);
	cal.multiply(5,1.5f);
	cal.division(2,2);
}	
	
	
}