package override;

public class OverrideExample {

	public static void main(String[] args) {
		// 프로그래머 클래스의 인스턴스를 생성해주세요.
		Programer p1 = new Programer();
		// 해당 인스턴스에 값을 대입해주세요.
		p1.name = "채종훈";
		p1.age = 15;
		p1.devLang = "자바";
		p1.repoCount = 40;
		
		// 자기소개와 코딩을 시켜보세요.
		p1.자기소개하기();
		p1.코딩하기();
	}

}
