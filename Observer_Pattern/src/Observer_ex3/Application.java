package Observer_ex3;

import Observer_ex3.Observable.Observer;

public class Application {
//델리게이트를 사용해서 버튼클래스에서 Observable을 상속받지 않고도 사용이 가능하다. ,어뎁터나 스트레티지로 생각해도됨.
	public static void main(String[] args) {
		//1. 제네릭사용
		//2. 델리게이트사용
		//3. 내부에 옵저버를 넣는다. 중요. ( 버튼과 옵저버가 관계되어있다는 것을 의미. 가독성,이해 높아짐 : 커뮤니케이션의 중요성. )
		
		Button button = new Button();
		
		button.addObserver(new Observer<String>() {
			@Override
			public void update(Observable<String> o, String arg) {
				System.out.println(o+" is clicked");				
			}			
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}
