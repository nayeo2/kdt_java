package overload;

public class HumanMain {

	public static void main(String[] args) {
		// Human을 생성하시되 하나는 void생성자로 만들어주시고
		Human h1 = new Human();
		
		System.out.println("사람의 이름 : " + h1.name);
		System.out.println("사람의 나이 : " + h1.age);
		
		// 다른 하나는 (String, int)생성자를 이용해주세요.
		Human h2 = new Human("자바개발자", 30);
		System.out.println("사람의 이름 : " + h2.name);
		System.out.println("사람의 나이 : " + h2.age);
	}

}
