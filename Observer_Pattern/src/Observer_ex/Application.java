package Observer_ex;
import Observer_ex.Button.OnClickListener;
/**
 * 가장 기본적인 옵저버 패턴의 모양
 */
public class Application {

	public static void main(String[] args) {
	
		Button button = new Button();
//		button.setOnClickListener(new ButtonClick());
		
		//익명클래스로 사용. 버튼 클릭리스너 생성.
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button+" is Clicked");				
			}
		});	
		button.onClick();
	}
}

/*class ButtonClick implements OnClickListener {
	@Override
	public void onClick(Button button) {
		System.out.println(button+"is Clicked");
	}
}*/