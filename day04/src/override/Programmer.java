package override;

public class Programmer extends Human{
	public int repoCount;
	public String devLang;
	
	// 오버라이드는 부모 측 
	// 메서드와 이름, 파라미터, 리턴 타입이 같게 자식 쪽에서 다시 선언한다
	// 오버라이드된 메서드 왼쪽에는 일반 메서드와 달리 삼각형 심볼이 생긴다.
	// 오버라이드 애너테이션은 붙여도 되고 안 붙여도 된다.
	
	@Override
	public void 자기소개하기() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
		System.out.println("레포 갯수 : " +repoCount);
		System.out.println("개발언어 : " +devLang);
	}
	
	@Override
	public void 코딩하기() {
		System.out.println("개발자가 " + devLang + "로 코딩합니다.");
	}

}