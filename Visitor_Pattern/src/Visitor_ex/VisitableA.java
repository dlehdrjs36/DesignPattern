package Visitor_ex;

public class VisitableA implements Visitable {

	private int age;
	
	//초기 나이 셋팅할수있게 생성자 설정
	public VisitableA(int age) {
		super();
		this.age = age;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
