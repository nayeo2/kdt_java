package super_;

public class SupersonicAirplane extends Airplane {
	
	// 새롭게 정의되 멤버변수 없음
	
	public SupersonicAirplane(String planeCode) {
		// 생성자는 상속이 되지 않음. 따라서 자식쪽 생성자에서
		// 부모생성자를 먼저 초기화해주고, 나머지 코드를 실행해야함.
		super(planeCode);
	}
	
	// 초음속 비행기도 fly()를 사용하지만, 일반 비행기보다 확장된 개념을 사용하므로
	// 오버라이딩을 통해 추가적인 정의를 해야 합니다.
	// 다만 900km/h 이하에서는 일반 비행을, 그 이후에는 초음속 비행을 하므로
	// 시속 900km 이하 구간에서는 오버라이딩 되기 전의 fly()를
	// 이후에는 재정의된 fly()를 호출하게 해야 합니다.
	@Override
	public void fly() {
		if(this.speed < 900) {// 일반 비행 구간에서는
			super.fly(); // 오버라이딩 전 fly() 호출
		}else if(this.speed + 300 <= 2200 && this.gas >= 5) {
			this.speed += 300;
			this.gas -= 5;
		}else if(this.speed + 300 >= 2200 && this.gas >= 5) {
			this.speed = 2200;
			this.gas -= 5;
		} else {
			System.out.println("연료가 부족해 비행이 불가능합니다.");
		}
	}
	
}







