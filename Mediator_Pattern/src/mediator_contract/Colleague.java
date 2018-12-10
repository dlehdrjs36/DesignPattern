package mediator_contract;

public abstract class Colleague {

	private Mediator mediator;
	
	//join == register
	public boolean join(Mediator mediator) {
		if(mediator == null)
			return false; 
		
		this.mediator = mediator;
		return mediator.addColleague(this);
	}
	
	public void sendData(String data) {
		if(mediator != null)
			mediator.mediate(data);
	}
	
	//Mediator가 mediate했을때 처리하는 함수.
	public abstract void handle(String data);
}
	