package mediator_contract;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	//protected 해야 상속받은 객체에서 사용가능.
	protected List<Colleague> colleagues;
	
	//초기화 시켜줌, 여기에서 해도되고 , ConcreteMediator에서 해도됨.
	public Mediator() {
		colleagues = new ArrayList<>(); 
	}
	
	public boolean addColleague(Colleague colleague) {
		// 추가 성공하면 true, 실패 false
		if(colleagues != null)
			return colleagues.add(colleague);
		else
			return false;
	}
	
	public abstract void mediate(String data);

}
