package week3.day1.polymorphism;

public class Calculator {

	 
		public void add(int a,int b, int c)
		{	int d=a+b+c;
			System.out.println(d);
		}
		public void add(int a,int b)
		{	 int c=a+b;
			System.out.println(c);
		}
		public void add(double i,double j)
		{	double k=i+j;
			System.out.println(k);
		}
		public void add(double n,int m)
		{	double o=n+m;
			System.out.println(o);
		}
public static void main(String[] args) {
	Calculator cal= new Calculator();
	cal.add(10, 20, 30);
	cal.add(10, 20);
	cal.add(12.5d, 13.7d);
	cal.add(12.5d, 23);
	
}
}
