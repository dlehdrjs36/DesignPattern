package TemplateMethod_ex;

//라이브러리 형태로 배포되는 패키지 (TemplateMethod_ex 패키지)

//추상클래스
public abstract class AbstGameConnectHelper {

	//알고리즘의 단계이기 때문에 외부에 노출되면 안됨. => private 선언X (하위클래스에서 재정의 하기때문), protected 선언O
	//protected는 동일한 패키지에서는 접근가능함.
	protected abstract String doSecurity(String string);
	protected abstract Boolean authentication(String id, String password);
	protected abstract int authorization(String username);
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo) {
		//보안 작업 -> 암호화 된 문자열을 복호화 한다.
		String decodedInfo = doSecurity(encodedInfo);
		//반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName ="userName";
		int i = authorization(userName);
		
		switch(i) {
		case -1:
			throw new Error("셧다운");
		case 0: //게임 매니저
			System.out.println("게임 매니저");
			break;
		case 1://유료 회원
			
			break;
		case 2://무료 회원
			
			break;
		case 3://권한 없음
		
			break;
		default://기타상황
			
			break;
		}
		return connection(decodedInfo);
	}
}
