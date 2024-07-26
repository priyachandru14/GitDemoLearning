package week2.day2;


import java.util.Arrays;
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {2,6,7,4,8,9,3};
		int length =number.length;
		Arrays.sort(number);
		System.out.println(number[length-2]);
		
		
		
	}

}
