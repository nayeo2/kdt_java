package api.lang.object;

public class ObjectInformation {
	// toString 오버라이딩 후
	// System.out.println() 등으로 객체변수 조회시
	// 해당 인스턴스의 클래스 경로와 주소값대신
	// toString에서 리턴한 문자가 콘솔에 찍힙니다.
	
	@Override
	public String toString() {
		return "javajava";
	}

}
