package this_;

public class CarMain {
	public static void main(String[] args) {
		// 자동차 2대를 만든다
	Car myCar = new Car("카브리올레");
	Car yourCar = new Car("펠리세이드");
	
	for(int i =0; i < 20; i++) {
		myCar.accel();
		}
		myCar.showStatus();
		
		yourCar.accel();
		yourCar.showStatus();
	}
}
