package Observer_ex2;

import java.util.Observable;

//버튼은 View이면서 Observable일수도있는데 자바의 내장 Observable은 클래스로 구현되어있기때문에 확장성 측면에서 좋지 않다.
public class Button extends Observable {

	public void onClick() {
		setChanged();
		notifyObservers(); // 옵저버들에게 업데이트된것을 알려줌.
	}
}
