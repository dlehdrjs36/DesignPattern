package Singletone_ex;

public class Main {

	public static void main(String[] args) {
		/*SystemSpeaker speaker = new SystemSpeaker(); // 에러 private로 선언되어있어서 접근 불가.*/
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		//하나의 리소스에만 접근하는지 확인.
		//5,5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		//11,11
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(22);
		//22,22
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// speaker1과 speaker2는 동일한 인스턴스임을 확인 할 수 있다.
		// 디버그하면 speaker1과 speaker2는 동일한 인스턴스 주소가 나온다.
	}
}
