package Flyweight_ex;

import java.util.Map;
import java.util.TreeMap;

//플라이웨이트 매니저. 팩토리는 풀을 가지고있다. 풀은 플라이웨이트들을 가지고 있음. 풀의 모양은 어떤것이든 상관없음.
public class FlyweightFactory {

	Map<String, Flyweight> pool;
	
	//생성자를 부를때 풀을 메모리에 할당.
	public FlyweightFactory() {
		pool = new TreeMap<>();
	}
	
	//키를 통해서 플라이웨이트를 얻어옴.
	public Flyweight getFlyweight(String key) {
		// pool에서 get(key)를 했을때 플라이웨이트가 잘 넘어온다면, 그것의 의미는 풀에 키에 해당하는 플라이웨이트가 있다는 뜻
		Flyweight flyweight = pool.get(key);
		
		// pool에 플라이웨이트가 없다면, 생성해서 넘겨주어야함.
		if(flyweight == null) {
			//키를 데이터로 하는 플라이웨이트를 생성(의미는 없음 , 예제(패턴)를 간단하게 이해하기 위하여 사용)
			flyweight = new Flyweight(key);
			
			//플라이웨이트를 생성하고 풀에 집어넣어줌.
			pool.put(key, flyweight);
			System.out.println("새로 생성 "+ key);
		} else {
			//풀에있던 플라이웨이트를 다시 사용하는지 확인하는 용도로 작성(없어도 됨)
			System.out.println("재사용 "+ key);
		}
		
		return flyweight;
	}
}
