package chap_06;

public class _00_필드값연습 {
	//필드 선언=속성. 이름, 나이 등등을 말하는것. 선언을 일단 해.
	private String name;
	private int age;
	
	
	//생성자 => 입력받은 이름과 나이를 이용하여 객체의 이름과 나이를 초기화.
	
	public _00_필드값연습(String names, int ages) {//네임, 에이지는 파라미터, 매개변수. 필드와 다르다.
		this.name = names;
		this.age = ages;
	} //항상 = 를 기준으로 뒤에서 앞으로 읽어봐. 파라미터의 값을 필드에 넣는다!
	
	// 매서드
	public void introduce() { //객체의 이름과 나이를 출력
		System.out.println("제 이름은 " + name);
		System.out.println("제 나이는 " + age);
		
	}
	
	
	// Person 객체를 생성하여 필드에 접근할수 있다.
	class Main{	
	public static void main(String[] args) {
		_00_필드값연습 person = new _00_필드값연습 ("Alice", 25);
		
		//필드에 직접 접근을 왜 안해? 내말이
		//필드에 직접 접근하는 것은 좋은 방법이 아니지만, 다음과도 같이 가능.
		
		person.name = "Bob";
		
		
	}
		
	}

}
