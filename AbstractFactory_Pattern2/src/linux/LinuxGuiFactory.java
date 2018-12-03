package linux;

import Abstract.Button;
import Abstract.GuiFactory;
import Abstract.TextArea;

public class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// native source
		// ... ...
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// native source
		// ... ...
		return new LinuxTextArea();
	}

}
