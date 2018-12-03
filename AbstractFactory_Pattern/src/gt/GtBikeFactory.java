package gt;

import Abstract.BikeFactory;
import Abstract.Body;
import Abstract.Wheel;

public class GtBikeFactory implements BikeFactory{ //Gt 자전거

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
