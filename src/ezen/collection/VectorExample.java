package ezen.collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// ArrayList와 동일한 구조를 가진다.
		// 차이점은 동기화 메소드로 구성되어 있기에 멀티 스레드가 동시에 메소드를 호출할 수 없다. 
		// 멀티 스레드 환경에서 안전하게 데이터를 추가하고 삭제할 수 있다.
		List<String> list = new Vector<>();
		Vector<String> vector = new Vector<>();
		
//		list.add(null); 이거는 비동기. 동시에 담을 수  있음.
		// 동기라서 동시에 못 담음.
		vector.addElement("Java");
		vector.addElement("C");
		vector.addElement("C++");
		
//		list.listIterator();
		Enumeration<String> e= vector.elements();
		while(e.hasMoreElements()) {
			String language = e.nextElement();
			System.out.println(language);
		}
		
		vector.insertElementAt("JavaScript", 1); // 끼워넣기
		String lang = vector.elementAt(1); // 가져오기
		System.out.println(lang);
		
		
	}

}
