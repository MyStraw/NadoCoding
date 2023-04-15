package chap_07;

public class _01_Class {
	public static void main(String[] args) {
		// 객체 지향 프로그래밍 (OOP : Object - Oriented Programming)
		// 유지보수 용이
		// 높은 재사용성
		
		// 차량용 블랙박스을 예로들어 블박의 정보가 이처럼 있다
		// 모델명, 해상도, 가격, 색상
		String modelName = "까망이";
		String resolution = "FHD";
		int price = 200000;
		String color = "블랙";
		// 프라이스가 정수라 배열이 안된다. 배열은 같은타입끼리.
		
		// 새로운 제품을 개발. 또 새로운 블박의 4개정보가 필요.
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 300000;
		String color2 = "화이트";
		
		// 또다른 제품을 계속 개발? 또 계속 입력해?. 변수가 너무 많이 필요.효율적이지 않다.
		// 이때 클래스라는걸 써볼수있다.
		// 서로 다른 자료형이지만 서로 비슷한것들기리 모아둔 하나의 형태
		// 클래스 첫 글자는 대문자. 낙타형으로. BlackBox.class
		// 클래스로부터 객체를 만들어보자.
		// BlackBox 클래스는 앞의 이런 정보들을 한꺼번에 관리하기 위함.
		
		BlackBox bbox = new BlackBox(); //bbox 라는 객체를 만드는 과정.
		// 클(래스이름) 변(객체이름) = 뉴 클(래스이름). 클변뉴클
		// 블랙박스 크래스로부터 bbox 객체 생성
		// bbox 객체는 BlackBox 클래스의 인스턴스
		// 클래스는 설계도. 객체는 설계도로부터 만들어진 결과물
		// 종이접기 책이 클래스. 종이학을 만들어. 여러마리 종이학 만들면 이게 각각 다 객체.
		// 이때 이 객체들, 종이학들은 클래스의 인스턴스라고 한다.
		
		BlackBox bbox2 = new BlackBox(); // 앞에랑 다른 블랙박스 객체.
		//앞에서 서로다른 정보들 관리하기 위해 만들었지~ 어떻게 하는지 다음장에서 보자.
		
		
		
	}

}
