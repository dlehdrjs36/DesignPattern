package Bridge_ex;

public class DefaultMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print(".");	
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("_");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

}
