package equal.array;

import java.util.Arrays;

public class ArraryEqualsTest {

	public static void main(String[] args) {
		//배열은 참조형 변수이기 때문에 단순 대입 시 문제가 발생한다
		
		int[] intArray1 = {1,2,3,4,5};
		System.out.println("배열 1의 주소 : " +intArray1);
		// 배열도 참조형 변수이므로 주소가 아닌 실제 자료를 조회하려
		// Array.toString(배열자료) 형식으로 호출해야 한다.
		System.out.println(Arrays.toString(intArray1));
		System.out.println("--------------");
		
		// 새로 생성하지 않고, intArray1을 대입 받는 intArray2
		// 힙에 저장된 자료를 새로 똑같이 할당하는 복사를 깊은 복사라고 한다.
		// 변수 뒤에 .clone()을 써서 수행한다.
		int[] intArray2 = intArray1.clone();
		
		System.out.println("배열 1, 2간의 동등성 비교 (T/F) : " + (intArray1.equals(intArray2)));
		
		intArray1[0] = 100;
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열 2의 주소 : " + intArray2);

	}

}