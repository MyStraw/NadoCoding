package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스 .. extends 부모 적으면 상속.
//	public String name;

	public FactoryCam() {
	//	this.name = "공장 카메라";//생성자에서 다 name 카메라를 쓴다
		super("공장 카메라"); // super(); = 부모 클래스의 생성자에 바로 접근.
	}
	
	public void recordVideo() { //오버라이딩 하긴 했지만, 부모꺼 + 그다음꺼까지.
		// 동영상 녹화
//		System.out.println(this.name + " : 동영상을 녹화합니다.");
		super.recordVideo(); //위에 부모하는 역할을 하고 나서 밑에꺼 한다. 일일이 다 쓰고 또 고치고 할필요 없음.
		detectFire();
			
	}
	
//	public void takePicture() {
		//사진 촬영
//		System.out.println("사진을 촬영합니다.");
//	}
	
//	public void recordVideo() {
//		//동영상 녹화
//		System.out.println("동영상을 녹화합니다.");
//	}
//	
	public void detectFire() {
		// 화재 감지
		System.out.println("화재를 감지합니다.");
	}
//같은 패키지 내에 총 3개의 카메라를 만들었다(클래스)
	
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 화재 감지");//Camera 껄 그대로 가져오면서 뒷 내용을 바꿔. 덮어써.
		//오버라이딩. 메소드를 새롭게 재 정의
	}
}
