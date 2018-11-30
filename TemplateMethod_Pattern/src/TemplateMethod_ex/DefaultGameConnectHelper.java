package TemplateMethod_ex;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		/*System.out.println("디코드"); 기존 보안 알고리즘*/
		
		System.out.println("강화된 알고리즘을 이용한 디코드");
		return string;
	}

	@Override
	protected Boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true; //맞으면 true ,틀리면 false 여기서는 무조건 맞다고 가정하고 true 넘김
	}

	@Override
	protected int authorization(String username) {
		System.out.println("권한 확인");
		//서버에서 유저이름, 유저의 나이를 알 수 있다.
		//나이를 확인하고 시간을 확인하고 성인이 아니고 오후 10시가 지났다면
		//권한이 없는 것으로 한다.
		
		return 0; // 게임매니저로 가정
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계!");
		return info; // 접속에 필요한 정보를 넘김 (스레드, 접속주소...)
	}

}
