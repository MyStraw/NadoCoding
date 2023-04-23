package chap_07;

// 퀴즈. 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오
// 조건. 
//1.햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
//2.각 버거는 각각 클래스로 생성
//3.버거 이름을 담기 위한 name 변수 정의
//4.재료 정보를 표시하는 cook()메소드 정의
//5.공통 부분은 상속 및 메소드 오버라이딩으로 처리
//6.모든 클래스는 하나의 파일에 정의

//각 버거의 재료정보
// 햄버거 - 양상추 패티 피클
// 치즈버거 - 양상추 패티 피클 + 치즈
// 새우버거 양상추 패티 피클 + 새우

// 코드. 주어진 코드를 통해 테스트 하시오
// 실행결과
// 주문하신 메뉴를 만듭니다.
//------------------
//햄버거를 만듭니다.
//빵 사이에 들어가는 재료는?
//> 양상추
//+ 패티
//+ 피클
//-------------------
//치즈버거를 만듭니다.
//빵 사이에 들어가는 재료는?
//> 양상추
//+ 패티
//+ 피클
//-------------------
//새우버거를 만듭니다.
//빵 사이에 들어가는 재료는?
//> 양상추
//+ 패티
//+ 피클
//+ 새우
//-------------------
//메뉴 준비가 완료되었습니다.

public class _Quiz_07 {
	public static void main(String[] args) {

		HamBurger[] hamBurgers = new HamBurger[3];
		hamBurgers[0] = new HamBurger();
		hamBurgers[1] = new CheeseBurger();
		hamBurgers[2] = new ShrimpBurger();

		System.out.println("주문하신 메뉴를 만듭니다.");
		System.out.println("-----------------");
		for (HamBurger hamBurger : hamBurgers) {
			hamBurger.cook();
			System.out.println("-----------------");

		}
		System.out.println("메뉴 준비가 완료되었습니다.");
	}
}

//일단 2번에 해당하는 클래스 이름만 만들어 두고
//3번에 해당하는 이름 필드 선언이랑 4번 쿡 메소드도 선언만 한다.
//5. 상속관계를 찾아라! -> 양상추, 패티, 피클이 공통이다.
//즉 햄버거가 부모가 되면 되겠네. -> extends 해주면 되겠네
// 2번에 했던 name 필드선언을 각 클래스마다 다했는데, 이제 부모상속 관계 만들었으니
// 햄버거 제외한 치즈버거, 새우버거에서 name는 지워줘도 됨. 난 주석처리 해놓을게
//뉴 햄버거, 뉴 치즈버거, 뉴 새우버거로 배열을 만들어 넣어줬지?

// 근데 hamBurgers[0] = new HamBurger(); 이거에서 ()안에 뭐 넣어놓은게 없네.
// 객체는 만들었는데 객체의 값이 없어.
// 각각 우리가 생성자를 만들어가지고 String name 필드에 정의를 해주면 되겠네.


class HamBurger {

	public String name;
	
	public HamBurger(){ //필드 name에 넣을 생성자를 만들자. 얘는 빈생성자(기본생성자) 호출
		this("햄버거");// 
		//여기서 네임을 받아서 아래를 호출해서
		//this키워드를 생성자에서 사용하면 같은 클래스 내의 다른 생성자를 호출할수 있다.
		//여기서는 this("햄버거")를 했기때문에 String name을 매개변수로 쓰는 생성자를 호출하는것.
		//밑에 this.name = name;를 통해 객체의 name 필드에 전달된 문자열 "햄버거"가 할당된다.
		//이 햄버거는 파라미터로 String name에 해당.
	}
	
	public HamBurger(String name) { //여기까지 내려오게.
		this.name = name;
		
	}
	

	public void cook() {
	}

}



class CheeseBurger extends HamBurger {
//	public String name;
	
	public CheeseBurger() {
		super("치즈버거");
	}
	
	public CheeseBurger(String name) {
		this.name = name;
	}

	public void cook() {
	}
}

class ShrimpBurger extends HamBurger {
	
	
//	public String name;
	
	public ShrimpBurger() {
		super("치즈버거");
	}
	
	public ShrimpBurger(String name) {
		this.name = name;
	}

	public void cook() {
	}

}
