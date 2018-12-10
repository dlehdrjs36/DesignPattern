package Proxy_ex;

//프록시의 기능을 가지고 있는 인터페이스
public interface Subject {

	//리소스가 적게 드는 일, ex) 이름을 묻는다는지 가벼운 업무
	void action1();
	
	//리소스가 많이 드는 일, ex) 네트워크 메모리 사용
	void action2();
}
