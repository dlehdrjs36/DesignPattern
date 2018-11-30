
//AObj에서 기능이 필요하다고 가정.
public class AObj {

	Ainterface ainterface; // funcAA() 라는 기능이 Ainterface에 선언되어있다고 가정.
	
	public AObj() {
		// TODO Auto-generated constructor stub
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		//위임한다.
		ainterface.funcA();
		ainterface.funcA();
		
		//System.out.println("AAA");
		//System.out.println("AAA");
		
		//~한 기능이 필요합니다. 개발해주세요. => 개발된기능을 funcAA()안에 copy&paste 하는것은 아님.
	}
}
