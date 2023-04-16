package chap_08;

import chap_07.BlackBoxRefurbish; //ctrl+alt+o
// import chap_07.* ; 이렇게 하면 챕터7 모든 클래스를 다 쓰고싶다!

//챕터7이란 패키지에 있는 리퍼비시에 있는 클래스를 사용하겠다!
//아 패키지 바꼈징
public class _00_AccessModifierTest {
	public static void main(String[] args) {
		
		BlackBoxRefurbish b1 = new BlackBoxRefurbish();
		b1.modelName = "까망이"; // public 였다.
//		b1.resoution = "FHD"; // 이건 변수로 사용 안됨. default 니까 안되네
//		b1.price=200000; // private
//		b1.color = "블랙"; // protected 다른패키지인데 자식이 아니라 안됨.
		//public 빼고는 다 접근이 안됨
		
//		A a = new A();
		//퍼블릭이 아니라서 클래스 접근이 안된다.
		//클래스에서도 접근제한자 사용가능. 리퍼비쉬 젤끝에 디폴트 클래스에 접근 안되네
	
		
	}
}
