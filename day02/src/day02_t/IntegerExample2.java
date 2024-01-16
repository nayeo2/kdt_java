package day02_t;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = 214748367;
		// 2147483648을 집어넣는 경우 int 최대범위를 넘는 매직넘버이므로 에러가 뜹니다.
		// int 최대 범위를 벗어나는 수는 2147483648L과 같이 뒤에 L을 붙여서
		// long 자료형 매직넘버로 바꿔주셔야 에러가 사라집니다.
		long d = 2147483648L;
		
		System.out.println(d);
		
		// 매직넘버를 2진수로 표현하고 싶다면 접두어로 0b를 왼쪽에 붙입니다.
		int bin = 0b1010; // 2진수 1010(천 십 아님)
		System.out.println(bin); // 10
		
		// 8진수로 표현하고 싶다면 접두어로 0을 왼쪽에 붙입니다.
		int oct = 064; // octal
		System.out.println(oct);
		
		// 16진수로 표현하고 싶다면 접두어로 0x를 붙입니다.
		int hex = 0x3a4c; // hexadecimal
		System.out.println(hex);
	}

}
