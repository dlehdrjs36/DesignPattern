package Prototype_ex2;

public class Cat implements Cloneable {

	
	private String name;
/*	private Integer Age;*/
	private Age age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Cat copy() throws CloneNotSupportedException {
		
		Cat ret = (Cat)this.clone();
		
		//명시적으로 깊은복사하도록 함. age 인스턴스를 새로만들어서 셋팅함.
		ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		
		return ret;
		
	}
	
}
