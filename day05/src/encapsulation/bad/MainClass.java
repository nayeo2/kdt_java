package encapsulation.bad;

public class MainClass {

	public static void main(String[] args) {
		// 같은 패키지 내부 클래스파일을 가져다 쓸 때는 import구문이 필요없음
		MyBirthday b = new MyBirthday();
		
		b.year = 2024;
		b.month = 13; // 13월을 넣어도 그냥 받아들임
		b.day = 32; // 32일을 넣어도 동작함
		
		b.showDateInfo();
	}
}
