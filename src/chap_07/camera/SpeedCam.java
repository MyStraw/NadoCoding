package chap_07.camera;

public class SpeedCam extends Camera { // 자식 클래스
//	public String name;

	public SpeedCam() {
		//this.name = "과속단속 카메라";//생성자에서 다 name 카메라를 쓴다
		super("과속단속 카메라");
	}
	

	public void takePicture() {
		// 사진 촬영
//		System.out.println(this.name + " : 사진을 촬영합니다.");
		super.takePicture();
		checkSpeed();
		recognizeLicensePlate();

	}


//	public void takePicture()	{
//		// 사진촬영
//		System.out.println("사진을 촬영합니다.");
//		
//	}
//	
//	public void recordVideo() {
//		// 동영상 녹화
//		System.out.println("동영상을 녹화합니다.");
//	}

	public void checkSpeed() {
		// 속도 체크
		System.out.println("속도를 측정합니다.");
	}

	public void recognizeLicensePlate() {
		System.out.println("차량 번호를 인식합니다.");
	}

	@Override // ctrl alt s 로 오버라이드 바로 한거. @annotation 주석이긴 한데. 컴파일러에게 오버라이딩 하고있는거라고 알려줌.
	//부모대상중에 오버라이딩 대상 없으면 에러 뱉어준다.
	public void showMainFeature() {

		System.out.println(this.name + "의 주요 기능 : 속도측정, 번호 인식");

	}

}
