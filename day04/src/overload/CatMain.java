package overload;

public class CatMain {
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		
		System.out.println(c1.name);
		System.out.println(c1.kind);
		
		c1.Call();
		c1.Call("강앋잉");
		System.out.println("--------------");

		Cat c2 = new Cat("오쿠","초코");

		System.out.println(c2.name);
		System.out.println(c2.kind);
		
		c2.Call();
		c2.Call("댕댕아");
	}
}
