package chap_07;

//메인 메소드가 필요없다
public class BlackBox {
	String modelName;// 모델명// 필드 = 클래스 내부에서 사용할수 있는 변수.
	String resolution;// 해상도
	int price;// 가격
	String color;// 색상
	// 4개의 인스턴스 변수 혹은 필드
	// 블랙박스의 설계도.
	int serialNumber; // 시리얼 번호

	static int counter = 0;// 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해 값을 증가) 1,2,..
	// 기본생성자로 가보셈. 이건 static이 붙어서 클래스 변수가 된다.

	// 자동 신고 기능 변수를 만들어.

	static boolean canAutoReport = false; // 자동 신고 기능
	// static 클래스 변수. 클래스 내의 클래스 변수. 위에 Static 없이 붙은건 인스턴스 변수(필드).
	// static 붙이면 이 클래스에서 만들어지는 모든 객체에 똑같이 적용이 되는것

	// 근데 불리언 값만 가지곤 신고할수가 없잖아.
	// 신고하는 기능이 있어야지.
	// 클래스는 위처럼 변수(필드)정보를 저장할수도 있지만
	// 클래스 내에서 기능을 정의해서 기능을 객체가 사용하게 할수도 있다.
	// 그 기능이 메소드.

	// 생성자.클래스 명과 똑같이 만들어
	// 객체가 생성될때 자동으로 호출되는 메소드
	BlackBox() {
		// 여기서 아래 생성자를 호출하고 싶다면
//		System.out.println("기본 생성자 호출");
//		this.serialNumber = ++counter; //0이었으니 호출되면 1이 되겠지.
		// 1이 serialNumber로 들어감. 그다음 객체 만들어지면
		// counter 값은 인스턴스 변수(필드)값이 아니기 때문에 1로 업데이트 되어있는 상태.
		// static 이라서 그런가?. 모든곳에서 공통적으로 사용되는 값.
//		System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
		// 근데 여기까지 하면 아래 생성자는 시리얼 넘버 생성이 안되잖아?
		// 그럴땐 this를 이용
		// this()는 다른 생성자를 호출하는 특별한 형태의 키워즈.

	} // _08_가서 실행해봥

	// 메소드 오버로딩 하는것처럼 생성자도 여러개 만들수 있다.
	BlackBox(String modelName, String resolution, int price, String color) {
//		this(); //기본생성자 호출. 그럼 기본생성자 호출한걸 먼저 실행하고 이 밑에껄 실행하게 된다.
//		System.out.println("사용자 정의 생성자 호출");
//		this.modelName = modelName; //필드값에 파라미터로 받은 모델네임을 정의해 줌.
//		this.resolution = resolution;
//		this.price = price;
//		this.color = color;
		// 다시 _08_
	}

	void autoReport() {
		if (canAutoReport) { // if 뒤에 변수만 입력하면 = true로 자동으로 인식한다.
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");

		} else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		} // 이걸 b1에서 사용해보자. _04_로 가셈

	}

	void insertMemoryCard(int capacity) {
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 " + capacity + "GB 입니다.");

	}

	int getVideoFileCount(int type) {
		if (type == 1) {// 일반영상
			return 9;
		} else if (type == 2) { // 이벤트영상
			return 1;
		}
		return 10; // 전체 영상개수
	}
	// _05_시작

	// showDateTime : 날짜정보 표시여부
	// showSpeed : 속도정보 표시여부
	// min : 영상 기록 단위(분)

	void record(boolean showDateTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if (showDateTime) {
			System.out.println("영상에 날짜정보가 표시됩니다.");

		}

		if (showSpeed) {
			System.out.println("영상에 속도정보가 표시됩니다.");

		}
		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");

	}

	// 오버로딩을 해준다
	void record() {
//		System.out.println("녹화를 시작합니다.");
//		System.out.println("영상에 날짜정보가 표시됩니다.");
//		System.out.println("영상에 속도정보가 표시됩니다.");
//		System.out.println("영상은 5분 단위로 기록됩니다.");
		// 근데 이렇게 하면 위에서 바꾸면 이것도 또 따로 바꿔줘야한다.
		// 이것마저도 불편해

		record(true, true, 5); // 위의 네줄을 한방에.
		// 위에껄 걍 호출해서
	}

	// _06_할겨. 블랙박스 사용하다가 문제 생기면
//	블랙박스를 통해서 바로 고객센터로 전화
//	지금 무슨기능 안돼요~. 원격조치.
//	이 전화하는 기능을 만들어 보자. 생각해보면
//	클래스로 만들어진 서로다른 객체라도 서비스 전화번호는 다 같다
//	대표번호 하나가 있지. 이건 모든객체에 공통적으로 사용되는 메쏘드 만들자.

	static void callServiceCenter() {// 모든곳에서 다 쓸거니 static
		System.out.println("서비스 센터(1588-0000)로 연결합니다");
		// 앞에꺼랑 다르게 static이 붙으면 클래스 메소드
		// 이게 붙으면 이 안의 내용이 다 똑같이 된다.
		// 앞에처럼 void로 객체로 호출되는 것들은 불리는 객체에 따라
		// 내용이 달라질수 있는데 이건 아니다.
		// 모든 객체에 공통적 적용.

		// 클래스 필드인 모델네임을 바꿔보면?
		// modelName = "test"; // 에러뜬다.
		// canAutoReport는 가능한가?

		// canAutoReport = false;// 이건 가능하네
		// 스태틱으로 선언한 클래스 변수는 바로 사용가능한데
		// 인스턴스 변수(필드)는 객체가 만들어 져야 가능.

	}

	void appendModelName(String modelName) {
		modelName += modelName;
		// 인스턴스 변수(필드) =+ 전달값(파라메터)로 받은걸 뜻해야해
		// 근데 필드명이랑 같아버리면 그저
		// 전달값(최신형) += 전달값(최신형) 으로만 하고 끝나버림
		// 그럼 (최신형)(최신형) 이 상태가 되겠지? 파라메터는?
		// 하지만 우리는 필드값에 더해서 출력하고 싶은거란 말이야.
		// 이때 this로 클래스의 인스턴스변수(필드)명인걸 짚어줘야한다.
		// 이건 클래스 인스턴스의 변수명이다!
		// 만약 이름이 달랐다면 this 할필요가 없어.
//	void appendModelName(String s) {
//		modelName += s; // 이렇게 하면 상관없었음.

		this.modelName += modelName;

	}

	// Getter & Setter. 게터는 값을 가지고 오는거. 세터는 값을 설정하는거.
	String getModelName() {
		return modelName;

	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	String getResolution() {
		if (resolution == null || resolution.isEmpty()) {
			return "판매자에게 문의하세요.";
		}
		return resolution;

	}

	void setResolution(String resolution) {
		this.resolution = resolution;
	}

	int getPrice() {
		return price;

	}

	void setPrice(int Price) {
		if (price < 100000) {
			this.price = 100000;
		} else {
			this.price = price;
		}
	}

	String getColor() {
		return color;

	}

	void setColor(String color) {
		this.color = color;
	}

}