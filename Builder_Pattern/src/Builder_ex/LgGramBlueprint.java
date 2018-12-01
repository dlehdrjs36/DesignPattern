package Builder_ex;

public class LgGramBlueprint extends BluePrint {

	private Computer computer; // 최적화하려면 컴퓨터객체보다 아래의 변수를 쓰는게 좋다. 객체는 메모리 할당 더많이함. 그러나 가독성을 높이는 것은 객체를 사용하는것이 좋음. 
	
/*	private String cpu;
	private String ram;
	private String storage;
	*/
	
	public LgGramBlueprint() {
		computer = new Computer("default","default","default");
	}

	@Override
	public void setCpu() {
		//cpu="i7";
		computer.setCpu("i7");
	
	}

	@Override
	public void setRam() {
		//ram="8g";
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		//storage="256g ssd";
		computer.setStorage("256g ssd");

	}

	@Override
	public Computer getComputer() {
		// return new Computer(cpu,ram,storage);
		return computer;
	}

}
