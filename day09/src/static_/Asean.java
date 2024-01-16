package static_;

public class Asean {
	// 실용영어 - 조별과제
	// 태국어 1명 - 마인어 3명
	// Asean
	// 출석 20 + 발표 30 + 기말 50
	public String name;
	private int attendanceScore; // 출결점수
	private int finalTermScore; // 기말점수
	
	// 종훈, 은영, 재인, 일윤
	//public static int presentationScore; // 29 변수용
	private static int presentationScore; // 29 메서드용
	
	public Asean(String name, 
				int attendanceScore, 
				int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	// 스태틱 블록 내부 코드는 프로그램 시작시 즉시 자동으로 한 번 호출됨
	static {
		presentationScore = 29;
	}
	// 스태틱 메서드도 객체 없이 바로 호출 가능함.
	public static void showPresentationScore() {
		System.out.println(presentationScore);
	}
	
	
	public void showStudentScore() {
		System.out.println("학생명 : " + this.name);
		System.out.println("학생명 : " + this.attendanceScore);
		System.out.println("학생명 : " + presentationScore);
		System.out.println("학생명 : " + this.finalTermScore);
		System.out.println("최종성적 : " + (this.attendanceScore + 
										presentationScore + 
										this.finalTermScore));
		System.out.println("=============================");
	}
	
}
