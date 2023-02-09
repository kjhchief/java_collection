package ezen.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		// database.properties(환경설정파일)의 내용을 읽기 위해 
		Properties prop = new Properties();
		// //두 개 쓰는 이유는 이스케이프 문자. 아니면 / 한개만 쓰기.
		String config = "database.properties";
		try {
			// 절대경로 사용
			// prop.load(new FileInputStream("C:\\ezen-academy\\workspace\\java_collection\\src\\ezen\\collection\\database.properties"));
			// 상대 경로 사용
			// 나중에 Reflection API에서 상세히 설명
			prop.load(PropertiesExample.class.getResourceAsStream(config));
			System.out.println(prop);
			// 파일 내용 읽기
			String driver = prop.getProperty("driver");
			String username = prop.getProperty("username");
			System.out.println(driver);
			System.out.println(username);
			
			// 파일 내용 수정(메모리 상에서만 수정)
			prop.put("userpassword", "kjh");
			prop.store(new FileOutputStream("src/ezen/collection/" + config), "update comment!");
			System.out.println("설정파일 저장 완료!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
