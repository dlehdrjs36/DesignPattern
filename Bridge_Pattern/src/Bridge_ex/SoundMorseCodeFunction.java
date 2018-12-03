package Bridge_ex;

public class SoundMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print("삣");	
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("삐~");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

}
