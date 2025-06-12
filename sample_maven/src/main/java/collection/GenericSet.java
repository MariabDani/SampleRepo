package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new HashSet<String>();
		s.add("Blue");
		s.add("green");
		s.add("yellow");
		System.out.println("set "+s);
		//s.get(2); not available;
		//s.set(1,"green") not available
		//s.indexOf("green"); not available
		//s.lastIndexOf("green"); not available
		s.add("green");
		s.add("orange");
		Set<String> s1= new HashSet<String>();
		s1.add("AA");
		s1.add("BB");
		s.addAll(s1);
		System.out.println("set "+s);
		s.remove("yellow");
		System.out.println("set "+s);
		System.out.println("contains blue"+ s.contains("blue"));
		System.out.println("isempty "+s.isEmpty());
		System.out.println("size "+s.size());
		Set<String> s2= new HashSet<String>();
		System.out.println("containsall s1 "+s.containsAll(s1));
		System.out.println("set "+s2);
		System.out.println("containsall s2 "+s.containsAll(s2));
		s2.add("black");
		System.out.println("containsall s2 "+s.containsAll(s2));
		System.out.println("containsall s2 "+s2.containsAll(s));
		Set<String> s3= new HashSet<String>();
		s3.add("aa");
		s3.add("bb");
		s3.add("cc");
		System.out.println("set 3"+s3);
		s3.clear();
		System.out.println("set 3"+s3);
		
	}

}
