package ezen.collection;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 일상생활의 보따리처럼 순서가 없고, 데이터 중복을 허용하지 않는 데이터 구조 Collection을 상속받은 Set 인터페이스.
 * Set인터페이스를 구현한 대표적 클래스: HashSet, TreeSet
 * 
 * @Author 김재훈
 * @Date 2023. 1. 19.
 */
public class SetExample2 {
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정";
		// 실전에서 저장은 객체(Account, MinusAccount 등)를 저장할 것.

//		Object[] objs = new Object[4];
//		objs[0]= name;

		// 제네릭 사용 (Java5 이상)
		// 유연하고,데이터 타입에 안전하다.
		Set<String> set = new HashSet<>();
		

		boolean ok = set.add(name);
		ok = set.add("김재훈");
		System.out.println(ok);

		// 전체 목록 조회
		Iterator<String> iter = set.iterator(); // 1.4v이전 스타일
//		System.out.println(iter);		
		while (iter.hasNext()) {
			String n = iter.next();
			System.out.println(n);
		}
		
		System.out.println("-------------------------");
		// 향상된 for문 활용
		for(String str : set) {
			System.out.println(str);
		}
		
		int count = set.size();
		System.out.println("담겨진 개수: " + count);
		
		boolean empty= set.isEmpty();
		System.out.println(empty);
		
		boolean exist = set.contains("김기정");
		exist = set.contains(today);
		System.out.println(exist);
		
		boolean remove= set.remove("김기정");
		System.out.println(remove);
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set.size());
		
		Set<String> smallSet = new HashSet<>();
		smallSet.add("김재훈");
		smallSet.add("이대한");
		smallSet.add("김정석");
		smallSet.add("박찬울");
		
		set.addAll(smallSet);
		System.out.println(set.size());
		set.removeAll(smallSet);
		System.out.println(set.size());
		
	}

}
