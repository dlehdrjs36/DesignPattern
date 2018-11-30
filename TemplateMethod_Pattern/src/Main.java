import TemplateMethod_ex.AbstGameConnectHelper;
import TemplateMethod_ex.DefaultGameConnectHelper;

// 동작하는 패키지 (default 패키지)
public class Main {

	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
		
	}
}
