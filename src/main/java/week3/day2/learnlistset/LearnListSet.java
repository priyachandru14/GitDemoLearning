package week3.day2.learnlistset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnListSet {
	public static void main(String[] args) {
		
		
		List<Integer> listValue=new ArrayList<Integer>();
		listValue.add(3);
		listValue.add(5);
		listValue.add(4);
		listValue.add(5);
		listValue.add(6);
		int size = listValue.size();
		System.out.println("Size of the integer"  +size);
		int count =0;
		for (int i=0;i<size;i++)
		{
			if(listValue.get(i)==5)
			{
						count++;
			}
			System.out.println(listValue.get(i));
		}System.out.println("duplicate number count " +count);
		
		System.out.println("==========================");
		Set<Integer> num=new HashSet<Integer>();
		num.add(3);
		num.add(6);
		num.add(8);
		num.add(4);
		num.add(2);
		System.out.println(num);
		int size2 = num.size();
		System.out.println("sixe of the number"  +size2);
		
		
		
		
	}
	
			
	}


