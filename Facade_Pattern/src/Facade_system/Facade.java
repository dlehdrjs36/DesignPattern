package Facade_system;

public class Facade {

	private HelpSystem01 helpSystem01;
	private HelpSystem02 helpSystem02;
	private HelpSystem03 helpSystem03;
	
	public Facade() { //어떤 퍼사드들을 호출하면 해당 시스템들을 모두 생성해주고
		helpSystem01 = new HelpSystem01();
		helpSystem02 = new HelpSystem02();
		helpSystem03 = new HelpSystem03();
	}
	
	public void process() { // 프로세스를 실행하면 서브시스템들(헬프시스템들)을 도와주는 어떤 과정들이 모두 진행된다.
		helpSystem01.process();
		helpSystem02.process();
		helpSystem03.process();
	}
}
