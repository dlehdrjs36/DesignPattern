package Bridge_ex;

public class FlashMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print(" 번쩍 ");	
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print(" 반짝 ");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print(" - ");
	}

}
