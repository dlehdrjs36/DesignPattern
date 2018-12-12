package Flyweight_ex;

//클라이언트,여기서 플라이웨이트를 관리하면 정신이없을 것이다. 팩토리(플라이웨이트매니져)에서 관리하도록 팩토리를 추가한다.
public class Main {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		
		
		Flyweight flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);
	}
}
