package chap_07;

public class _06_ClassMethod {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.callServiceCenter();
		
		BlackBox b2 = new BlackBox();
		b2.callServiceCenter();
		
		BlackBox.callServiceCenter();
		//클래스 메소드도 클래스 이름으로 직접 접근가능
		//여튼 static 붙은건 클래스 이름으로 접근하믄 된다.
		//객체 안만들어도 가능
		
		String s = String.valueOf(3);
		//3이란 정수를 문자열로 바꿔줌.
		//String 클래스는 오브젝트 아래의 상속클래스다. 상위클래스.
	}

}
