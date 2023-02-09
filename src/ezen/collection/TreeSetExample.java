package ezen.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		set.add("김기정");
		set.add("박기정");
		set.add("이기정");
		set.add("최기정");
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
			
		}
	}

}
