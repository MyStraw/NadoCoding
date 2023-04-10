package chap_06;

public class _01_Method {
	// 메소드(기능하는 코드들의 묶음, 파이썬의 함수)
	// 메소드 정의
	public static void sayHello() {//메소드 만든거. main 위에 처음으로 썼네
		System.out.println("안녕하세요? 메소드입니다.");		
	} // 이건 정의만 한거다. 사용은 = "호출한다"
	
	
	
	
	public static void main(String[] args) {
		// 메소드 호출
		System.out.println("메소드 호출 전");
		sayHello(); // 코드는 위에서부터 차례로 하는건데 이건 맨 위로 올라가서 저 메소드 다 이행한뒤에 다시 뒤에꺼.
		sayHello(); // ctrl + alt + 방향키 위, 아래 하면 인텔리J ctrl+D 처럼 문장 복사해준다.
		sayHello(); // 
		System.out.println("메소드 호출 후");
		
		
	}

}
