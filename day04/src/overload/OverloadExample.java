package overload;

public class OverloadExample {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		System.out.println("사람의 이름은 " + h1.name);
		System.out.println("사람의 나이는 " + h1.age);

		Human h2 = new Human("나영", 23); 
		System.out.println("사람의 이름은 " + h2.name);
		System.out.println("사람의 나이는 " + h2.age);
	}

}
