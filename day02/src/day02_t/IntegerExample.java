package day02_t;

public class IntegerExample {

	public static void main(String[] args) {
		int maxInt = 2147483647;
		// 01111111 11111111 11111111 11111111
		// 00000000 00000000 00000000 00001010 +
		// 1~~~~~~~ ~~~~~~~~ ~~~~~~~~ ~~~~~~~~
		
		System.out.println(maxInt + 10);
		
		int minInt = -2147483648;
		// 마찬가지의 맥락으로 최저에서 1을 빼면 최대값으로 바뀐다.
		
		System.out.println(minInt - 1);
		
	

	}

}
