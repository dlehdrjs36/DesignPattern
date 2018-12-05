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
public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;
	
	public Espresso(IBeverage base) {
		super(base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTotalPrice() {
		// 총 TotalPrice에서 추가되는 가격.
		return super.getTotalPrice()+getAddPrice();
	}
	
	/**
	 * 에스프레소 추가가격
	 * @return
	 */

	private static int getAddPrice(){
		espressoCount += 1;
		
		//에스프레소가 원샷 일때,
		int addPrice = 100;
		
		//에스프레소가 투샷이상 일때,
		if(espressoCount > 1) {
			addPrice = 70;
		}
		return addPrice;
	}
	
}
