package Sam;

import Abstract.BikeFactory;
import Abstract.Body;
import Abstract.Wheel;

public class SamFactory implements BikeFactory {  //삼천리 자전거 공장 

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
