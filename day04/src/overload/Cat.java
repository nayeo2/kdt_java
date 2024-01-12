package overload;

public class Cat {
	public String name;
	public String kind;

	public Cat() { //void 생성자
		name = "이름을 입력하지 않았습니다";
		kind = "품종이 확인되지 않았습니다.";
	}
	
	public Cat(String n, String k) { //String 생성자
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은 " + n + "입니다.");
	}
	
	public void Call() {
		System.out.println(name + " 이리와");
	}
	
	public void Call(String callName) {
		System.out.println(callName + " 이리와");
	}
}