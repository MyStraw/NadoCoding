package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스 .. extends 부모 적으면 상속.
//	public String name;

	public FactoryCam() {
		this.name = "공장 카메라";
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
