import Bridge_ex.DefaultMorseCodeFunction;
import Bridge_ex.FlashMorseCodeFunction;
import Bridge_ex.PrintMorseCode;
import Bridge_ex.SoundMorseCodeFunction;

public class Main {

	public static void main(String[] args) {
		//기능과 구현의 분리 (자원을 원하는대로 사용가능)
		//기능 : Default,Flash,Sound... ( 3개의 부분 )
//		PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
//		PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());
		
		
//		code.g();code.a();code.r();code.a();code.r();
		//구현 : PrintMorseCode 부분 
		code.g().a().r().a().m(); // 체이닝: 코드 깔끔해짐
	}
}
