package Adapter_ex;

public class Math {

	//두배
	public static double twoTime(double num) { return num*2; }
	//절반
	public static double half(double num) { 
		//System.out.println("half 함수 호출");//다른사람도 사용하기때문에 여기다 로그를 쓰는건 안됨.
		return num/2; 
		}
	
	//강화된 알고리즘
	public static Double doubled(Double d) { return d*2; }
}

