package win;

import Abstract.Button;
import Abstract.GuiFactory;
import Abstract.TextArea;

public class WinGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}
