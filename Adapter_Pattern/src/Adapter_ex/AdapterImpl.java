package Adapter_ex;

public class AdapterImpl implements Adapter {

//	Math math;
	
	@Override
	public Float twiceOf(Float f) {
//ex) List를 정렬하고 싶다. 하지만 정렬하는 알고리즘은 Array로 구현되어있을 경우. (알고리즘이 복잡할경우 어댑터 패턴이 유용하다.)
		// 1.List 타입의 데이터를 Array로 변환시킨다.
		// 2.정렬 알고리즘을 적용한다.( ex: 버블정렬 ... ) 
		// 3.Array를 List로 변환하여 return 한다.
		
		/*return (float) Math.twoTime(f.doubleValue()); //기존 두배 구하는 알고리즘 */
		
		return Math.doubled(f.doubleValue()).floatValue(); //새로운 두배 구하는 알고리즘
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작"); // 함수 호출이 정상적으로 되는지 확인가능.
		return (float) Math.half(f.doubleValue());
	}

	
}
