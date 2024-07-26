package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int firstnum=0;
		int secondnum=1,sum;
		System.out.println("first number");
		for (int i=1;i<=range;i++)
		{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
			
		}
	}

}
