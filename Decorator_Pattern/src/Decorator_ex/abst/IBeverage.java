package Decorator_ex.abst;
/**
 * <h1>Role : Component</h1>
 * <p>컴포넌트의 역할은 실질적인 컴포넌트들을 다루는, 컨트롤하는 역할을 합니다.</p>
 * 
 * <h1>Coffee Hoses Menu</h1>
 * <ul>
 * <li>에스프레소 : 커피의 기본</li>
 * <li>아메리카노 : 에스프레소 + 물</li>
 * <li>카페라떼 : 에스프레소 + 스팀밀크</li>
 * <li>헤이즐넛 : 아메리카노 + 헤이즐넛 시럽</li>
 * <li>카페모카 : 에스프레소 + 스팀밀크 + 초콜릿 </li>
 * <li>카라멜 마끼아또 : 카페라떼 + 카라멜 시럽 </li>
 * </ul>
 * 
 * 
 * @author donggeon lee
 */


public interface IBeverage {

	/**
	 * 총 가격
	 */
	int getTotalPrice();
}
