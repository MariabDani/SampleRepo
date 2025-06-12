package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1= new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		System.out.println("set s1 "+s1);
		Iterator obj=  s1.iterator();//creating object for the iterator
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		obj.remove();
		System.out.println("set s1 "+s1);
		for(Integer s:s1)
		{
			System.out.println(s);
		}
	//int[] a1= new int[5];
	int a[]= {11,12,13,14};
	//for(datatype variablename : 
	for(int b:a)
	{
		System.out.println(b);
	}
}

}
