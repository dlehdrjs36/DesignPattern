package ChainOfResposibility.ex2;

public class Application {

	public static void main(String[] args) {
		
		//첫번째 공격
		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor(10);
		Armor armor2 = new Armor(15);
		
		armor1.setNextDefense(armor2);		
		armor1.defense(attack);
		
		System.out.println(attack.getAmount());
		
		/**
		 * Point2  = 동적
		 */
		//아머1, 아머2 를 입고있고 또다른 방어구를 가지고 있는 상황.
		Defense defense = new Defense() {
			@Override
			public void defense(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount -=50);	
			}		
		};
		
		//추가 착용 (방어구)
		armor2.setNextDefense(defense);
		
		attack.setAmount(100);
		//두번째 공격
		armor1.defense(attack);
		
		System.out.println(attack.getAmount());
	}
}
