package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ExList = new ArrayList<String>();
		ExList.add("Aa");
		ExList.add("Bb");
		ExList.add("Cc");
		ExList.add("Dd");
		System.out.println("list"+ExList);
		System.out.println("get "+ ExList.get(1));
		ExList.set(3,"dD");
		System.out.println("set "+ExList);
		ExList.add("bB");
		ExList.add("Cc");
		System.out.println("list "+ExList);
		System.out.println("index of cC"+ExList.indexOf("cC"));
		System.out.println("index of Cc "+ExList.indexOf("Cc"));
		System.out.println("lastindex of cC "+ExList.lastIndexOf("cC"));
		System.out.println("lastindex of Cc "+ExList.lastIndexOf("Cc"));
		ExList.remove(5);
		ExList.remove("Cc");
		System.out.println("remove list "+ExList);
		System.out.println("contains "+ExList.contains("Ff"));
		System.out.println("isempty "+ExList.isEmpty());
		System.out.println("size "+ExList.size());
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(21);
		l.add(23);
		System.out.println("new list "+l);
		l.remove(2);
		System.out.println("new list "+l);
		
		
		
	}

}
