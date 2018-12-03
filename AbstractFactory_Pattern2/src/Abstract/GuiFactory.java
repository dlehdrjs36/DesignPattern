package Abstract;

public interface GuiFactory { //기본적인 Gui 컴퍼넌트를 생성하는 팩토리.

	public Button createButton();
	public TextArea createTextArea();
}
