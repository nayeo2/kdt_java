package class_;

public class Dog {
	// 이름, 나이, 품종, 털색
	public String name;
	public int age;
	public String kind;
	public String color;
	
	// 클래스 정의용 클래스 파일 내부 메서드는 static을 붙이지 않는다.
	// 이제 변수와 메서드가 같은 소속이므로 레퍼런스 주소를 붙이지 않아도 된다.
	
	public void showDogInfo() {
		System.out.println("강아지의 이름 : " + name);
		System.out.println("강아지의 나이 : " + age);
		System.out.println("강아지의 품종 : " + kind);
		System.out.println("강아지의 털색 : " + color);
	}

}
