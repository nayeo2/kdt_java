package instanceof_;

public class MainClass {

	public static void main(String[] args) {
		// Human, Student, Cat 인스턴스를 생성해보겠습니다.
		Human h1 = new Human("김자바", 20);
		h1.showInfo();
		
		Student s1 = new Student("태국인", 19);
		s1.showInfo();
		
		Cat c1 = new Cat("룰루", 6);
		c1.meow();
		
		System.out.println(h1 instanceof Human);// h1이 Human기반인가
		System.out.println(s1 instanceof Human);// s1이 Human기반인가
		// 관련이 아예 없는 객체간 비교는 에러 발생
		//System.out.println(h1 instanceof Cat);
		//System.out.println(s1 instanceof Cat);
	}

}
