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
public class SetExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String name = "김기정";
		Integer in = new Integer(30);
		Calendar today = Calendar.getInstance();
		Random random = new Random();
		String name2 = "김기정";

//		Object[] objs = new Object[4];
//		objs[0]= name;

		// Set이 제네릭 인터페이스인데 제네릭 사용 X (Java4 이전 사용 방법)
		@SuppressWarnings("rawtypes")
		Set set = new HashSet();
		boolean ok = set.add(name);
		System.out.println(ok);

		set.add(in);
		set.add(today);
		set.add(random);
		set.add(name2);

		// 전체 목록 조회
		Iterator iter = set.iterator(); // 1.4v이전 스타일
//		System.out.println(iter);		
		while (iter.hasNext()) {
			Object element = iter.next();
			if (element instanceof String) {
				String n = (String) element;
				System.out.println(n.toString());
			} else if (element instanceof Integer) {
				Integer i = (Integer) element;
				System.out.println(i);
			} else if (element instanceof Calendar) {
				Calendar c = (Calendar) element;
				System.out.println(c);
			} else if (element instanceof Random) {
				Random r = (Random) element;
				System.out.println(r);
			}
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
		
		Set smallSet = new HashSet();
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
