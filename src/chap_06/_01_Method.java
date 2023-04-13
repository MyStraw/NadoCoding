package chap_06;

public class _01_Method {
	// 메소드(기능하는 코드들의 묶음, 파이썬의 함수)
	// 메소드 정의
	public static void sayHello() {//메소드 만든거. 인사를 하는 동작 혹은 기능.main 위에 처음으로 썼네
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

}//메소드 찐녹. public static라고 일단 다 적어. 메소드는 주로 동사를 쓴다. 동작이기때문에.
//낙타방법을 쓴다. 메소드를 쓰는건 메소드를 호출
//다른데서 만든 메소드를 실행시키는것(호출=실행)
//메소드명(); 이게 메소드 호출법(연녹)
//메소드 호출이 되어지면 위에 sayHello 메소드 안으로 진입하게 된다. 메소드 안의{} 모든 문장들을
//위에서부터 실행하고 나면 다시 아까 하던 순서로 돌아와 다시 아래로 내려간다.
//한번 정의하고 나면 언제든 호출이 가능하다.
