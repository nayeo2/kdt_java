package override;

public class Programer extends Human {
	
	public String devLang;
	public int repoCount;
	
	// 오버라이드는 부모측 메서드와 이름, 파라미터, 리턴타입이 같게
	// 자식쪽에 다시 선언하면 됩니다.
	// 오버라이드된 메서드 왼쪽에는 일반 메서드와 달리 삼각형 심볼이 생깁니다.
	// 오버라이드 애너테이션은 붙여도 되고 안 붙여도 됩니다.
	@Override
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("개발언어 : " + devLang);
		System.out.println("깃허브 레포지토리 개수 : " + repoCount);
	}
	
	public void 코딩하기() {
		System.out.println("개발자가 " + devLang + "으로 코딩합니다.");
	}	
}


