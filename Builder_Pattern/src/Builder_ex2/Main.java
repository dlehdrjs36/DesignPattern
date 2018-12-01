package Builder_ex2;

public class Main {

	public static void main(String[] args) {
		
//		Computer computer = new Computer("256g ssd","i7","8g"); 가독성 ↓ 뭐가 cpu고 ram인지 알수없음. 필드가 많아질수록 알기 힘듬.
		
		//체인 형태로 만듬 ( 가독성 ↑ , cpu는 무엇이고 ram은 무엇인지 한번에 확인가능)
		Computer computer = ComputerBuilder				
				.startWithCpu("i7")
/*				.start()
				.setCpu("i7")*/
				.setRam("8g")
				.setStorage("128g ssd")
				.build();
		
		System.out.println(computer.toString());
				
	}
}
