package Strategy_ex;

public class GameCharacter {

	//접근점
	private Weapon weapon; // 게임캐릭터는 처음에 무기를 들고있음. 접근점을 여기서 만든다.
	
	//교환 가능
	public void setWeapon(Weapon weapon) { // 무기 교환가능하도록 setWeapon 함수 만듬.
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon ==null) {	//무기가 없을때 공격방법을 정의해줌.
			System.out.println("맨손 공격");
		}else {
			// 델리 게이트 (무기의 기능을 사용) : 내가 어떤무기를 들고있느냐에 따라서 공격방법이 달라진다.
			weapon.attack();
		}
		
	}
}
