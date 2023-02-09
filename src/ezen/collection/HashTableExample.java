package ezen.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
//		Map<Integer, String> map = new Hashtable<>(); 이렇게 하면 동기화 못 씀
		Hashtable<Integer, String> map = new Hashtable<>(); // 이러면 동기화 사용
		map.put(1, "홍길동");
		map.put(2, "김기정");
		
		// 1에 밸류 있는지 확인
		if (map.containsKey(1)) {
			System.out.println("존재하는 키 입니다ㅣ.");
		} else {
			map.put(1, "강감찬");
		}
		
		map.put(1, "강감찬"); // 홍길동 덮어쓰기 됨
		
		String name = map.get(1);
		System.out.println(name); //덮어지는지 확인
	}

}
