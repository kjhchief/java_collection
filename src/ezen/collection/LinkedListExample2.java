package ezen.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 **
 * List와 Queue를 구현한 대표적인 데이터구조이다.
 * @Author 김재훈
 * @Date 2023. 1. 19.
 */
public class LinkedListExample2 {

	public static void main(String[] args) {
		
		
		Queue<Student> queue = new LinkedList<>();
		queue.offer(new Student("aaa", 111, 90));
		queue.offer(new Student("bbb", 222, 70));
		queue.offer(new Student("ccc", 333, 60));
		Student student1 = queue.poll();
		System.out.println(student1.name);
		Student student2 = queue.poll();
		System.out.println(student2.name);
		Student student3 = queue.poll();
		System.out.println(student3.name);
		System.out.println(queue.size());
		
		
	}

}
