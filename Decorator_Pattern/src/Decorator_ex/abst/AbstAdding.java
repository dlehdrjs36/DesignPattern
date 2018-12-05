package Decorator_ex.abst;

/**
 * <h2><b> Role : </b>Decorator</h2>
 * <p>
 * 컴포넌트와 장식을 동일시 해주는 역할을 합니다.
 * </p>
 * 
 * @author donggeon lee
 *
 */
//밖에서 보기에는 AbstAdding이 IBeverage로 보일 수 있다.
public class AbstAdding implements IBeverage {

	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	//추가된 책임부분
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return base.getTotalPrice();
	}

	protected IBeverage getBase() {
		return base;
	}
}
