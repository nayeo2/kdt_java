package accessmodifier.member.pack2;

import accessmodifier.member.pack1.A;

public class C {

	public C() {
		A a = new A(); // 서로 다른 패키지 요소 호출시에는 import 필수!
		
		a.a = 1; // public // 어디서나 접근 가능
		//a.b = 2; // default // 패키지가 다르면 접근 불가
		//a.c = 3; // private // 같은 클래스 소속이 아니면 접근 불가
		
		a.method1(); // public
		//a.method2(); // default
		//a.method3(); // private
		
	}
}
