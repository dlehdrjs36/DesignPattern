package com.memento.abc;

public class Originator {

	String state;
	
	//케어테이커 구현대신 메멘토 생성후 그것을 케어테이커에게 넘겨주는방식으로할것임.
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}
