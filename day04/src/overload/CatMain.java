package overload;

public class CatMain {

	public static void main(String[] args) {
		// void생성자로 생성한 고양이
		Cat c1 = new Cat();
		
		System.out.println(c1.kind);
		System.out.println(c1.name);
		
		c1.call();
		c1.call("야옹이");
		System.out.println("------------------");
	
		Cat c2 = new Cat("폴드", "룰루");
		System.out.println(c2.kind);
		System.out.println(c2.name);
		c2.call();
		c2.call("댕청이");
		System.out.println("-------------------");
	}

}
