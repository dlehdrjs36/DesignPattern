

public class Main {

	public static void main(String[] args) {
		// 인터페이스 (기능선언) , 클래스(기능구현)
		Ainterface ainterface = new AinterfaceImpl();
		
		//Ainterface는 A기능을 사용하는 통로가 된다. Ainterface를 통해서 기능을 사용하기때문.
		//ainterface.funcA(); // Ainterface의 A기능 사용.
		
		AObj aObj = new AObj();
		aObj.funcAA(); // AObj에서 AinterfaceImpl이 없는상태이면 에러가남. 
		}
}
