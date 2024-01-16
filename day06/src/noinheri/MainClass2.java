package noinheri;

public class MainClass2 {
	public static void main(String[] args) {
		// 전사 생성
		Warrior w1 = new Warrior("자바개발자");
		// 상태 조회
		w1.showStatus();
		
		// 쥐 생성
		Rat r1 = new Rat();
		
		// 쥐와 교전(3번)
		for(int i = 0; i < 3; i++) {
			w1.huntRat(r1);
		}
		
		// 상태조회
		w1.showStatus();
	}
}
