package day02;

public class FlaotExample {

	public static void main(String[] args) {
		// 매직넘버 실수는 double이기 때문에 float 자료형에 저장할 때는
		// 뒤에 f를 붙여서 float으로 바꿔야한다.
		float f1 = 7.12345F;
		double d1 = 7.12345;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("----------");
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		System.out.println(f2); //float 자료형은 표현 범위가 double보다 좁아 일부 누락된다.
		System.out.println(d2);
		
		System.out.println(0.12345e+7);  //0.12345를 7자리 올리기
		System.out.println(100e-5); //100을 5자리 내리기
		}

}
