package Flyweight_ex;

/**
 * 원래 인터페이스를 만들고 콘크리트를 만들어야하는데 사실 이 패턴을 이해하는데 중요한 부분은 아님.
 * @author User
 *
 */
// 클라이언트가 다루는 플라이웨이트 객체
public class Flyweight {
	
	private String data;
	
	public Flyweight(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
}
