package Singletone_ex;

public class SystemSpeaker {
	//static private SystemSpeaker instance = new SystemSpeaker(); X 
	static private SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() { //객체생성 불가능 
		volume = 5;
	}
	
	public static SystemSpeaker getInstance() { // 객체 생성을 못하니까 static을 선언하여 다른곳에서도 getInstance()를 할 수 있게 한다.
		if(instance == null) {
			//시스템 스피커 작업내용이 들어와야함.
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		}// 로그를 찍어주는 소스를 추가
		else {
			System.out.println("이미 생성");
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
