package mediator;

import mediator_contract.Colleague;
import mediator_contract.Mediator;

public class ChatMediator extends Mediator{

	@Override
	public void mediate(String data) {
		//colleagues.get(index)
		for (Colleague colleague : colleagues) {
			//중재 가능성 (누구에게 보낼지,안보낼지 ..., 시간에 따라서 보낼지, 안보낼지)
			colleague.handle(data);
		}
	}

}
