package equals.str;

public class UserMain {

	public static void main(String[] args) {
		// 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		// String 객체를 생성할 시 같은 주소값을 공유하게 됩니다.
		
		String s1 = "룰루";
		String s2 = "룰루";
		System.out.println(s1 == s2);
		String s3 = new String("룰루");
		// s1, s2, s3 모두가 "룰루" 라는 문자열을 가지고 있음
		System.out.println(s1 + s2 + s3);
		System.out.println(s1 == s3);
		
		// 문자열도 참조형 변수이므로 단순 비교는 주소값 비교만 합니다.
		// 따라서 주소가 아닌 자료의 동등성을 따질때는 .equals()를 씁니다.
		System.out.println(s1.equals(s3));

	}

}
