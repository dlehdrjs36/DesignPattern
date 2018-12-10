package Proxy_ex;

public class Proxy implements Subject{

	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
		//== real = new RealSubject(); 리소스를 많이먹는 작업을 하는게 RealSubject이기 떄문에, 계속 새로 생성된다면 프로그램이 무거워짐
	}
	@Override
	public void action1() {
		System.out.println("간단한 업무 by 프록시");
	}

	//action2는 프록시가 절대 할 수 없는일들. (복잡한 일)
	@Override
	public void action2() {
		this.real.action2();
	}

}
