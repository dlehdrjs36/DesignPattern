package command_ex;

// 명령패턴 방법 2.
public class StringPrintCommand implements Command {

	protected String string;
	
	public StringPrintCommand(String string) {
		this.string = string;
	}
	
	@Override
	public int compareTo(Command o) {
		//우선순위 결정(문자열 길이 비교. 짧은것이 우선순위가 가장 높음)
		StringPrintCommand other = (StringPrintCommand)o;
		return this.string.length() - other.string.length();
	}

	@Override
	public void execute() {
		System.out.println(this.string);
	}

}
