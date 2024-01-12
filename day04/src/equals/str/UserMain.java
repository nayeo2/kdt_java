package equals.str;

public class UserMain {

	public static void main(String[] args) {
			// 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
			// String 객체를 생성할 시 같은 주소값을 공유하게 된다.
		
		String s1 = "오쿠";
		String s2 = "오쿠";
		System.out.println(s1 == s2);
		String s3 = new String("오쿠");
		// s1, s2, s3 모두 "오쿠"라는 문자열을 가지고 있다.
		System.out.println(s1 + s2 + s3);
		System.out.println(s1 == s3);
		
		// 문자열도 참조형 변수이므로 단순 비교는 주소값 비교만 한다
		// 따라 주소가 아닌 자료의 동등성을 따질 때는 .equals()를 쓴다
		System.out.println(s1.equals(s3));
	}

}
