package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		// 자바는 15버전부터 멀티라인 문자열을 지원합니다.
		// 원래 자바 문자열은 여닫는 " 를 한 줄에 작성해야만 했었습니다.
		// String a = "가나다라"; (허용)
		// String a = "가나다라
		//						마바사";(허용안함)
		
		// 여닫는 따옴표가 다른 줄에 위치한 경우는 "세 개(""")를 이용합니다.
		// """를 사용한 줄에는 문자열을 작성할 수 없고, 다음 줄부터 작성가능합니다.
		String notice = """
						채종훈 강사의 공지사항
						1. 복습 철저히 해주세요.
						2. 회고록을 잘 작성해주세요.
						3. 관심사를 개발공부에 집중해주세요.""";
		System.out.println(notice);
		// replace()는 String을 리턴하고, 첫 단어를 두 번째 단어로 바꿔줍니다.
		String newNotice = notice.replace("해주세요", "해주십시오");
		System.out.println(newNotice);

	}

}
