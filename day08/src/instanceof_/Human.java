package instanceof_;

public class Human {
	private String name;
	private int age;
	
	// 생성자를 만들어주세요.
	// name, age를 파라미터로 전달받아 초기화해주세요.
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 만약 void파라미터로 생성자 호출시
	// "noname", 0을 이름과 나이로 초기화하는 생성자를 아래에 정의해주세요.
	public Human() {
		this("noname", 0);
		// this.name = "noname";
		// this.age = 0;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("--------------------");
	}
	
	
	

}
