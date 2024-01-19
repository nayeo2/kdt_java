package abstract_.abs;

public class MainClass {

	public static void main(String[] args) {
		// PopupStore 클래스는 직접 객체 생성 불가능
		//PopupStore ps = new PopupStore();

		PopupStore s = new Store();
		//PopupStore s = new ConvenientStore();
		// 객체 종류에 따라 실행구문이 다르게 정의되었지만
		// 명세는 같은 메서드
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
		
		// 어떤 객체가 와도 공통적으로 실행되는 메서드
		s.refund();
	}

}
