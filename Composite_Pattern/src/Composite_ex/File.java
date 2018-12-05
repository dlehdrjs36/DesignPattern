package Composite_ex;

//File == Leaf
//파일은 어떠한 정보를 가지고 있어야한다. Ex) data
public class File extends Component {

	private Object data;
	
	public File(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
