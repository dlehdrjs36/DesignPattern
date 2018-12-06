package Visitor_ex;

import java.util.ArrayList;
//패턴의 사용이유 : 유지보수, 원활한 의사소통을 하기 위해서
public class Application {

	public static void main(String[] args) {
		//멤버변수의 수를 다 더해서 총합을 구하는 코드 작성
		//Visitable v1 = new VisitableA();
		
		ArrayList<Visitable> visitables = new ArrayList<Visitable>();
		
		//등차수열. 등차수열의 합: (첫번째것 + 마지막것(n==5)) / 2 * 마지막것(n==5)
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		
		Visitor visitor = new VisitorA(); //(패턴사용)
		int ageSum=0; // 패턴사용 X
		//visitables에서 visitable을 꺼냄.
		for (Visitable visitable : visitables) {
			visitable.accept(visitor); //visitable은 visitor를 accept (패턴사용)
			ageSum += ((VisitableA) visitable).getAge(); //위와 결과 같음 (패턴을 사용하지않은 예)
			//100줄 (패턴사용x) 이해하기 어려움,유지보수 어려움. 패턴을 사용하면 accept대신 알기쉬운 이름으로하면 우리가 알아보기 쉽다(받아들이고 받아들인곳에서 하는일쪽에서 실제 100줄을 구현.)
		}
		
		System.out.println(((VisitorA) visitor).getAgeSum()); // (패턴사용)
		System.out.println(ageSum); // (패턴사용X)
	}

}
