package overload;

public class Human {
	public String name;
	public int age;
	
	// 생성자 오버로딩은 생성자를 여러 유형으로 만드는 것
	// 파라미터는 () ->void 파라미터
	// 				(String, int)
	// 두가지 유형으로 만들게요
	public Human() { //void 파라미터, new Human()인 경우 호출된다
		name = "입력하지 않았습니다.";
		age = 19;
	}
	
	public Human(String n, int a) { // String, int 파라미터, new Human("문자" , 정수)인 경우 호출
		name = n;
		age = a;
	}
}