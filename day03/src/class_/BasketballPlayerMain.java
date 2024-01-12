package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수 2명을 만들어주시고 정보를 조회하는 코드를 작성한다.
		BasketballPlayer b1 = new BasketballPlayer();
		b1.name="조던";
		b1.age=20;
		b1.height=200;
		b1.salary=20000;
		
		BasketballPlayer b2 = new BasketballPlayer();
		b2.name = "나영";
		b2.age=23;
		b2.height=160;
		b2.salary=90000;
		
		b1.showBasketballPlayerInfo();
		System.out.println("---------");
		b2.showBasketballPlayerInfo();
	}

}
