package week2.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,6,7,8};
		int length=array.length;
		Arrays.sort(array);
		for(int i=0;i<=array.length;i++)
		{
			if(array[i]!=(array[i]+1))
			{
				System.out.println(array[i]);
				break;
			}
		}
	}

}
