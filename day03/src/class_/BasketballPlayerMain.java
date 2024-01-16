package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수 2명을 만들어주시고 정보를 조회하는 코드를 작성해주세요.
		BasketballPlayer b1 = new BasketballPlayer("곱창덮밥", 180, 15, 3000);
		//b1.name = "곱창덮밥";
		//b1.age = 15;
		//b1.height = 180;
		//b1.salary = 3000;
		
		BasketballPlayer b2 = new BasketballPlayer("마라쌀국수", 200, 20, 20000);
		//b2.name = "마라쌀국수";
		//b2.age = 20;
		//b2.height = 200;
		//b2.salary = 20000;
		
		b1.showInfo();
		b1.dunkShoot();
		b2.showInfo();
		b2.dunkShoot();

		
	}
	
}
