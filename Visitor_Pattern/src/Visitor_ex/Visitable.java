package Visitor_ex;

public interface Visitable {
	//void부분을 Object로 해서 다양한 객체를 받을 수도 있음.
	public void accept(Visitor visitor);
}
