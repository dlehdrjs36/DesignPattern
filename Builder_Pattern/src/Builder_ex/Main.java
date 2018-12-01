package Builder_ex;


public class Main {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint());

//		factory.setBlueprint(new MacAirBlueprint());
//		factory.setBlueprint(new SonyBlueprint());		
//		Computer computer = factory.makeAndGet();
		
		//makeAndGet()을 두단계로 나누어서 표현할 수 있음.
		factory.make(); // 컴퓨터를 만듬
		Computer computer = factory.getComputer();
		
//		Computer computer = new Computer("i7", "16g","256g ssd");
		System.out.println(computer.toString());
	}
}
