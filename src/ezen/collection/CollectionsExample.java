package ezen.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 콜렉션과 관련된 공통 메소드를 제공하는 유틸리티 클래스
 * @Author 김재훈
 * @Date 2023. 1. 25.
 */
public class CollectionsExample {

	public static void main(String[] args) {
		Integer[] scores = {88, 70, 100, 60, 85};
		List<Integer> list = Arrays.asList(scores); // 배열을 리스트로 변환! 짱이다
//		List<Integer> list = Arrays.asList(88, 70, 100, 60, 85);

//		List<Integer> list = new ArrayList<>();
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		Integer max= Collections.max(list);
		Integer min= Collections.min(list);	
		System.out.println(max);
		System.out.println(min);
		
//		Collections.shuffle(list);
//		System.out.println(list.toString());
		
		// 오름차순 정렬. 꿀이네.
		Collections.sort(list); 
		System.out.println(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("훈재훈");
		list2.add("김재훈");
		list2.add("박재훈");
		list2.add("James");
		list2.add("Adam");
		Collections.sort(list2);
		System.out.println(list2);
		
		List<Student> list3 = new ArrayList<>();
		list3.add(new Student("영희", 20, 100));
		list3.add(new Student("Jack", 30, 85));
		list3.add(new Student("철수", 10, 70));
		// 문제는 Student 같은 객체는 뭐가 큰지 작은지 어떤 기준으로 아는가? 여기서 LinkedListExample 가서 compareTo 재정의.
//		Collections.sort(list3);
		// 학생 이름으로 정렬
//		Collections.sort(list3, new NameComparator());
		Collections.sort(list3, new Comparator<Student>() { // NameComparator 익명 클래스
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		
//		Collections.sort(list3, new ScoreComparator());
		Collections.sort(list3, new Comparator<Student>() { // ScoreComparator 익명 클래스. 일회용.
			@Override
			public int compare(Student s1, Student s2) {
				return s1.score - s2.score;
			};
		});
		
		System.out.println(list3.toString());
		
	}

}
