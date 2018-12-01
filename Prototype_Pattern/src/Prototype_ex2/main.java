package Prototype_ex2;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2013,3));
		//낮은 수준의 복사 : yo의 이름을 변경시 navi의 이름도 같이 변경됨. ( 인스턴스 주소를 복사했기 때문 )
/*		Cat yo = navi;
		yo.setName("yo");*/
		
		//깊은 수준의 복사 : yo의 이름을 변경시 navi의 이름은 변경되지 않음 ( 인스턴스 주소가 아닌 값만 복사했기 때문 )
		Cat yo = navi.copy();
		yo.setName("yo");
		//깊은수준의 복사
		//yo.setAge(new Age(2014,1));
		
		
		
		//이름(String)은 깊은복사가 되었지만 Age클래스는 깊은복사가 되지않았음. 
		//자바에서 Stirng, Integer 클래스는 자동으로 주소값을 변경해서 해주는 기능이 있는것으로 추정
		
		//낮은수준의 복사  : 멤버변수에서 깊은복사가 이루어지지 않았다. 해결방법 : 명시적으로 Cat클래스에서 깊은복사를 해주게하면 된다. Cat의 32번라인.
		yo.getAge().setYear(2015);
		yo.getAge().setValue(2);
		
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
	}
}
