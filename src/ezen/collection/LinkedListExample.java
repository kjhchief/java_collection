package ezen.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		List<Student> list = new LinkedList<>();
		list.add(new Student("김기정", 1, 90));
		list.add(new Student("박기정", 2, 85));
		list.add(new Student("최기정", 3, 100));
		for(int i=4; i<120000; i++) {
			list.add(new Student("학생"+i, i, 90));
		}
		
//		Iterator<Student> iter = list.iterator();
//		while (iter.hasNext()) {
//			Student student = iter.next();
//			System.out.println(student.name);
//		}
		
		for (Student student : list) {
			System.out.println(student.name);
		}
		
		long start = System.currentTimeMillis();
		// 추가 삭제
		list.add(1, new Student("박찬울", 1004, 100));
		list.remove(100);
		list.remove(200);
		list.remove(300);
		list.remove(400);
		list.remove(500);
		Student s= list.get(1);
		System.out.println(s.name);
		
		long end = System.currentTimeMillis();
		long runtime= end-start;
		System.out.println("수행시간: "+runtime);
		
	}

}
