
import Abstract.Button;
import Abstract.GuiFactory;
import Abstract.TextArea;
import concrete.FactoryInstance;


// linux,mac,win 패키지는 필요없음. concrete안에 모두 이동시켯음. 
public class Main {

	public static void main(String[] args) {
		//concrete와 Abstract패키지는 라이브러리 형태로 제공될것이다. 우리는 인터페이스 (팩토리, 버튼, 텍스트에어리어를 이용해서 기능을 구현할 수 있다.)
		//윈도우일때 윈도우 팩토리를 넘겨주고, 리눅스일때 리눅스팩토리, 맥일때 맥팩토리를 넘겨준다면 메인의 소스코드는 건들필요가 없음.
		GuiFactory factory = FactoryInstance.getGuiFactory();
		
		//팩토리만 바꿔주면 해당하는 상품 생산가능.
		//GuiFactory factory = new MacGuiFactory();
		//GuiFactory factory = new LinuxGuiFactory();
		//GuiFactory factory = new WinGuiFactory();
		
		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		System.out.println(textArea.getText());
		//개발중인 OS 이름을 알 수 있음.
		System.out.println(System.getProperty("os.name"));
	}
}
