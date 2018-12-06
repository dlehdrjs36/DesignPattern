package Observer_ex3;

import Observer_ex3.Observable.Observer;

public class Button {
	
	public Button() {
		observable = new Observable<String>();
	}
	//델리게이트.
	private Observable<String> observable;
	
	public synchronized void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}
	
	public void notifyObservers() {

        observable.notifyObservers(null);
    }

	public void onClick() {
		//changed = true;가아니면 동작안함. setChanged()는 changed를 true로 바꿔준다, 변경되었다는 의미.
		observable.setChanged();
		notifyObservers();
		
	}
	
}
