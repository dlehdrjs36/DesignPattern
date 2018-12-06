package Facade_ex;

import Facade_system.Facade;

public class Application {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process(); //한번호출하면 서브시스템들의 복잡한 프로세스를 신경쓰지 않아도 바로 사용할 수 있다.

		// HelpSystem01은 여기서 접근불가능. 디폴트 클래스로 생성되었기때문에 같은 패키지 내에서만 접근이 가능하다. 
	}
}
