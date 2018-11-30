package Strategy_ex;


public class Main {

	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.attack(); //에러나는 경우: 무기가 할당되지 않았을때도 공격하기 때문.
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
		}
}
