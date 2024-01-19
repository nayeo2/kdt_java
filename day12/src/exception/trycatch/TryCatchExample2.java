package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// 어떤 종류가 되었건 여러분들이 직접 예외가 발생할 수 있는 구문을 작성하신다음
		// try~caych 를 이용해서 예외 발생시 처리되도록 프로그래밍 해 보세요.
		// 단 0으로 나누기를 제외한 나머지를 이용해서 해 주세요.
		String[] greetings = {"안녕", "Hello", "니하오", "싸왓디"};
		
		int i = 0;
		while(i < 5) {
			try {
				System.out.println(greetings[i]);
			} catch(Exception e) {
				System.err.println("배열의 참조 범위를 벗어남");
			}finally {
				System.out.println("없어도 되지만 로직이 블럭과 관련있을시 작성");
			}
			i++;
		}
		System.out.println("프로그램이 강제종료없이 잘 마무리되었습니다.");
	}
}
