package week2.day2;
import java.util.Arrays;
public class PrintDuplicatesInArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println("length of the array is " +length);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
			count++;
			}}
			if(count==1)
			{
				System.out.println(arr[i]);
				count=0;
			}
		}}
		
		
		
	}


