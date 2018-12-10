package state_ex;

//Context
public class Light {

	protected LightState lightState;
	//상태정의 , StateA, 상태마다 수행하는 action 정의
	private LightState offState = new LightState() {
		
		@Override
		public void on() {
			//상태에서 어떻게 동작하는지 action 구현
			System.out.println("Light ON");		
			lightState = onState;
		}
		//불이 꺼져있는 상태에서 off하면 아무 반응없음.
		@Override
		public void off() {
			System.out.println("Nothing");
			
		}
	};
	//상태정의 , StateB, 상태마다 수행하는 action 정의
	private LightState onState = new LightState() {
		
		//불이 켜져있는 상태에서 on을 하면 아무 변화도 없음.
		@Override
		public void on() {
			System.out.println("Nothing");
		}
		
		@Override
		public void off() {
			System.out.println("Light OFF");
			lightState = offState;
		}
	};
	
	//초기상태: 불이 꺼져있는 상태.
	public Light() {
		lightState = offState;
	}
	public void on() {
		lightState.on();
	}
	
	public void off() {
		lightState.off();
	}
	
}

//상태 interface  
interface LightState {
	// action 선언
	void on();
	void off();
}