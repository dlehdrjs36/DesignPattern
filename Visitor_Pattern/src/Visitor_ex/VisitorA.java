package Visitor_ex;

public class VisitorA implements Visitor{

	private int ageSum;
	
	public VisitorA() {
		ageSum = 0;
	}
	
	//VisitorA가 VisitableA를 방문하면 나이가 증가.
	@Override
	public void visit(Visitable visitable) {
		//매개변수가 VisitableA 인지 확인.
		if(visitable instanceof VisitableA) {
			//조건을 통과한것은 무조건 VisitableA 이다.
			ageSum += ((VisitableA) visitable).getAge(); //VisitableA의 한 인스턴스가 됨.
		} else {
			//...
		}
	}
	
	public int getAgeSum() {
		return ageSum;
	}

}
