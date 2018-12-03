package concrete;

import Abstract.Button;
import Abstract.GuiFactory;
import Abstract.TextArea;


public class FactoryInstance {

	//이 부분은 노출이되면안됨. 맥에서 맥용개발하는데 LinuxGui가 노출되는 경우(망한것)
	public static GuiFactory getGuiFactory() {
		
		//개발하는 OS에 맞추어 기능제공하는방법. == System.getProperty("os.name");의 값을 정규표현식으로 구분하여 코드 넘겨주게하면 됨.(getOsCode())
		// Ex) Win이 포함되면 윈도우(2), Mac이 포함되는 맥(0), Linux가 포함되는 리눅스(1)를 반환하도록하면된다.
		switch (getOsCode()) {
		case 0:	return new MacGuiFactory();
		case 1:	return new LinuxGuiFactory();
		case 2:	return new WinGuiFactory();
		}
		return null;
	}

	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}
		return 1;
	}
}


class LinuxGuiFactory implements GuiFactory {

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

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼");
		
	}

}
class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
		return "리눅스 텍스트에어리어";
	}

}
class MacGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}
class MacButton implements Button{

	@Override
	public void click() {
		System.out.println("맥 버튼");
		
	}

}
class MacTextArea implements TextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "맥 텍스트에어리어";
	}

}
class WinGuiFactory implements GuiFactory{

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
class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼");
		
	}

}
class WinTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "윈도우 텍스트 에어리어";
	}

}
