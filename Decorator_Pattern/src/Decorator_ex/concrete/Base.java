package Decorator_ex.concrete;

import Decorator_ex.abst.IBeverage;
/**
 * <h2><b>Role : </b>ConcreteComponent</h2>
 * <p>
 * Component의 실질적인 인스턴스의 부분이며, 책임의 주체입니다.
 * </p>
 * @author donggeon lee
 *
 */
public class Base implements IBeverage{

	@Override
	public int getTotalPrice() {
		// 아무것도 없는상태에서는 가격이 산출되지 않기때문에 0으로 주었음.
		return 0;
	}

	
}
