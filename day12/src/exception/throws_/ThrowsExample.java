package exception.throws_;

import java.io.IOException;

public class ThrowsExample {
	
	public static String[] greetings = {"안녕", "싸왓디", "헬로"};
	
	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	 * 메모리 영역이 다르므로 예외처리를 메서드 호출지역으로 떠넘겨줘야 합니다.
	 * 이를 throws라고 하고, 메서드 혹은 생성자 호출시 예외처리를 강요할때 사용합니다.
	 */
					//오른쪽 종류 예외가 터지면, 호출부(여기서는main)에게 처리를 떠넘기겠다
	public static void greet(int idx) throws RuntimeException {
		//try {
			System.out.println(greetings[idx]);
		//} catch(ArrayIndexOutOfBoundsException e) {
			//코드 안적어도
		//}
	}

	public static void main(String[] args) {
		// throws가 붙어있는 메서드나 생성자 호출시에는
		// 해당 메서드를 try블록 내부에서 호출해야 예외처리를 진행해줍니다.
		//try {
			greet(3);
		//} catch(Exception e) {
			// .printStackTrace()는 예외발생 경로를 추적하는 메세지를 출력합니다.
			// 주로 개발과정에서 예외의 원인을 역추적할때 유용합니다.
		//	e.printStackTrace();
		//}
		System.out.println("프로그램 정상 종료!");
	}

}
