package override;

public class OverrideExample {
	public static void main(String[] args) {
		// 프로그래머 클래스의 인스턴스 생성
		Programmer p1 = new Programmer();
		
		// 해당 인스턴스에 값 대입
		p1.name = "김개발";
		p1.age = 30;
		p1.devLang = "JAVA";
		p1.repoCount = 50;
		// 자기소개와 코딩을 시켜보세요
		p1.자기소개하기();
		p1.코딩하기();
	}
}
