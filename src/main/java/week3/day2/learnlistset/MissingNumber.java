package week3.day2.learnlistset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,4,3,4,5,7,8,5,9,10};
		Set<Integer> value=new TreeSet<Integer>();
		for(int i=0;i<=num.length-1;i++)
		{
			value.add(num[i]);
		}
		for (int j=0;j<value.size();j++)
		{
			if(!value.contains(j))
			{
				System.out.println(j);
			}
		}
		
		
	}

}
