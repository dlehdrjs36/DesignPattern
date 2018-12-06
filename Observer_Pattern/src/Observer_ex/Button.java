package Observer_ex;

public class Button {
	//멤버변수는 따로 처리를 안하면 null 그렇기때문에 null이 아닐때 처리하도록 해야함.
	
	//notify 부분
	public void onClick() {
		//이벤트 처리		
		if(onClickListener != null) { //onClickListener가 셋팅이 되엇을때 작동.
		//버튼이 클릭이벤트가 발생했을때, 자기자신을 인자로 넘기는 함수 onClick을 update해준다.		
		onClickListener.onClick(this);
		}
	}
	
	//Observer 인터페이스 부분
	public interface OnClickListener{
		//update 부분
		public void onClick(Button button);
	}
	
	private OnClickListener onClickListener;
	
	//setObserver 부분
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;		
	}
}
