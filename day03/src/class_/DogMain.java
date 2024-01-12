package class_;

public class DogMain {
		public static void main(String[] args) {
			// 강아지 2마리 생성
			Dog d1 = new Dog();
			d1.name = "오쿠";
			d1.age=6;
			d1.kind="푸들";
			d1.color="초코";
						
			Dog d2 = new Dog();
			d2.name = "방심이";
			d2.age=7;
			d2.kind="말티즈";
			d2.color="꼬질이";
			
			d1.showDogInfo();
			System.out.println("--------------");
			d2.showDogInfo();
			
		}
}
