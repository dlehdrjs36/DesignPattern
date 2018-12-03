package Abstract;

public interface BikeFactory { //관련있는 부품들을 생성해야함.

	public Body createBody();
	public Wheel createWheel();
	//... ..
}
