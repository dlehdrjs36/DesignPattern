package Composite_ex;

import java.util.ArrayList;
import java.util.List;

//Composite == Folder
public class Folder extends Component {


	List<Component> children = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	// add와 remove는 return값으로 boolean값을 리턴해준다. boolean을 void로 해도 상관없음.
	public boolean addComponent(Component component) {
		return children.add(component);
	}
	
	public boolean removeComponent(Component component) {
		return children.remove(component);
	}
	
	public List<Component> getChildren() {
		return children;
	}
}
