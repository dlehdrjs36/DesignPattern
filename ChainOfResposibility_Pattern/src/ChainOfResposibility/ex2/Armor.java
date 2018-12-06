package ChainOfResposibility.ex2;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def;
	
	
	public Armor() {
		// TODO Auto-generated constructor stub
	}
	public Armor(int def) {
		this.def = def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	@Override
	public void defense(Attack attack) {
				
		/**
		 * Point!
		 */
		proccess(attack);
		//처리의 완료를 확인하지 않고 무조건 nextDefense 호출. 중요포인트. 첫번째 예제와 다른점. 이런식으로도 사용가능.
		if(nextDefense!=null) {
			nextDefense.defense(attack);
		}
	}

	private void proccess(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);
	}
	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
}
