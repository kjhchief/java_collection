package ezen.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 일상생활의 책꽂이처럼 순서가 있고, 데이터 중복을 허용하는 데이터 구조 Collection을 상속받은 List 인터페이스 Set인터페이스를
 * 구현한 대표적 클래스: ArrayList, Vector
 * 
 * @Author 김재훈
 * @Date 2023. 1. 19.
 */
public class ListExample {
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정";

		// 제네릭 사용 (Java5 이상)
		// 유연하고,데이터 타입에 안전하다.
		List<Object> list = new ArrayList<>();

		boolean ok = list.add(name);
		ok = list.add("김재훈");
		System.out.println(ok);
		list.add(in);
		list.add(today);
		list.add(random);
		list.add(name2);

		// 전체 목록 조회
		Iterator<Object> iter = list.iterator(); // 1.4v이전 스타일
//		System.out.println(iter);		
		while (iter.hasNext()) { // 다음꺼가 있을 때
			Object n = iter.next(); // 다음?
			System.out.println(n);
			// 담긴 순서와 목록 출력 순서가 같다.
		}
		// foreach
		for (Object obj : list) {
			System.out.println(obj);
		}

		int count = list.size();
		System.out.println("담겨진 개수: " + count);

		boolean empty = list.isEmpty();
		System.out.println(empty);

		boolean exist = list.contains("김기정");
		exist = list.contains(today);
		System.out.println(exist);

		boolean remove = list.remove("김기정");
		System.out.println(remove);

		System.out.println(list.size());

		list.clear();
		System.out.println(list.size());

		Set<String> smallSet = new HashSet<>();
		smallSet.add("김재훈");
		smallSet.add("이대한");
		smallSet.add("김정석");
		smallSet.add("박찬울");

		list.addAll(smallSet);
		System.out.println(list.size());
		list.removeAll(smallSet);
		System.out.println(list.size());

		list.clear();

		// List에 추가된 메소드
		list.add("박지성");
		list.add("손흥민");
		list.add("박찬호");
		list.add("박세리");
		list.add("김연아");
		System.out.println(list.get(1));
		list.set(2, "김기정");
		Iterator<Object> l = list.iterator();
		while (l.hasNext()) {
			Object object = l.next();
			System.out.println(object);

		}

		Object obj = list.remove(2);
		if (obj == null) {
			System.out.println("삭제하려는 데이터가 없습니다.");
		} else {
			System.out.println(obj + "삭제하였습니다.");
		}
		
		List<Object> list2= list.subList(1, 3);
		System.out.println(list2); //디버깅 차원에서 자기가 갖고있는거 한 번에 보여줌.

	}

}
