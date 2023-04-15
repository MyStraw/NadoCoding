package chap_07;
//생성자 :객체가 생성될때 자동으로 호출되는 메소드
public class _08_Constructor {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		//어떤 동작을 명시하고싶어
		//이 객체가 만들어질때 반드시 해야하는 동작
		//혹은 클래스에 정의되어 있는 인스턴스 변수들이 값을 설정하는 등등
		//초기화 작업을 생성자에서 한다
		//블박 가봐
		//여기까지만 하고 블박에 생성자 생성하고 프린트 해놓으니
		//b1 생성밖에 안했는데도 콘솔에 프린트 찍힌다
		
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		
		//생성자 이용하면 위의 작업을 편하게 할수있다. 다시 블박
		
		BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
		//위의 b1.~"까망이" 이 부분을 생성자 처리를 해놓음으로 해서 이줄 하나로 끝냄.
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
				
			
	}

}
