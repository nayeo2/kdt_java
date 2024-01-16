package this_;

public class Human {
	public String name;
	public int age;
	
	// 생성자 선언을 해 주시되, name, age를 입력받아 대입해주세요.
	// 변수 이름은 name, age로 해 주세요.
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드 오버로딩으로 이름만 입력받는 생성자 정의
	public Human(String name) {
		this(name, 0);
		//this.name = name;
		//this.age = 0;
	}
	
	// 아무것도 입력하지 않았을때, name에는 "이름없음", age에는 -1이 대입되는
	// void 생성자를 정의해주세요. 위쪽처럼, 한 줄 한 줄 구문으로 대입하는 코드와
	//this() 를 활용해 기본값을 넣어주는 케이스 둘 다 선언해주시고
	// 주석처리를 해 주세요.
	public Human() {
		this("이름없음", -1);
		//this.name = "이름없음";
		//this.age = -1;
	}
	
	public void showInfo() {
		System.out.println(
			"이름 : " + this.name + ", 나이 : " + this.age);
	}
	
}



