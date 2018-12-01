package Prototype_ex;

//Cloneable을 구현하면 clone() 함수를 사용할 수 있다. 복사 (Object 클래스에 이미 정의되어있음)
public class Shape implements Cloneable { //명시적으로 클론인터페이스를 구현해주어야 Object 클래스에서 정의되어있는 clone() 메소드를 사용할 수 있음
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
