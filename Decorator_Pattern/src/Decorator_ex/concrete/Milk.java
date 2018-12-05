package Decorator_ex.concrete;

import Decorator_ex.abst.AbstAdding;
import Decorator_ex.abst.IBeverage;

/**
 * <h2><b>Role : </b>ConcreteDecorator</h2>
 * <p>
 * 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.
 * </p>
 * 
 * @author donggeon lee
 *
 */
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTotalPrice() {
		//부모의 토탈금액에 50원을 더한다.
		return super.getTotalPrice()+50;
	}

	
}
