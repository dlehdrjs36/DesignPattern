package command_ex;

//명령패턴 방법2 : 우선순위 큐에서 우선순위를 가지기 위해서는 여기서 extends Comparable<Command>를 해주고 이것이 구현 되어야 한다.
public interface Command extends Comparable<Command> {

	void execute();
}
