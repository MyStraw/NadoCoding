package chap_07;

public class _05_MethodOverloading {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.record(false, false, 10);
		System.out.println("----------------------");
		b1.record(true,false,3);
		System.out.println("----------------------");
		b1.record(true, true, 5);
		
		//난 그냥 기본만 표시하고싶어. 매번 트루트루10 언제 넣어
		//블랙박스 클래스로 다시 가. 오버로딩을 하면 된다.
		
		b1.record(); //이러면 오버로딩한 기본정보만 불러온다.
		
		//String
		String s = "BlackBox";
		System.out.println(s.indexOf("a"));
		
	}
}
