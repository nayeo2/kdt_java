package interface_;

public class MainClass {
	public static void main(String[] args) {
		//인터페이스 역시 구현체를 다형성 형식으로 받을 수 있다
		// RemoteController rc = new TVRemoteController(50);
		RemoteController rc = new RobotCleanerRemoteController("imou", "280000");
		
		rc.turnOn();
		rc.showStatus();
		rc.turnOff();
	}
}
