package command_ex;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;


public class Main {

	public static void main(String[] args) {
		/**
		 * 명령패턴 사용방법 1.
		 */
		//큐에 명령을 넣고 명령을 실행하는 것
/*		List<Command> list = new LinkedList<>();
		
		list.add(new Command() {	
			@Override
			public void execute() {
				System.out.println("작업 1");
			}
		});
		
		list.add(new Command() {			
			@Override
			public void execute() {
				System.out.println("작업 2");			
			}
		});
		
		list.add(new Command() {
			@Override
			public void execute() {
				System.out.println("작업 3");		
			}
		});
		
		for (Command command : list) {
			//list에 담겨잇는 커맨드 객체를 하나하나 꺼내서 execute를 실행 시킨다. ( 먼저 넣은 커맨드객체가 먼저 실행됨. 큐와 유사 )
			command.execute();
		}*/
		
		/**
		 * 명령패턴 사용방법 2.
		 */
		//우선순위 큐
		PriorityQueue<Command> queue = new PriorityQueue<>();
		//길이로 우선순위 판단하도록 구현되어있음. 길이가 중요. 길이가 짧을수록 우선순위가 높다. 순서와 관계없음.
/*		queue.add(new StringPrintCommand("A"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("ABCD"));
		//A,AB,ABC,ABCD
*/

		queue.add(new StringPrintCommand("ABCD"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("A")); 
		// A,AB,ABC,ABCD
		for (Command command : queue) {
			command.execute();
		}
	}
}
