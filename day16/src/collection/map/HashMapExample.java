package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<key, value>
		Map<String, Integer> map = new HashMap<>();
		
		// Map에 객체를 저장 put(key, value)
		map.put("치킨", 30000);
		map.put("양꼬치", 50000);
		map.put("랍스터", 120000);
		
		// 중복된 key로 입력시, 가장 마지막에 넣은 하나만 적용됨
		map.put("치킨", 25000);
		
		System.out.println(map);
		
		// Map에 저장된 key, value쌍(entry) 의 개수 측정 : size()
		System.out.println(map.size());

		// Map에 저장된 value값을 key값으로 얻기 getkey)
		int price = map.get("랍스터"); // Integer price = map.get("랍스터"); 도 가능
		System.out.println("랍스터의 가격 : " + price + "원");
		
		// Map에서 Key만 전부 추출하기
		// 앞서 배운 Set 형식으로 추출됩니다.
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		// Iterator로 변경해서 저장
		Iterator<String> kIter = kSet.iterator();// Set에서 배운거 복습
		System.out.println("-----------------");
		
		// Iterator를 while문으로 반복시켜, 모든 메뉴의 값을 콘솔에 찍어보세요.
		// XX 메뉴의 가격은 YY원 입니다.
		while(kIter.hasNext()) {
			String menu = kIter.next();
			// menu변수로 가격을 얻어오면 더 좋습니다.
			price = map.get(menu);
			System.out.println(menu + "메뉴의 가격은 " + price + "원 입니다.");
		}
		
		// Map 내부에 있는 key값의 유무를 확인 containsKey();
		String food = "라멘";
		
		if(map.containsKey(food)) {
			System.out.println("우리식당 " + food + " 팝니다.");
		}else {
			System.out.println("우리식당 " + food + " 안 팝니다.");
		}
		
		// Map 내부 데이터 단일데이터 삭제 remove(key)
		// 일치하는 key값에 매칭된 entry 한 쌍을 삭제
		map.remove("랍스터");
		System.out.println(map);
		
		// Map 내부 전체 데이터 일괄삭제 clear()
		map.clear();
		
		System.out.println(map);
		
		if(map.isEmpty()) {
			System.out.println("빈 Map입니다.");
		}else {
			System.out.println("비어있지 않은 Map입니다.");
		}
	}

}
