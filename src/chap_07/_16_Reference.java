package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
	public static void main(String[] args) {
		// 참조
		// 기본 자료형 (Primitive Data Types)int, float, double, long, boolean, ,,,
		// 메소드 가질수 없다. 소문자로 시작
		// 배열로 설정해주면 기본으로 설정되는 값이 있다.
		int [] i = new int[3]; 
		System.out.println(i[0]); //출력해보면 0이 나옴
	//	i[0]. 여기까지 찍어보면 쓸수있는 메소드 아무것도 안뜬다. 기본자료형은 메소드 안뜬다.
		
		
		double[] d = new double[3];
		System.out.println(d[0]); //0.0
		
		// 참조 자료형 (Non-Primitive, Reference Data Types) :  String, Camera, FactoryCam, SpeedCam
		// 메소드를 가질수 있다.
		// 대문자로 시작
		String[] s = new String[3];
		System.out.println(s[0]); //null
		
		Camera[] c = new Camera[3];
		System.out.println(c[0] == null);
	//	c[0]. 이건 여기까지 찍으면 메소드가 있다.
		
		//////////////////////////////////////////////////////
		System.out.println("------------------");
		int a = 10;
		int b = 20;
		b = a;
		System.out.println(a);
		System.out.println(b);
		b = 30;
		System.out.println(a);
		System.out.println(b); //이래도 10은 a 유지. a는 별개
		
		System.out.println("------------------");
		Camera c1 = new Camera(); //c1은 new Camera(); 이 풍선을 잡고있고
		Camera c2 = new Camera(); //c2도 자기 뒤에있는 풍선을 잡고있다
		c1.name = "카메라1";
		c2.name = "카메라2";
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2 = c1; // c2가 손을 뻗어서 c1의 풍선을 잡게한다. 가리키게 한다
		System.out.println(c1.name);
		System.out.println(c2.name); // 
		c2.name = "고장난 카메라"; //c2가 잡고있는, 즉 c1의 풍선의 이름이 바뀐다. 이게 참조.
		System.out.println(c1.name);
		System.out.println(c2.name); //어라? 이건 c1도 바뀐다.
		System.out.println("------------------");
		//기본자료형은 그냥 값 자체가 복사되는건데
		//참조자료는 가리키는 대상이 달라지는것. 정말 중요.
		changeName(c2); //아래에 메소드 만들고 불러
		System.out.println(c1.name);
		System.out.println(c2.name);//첫번째 풍선 바꿨으니 다바껴.
		
		//이 관계 끊고싶으면
		
		c2=null; //풍선에서 손을 놓는것
		System.out.println(c2.name); //에러뜬다.
		
	}

	public static void changeName(Camera camera) { //camera 참조 자료형. 첫번째 풍선을 가리킨다.
		camera.name = "잘못된 카메라"; //첫번째 풍선의 이름을 바꾸게 되는것.
		//그냥 String 처럼 Camera로 쓴것인가?. Camera클래스의 인스턴스를 changName 메서드의 매개변수(파라미터)로 전달받은건데...
		//camera 이게 뭔질 모르겠네. 참조 자료형이기 때문에 첫번재 풍선을 가리키고 있는것이라네
		//changName(c2); 이걸보면 이 c2가 Camera camera에 들어갈수 있는 매개변수란건데...
		//그럼 참조변수를 가리키는게 맞는거 같은데... c2가 참조변수니까.
		
	}
}
