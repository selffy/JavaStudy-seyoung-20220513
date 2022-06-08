package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가
		
		studentMap.put(0,"김준일");
		studentMap.put(10,"김준이");
		studentMap.put(22,"김준삼");
		studentMap.put(3,"김준사");
		studentMap.put(4,"김준오");
		
		//키값이 중복될 수 없음. 키값이 한번이라도 중복되면 제일 마지막 값으로 덮어씌어짐.
		

		System.out.println(studentMap);
		
		System.out.println(studentMap.get(0)); //key로 value 가져오기
		
		studentMap.put(10, "김준육");  //put: 키값에 있는 value의 값을 바꿔줌. x값이 없을 경우 추가가 됨.
		studentMap.replace(11, "김준칠");  //수정할 때 사용.
		
		studentMap.remove(10);

		//이름이 김준일인 것이 있으면 가지고 오는 것
	
		Iterator<Integer> iterator = studentMap.keySet().iterator(); //키값들을 set형태로 바꿔줌.
		while(iterator.hasNext()) { 
						//값이 있으면
			int key = iterator.next();
			String value = studentMap.get(key);
			if(value.equals("김준오")) {
				System.out.println(studentMap.get(key));
			}
			System.out.println(value);
		}
				
		//람다식(함수형 프로그래밍)	: 함수 그 자체를 값으로 넣는 것.
		studentMap.forEach( 								//foreach: 메소드.			
				(k, v) -> {							//익명함수: 함수명이 없음.					
			System.out.println("key: " + k);		// void를 생략할 수 있는 이유: return이 없음.
			System.out.println("value: " + v);
		}
	);
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
		//containskey/value : 안에 이 값이 들어있는지 없는지 확인

	}

}
