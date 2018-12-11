package com.memento;

import java.util.Stack;

import com.memento.abc.Memento;
import com.memento.abc.Originator;

public class Application {

	public static void main(String[] args) {
		
		// Stack를 케어테이커 대신으로 사용했음.
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		//Memento memento = originator.createMemento();
		mementos.push(originator.createMemento());
		
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		//mementos.push(originator.createMemento());
		
		/**
		 * Ex 악의적으로, 실수로 메멘토를 생성하고 상태 설정
		 * 결과 -> 원하는 상태가 출력되지않고 Final, 3, 2(x) -> something(o), 1 로 출력 됨.
		 * 외부에서 메멘토를 바꿀 수 있는 기능을 주는 것 자체가 굉장히 위험한 코딩이 될 수 있다.
		 * Memento기능을 protected로 바꾸면 외부에서 접근이 불가능.(외부에서 생성할수도 없고, 가져올수도 없다.)
		 * protected는 자기가 상속한,상속받을 객체나 같은 패키지내에서만 접근이 가능하다. 보안적인 부분의 이점이 있음. protected를 사용하는 방법 중 하나.
		 */
		//Memento memento = originator.createMemento(); 
		//memento = new Memento("state something"); X
		//악의적으로 가져와서 상태값을 확인, 혹은 뺏어가는 경우도 발생 가능.
		//String state = memento.getState(); X
		//state += "23";
		//mementos.push(memento);
		
		
		
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		//Memento memento = mementos.pop();
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());//state Final
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());// state 3
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 2
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState()); // state 1
	}
}
