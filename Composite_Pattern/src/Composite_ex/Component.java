package Composite_ex;

//인터페이스가 아닌 추상클래스로 만드는 이유: 컴포넌트가 값을 가져야함.
// Ex) 폴더이름, 파일이름
abstract public class Component {

	private String name;

	public Component(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
