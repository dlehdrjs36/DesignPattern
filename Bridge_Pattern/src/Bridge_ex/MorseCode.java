package Bridge_ex;

public class MorseCode {
//모스부호를 이루는 기호들 3가지 ".", "_", " "
	
	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {
		this.function = function;
	}
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	public void dot() {
		function.dot(); //델리게이트
	}
	public void dash() {
		function.dash();
	}
	public void space() {
		function.space();
	}
}
