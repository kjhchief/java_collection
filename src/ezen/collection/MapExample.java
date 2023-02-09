package ezen.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Key와 Value의 쌍으로 데이터 저장
 * @Author 김재훈
 * @Date 2023. 1. 19.
 */
public class MapExample {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new TreeMap<String, String>();
		map.put("1", "김기정");
		map.put("2", "김혀나");
		map.put("3", "김히원");
		map.put("4", "동후니");
		
		for(int i=5; i<100000; i++) {
			map.put(i+"", "아무개" + i);
		}
		
		System.out.println(map.size());
		
		String name = map.get("9999");
		System.out.println(name);
		
		Set<String> keySet =  map.keySet();
		Iterator<String> iter= keySet.iterator();
		while(iter.hasNext()) {
			String 학번 = iter.next();
			System.out.println(학번);
		}
		
		Collection<String> values = map.values();
		Iterator<String> iter2= values.iterator();
		while (iter2.hasNext()) {
			String 이름 = iter2.next();
			System.out.println(이름);
			
		}
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter3= set.iterator();
		while (iter3.hasNext()) {
			Entry<String, String> entry =  iter3.next();
			System.out.println(entry);
//			entry.getKey();
//			entry.getValue();
		}
		
		
	}
}
