package week3.day2.learnlistset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"Adam","Ben","Zara","Adam","Charlie","James","Ben"};
		List<String> name=new ArrayList<String>();
		name.add("Adam");
		name.add("Ben");
		name.add("Zara");
		name.add("Adam");
		name.add("Charlie");
		name.add("James");
		name.add("Ben");
		int size = name.size();
		System.out.println("no of names"  +size);
		
		Set<String> name1=new LinkedHashSet<String>();
		Set<String> dupname= new LinkedHashSet<String>();
		for(String string : name)
		{
			if(!name1.add(string)) {
				dupname.add(string);
			}
		}
		System.out.println(name1);
		System.out.println(dupname);
		
		
		
		
	}
	

}
