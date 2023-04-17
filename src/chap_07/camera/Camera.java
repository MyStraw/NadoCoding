package chap_07.camera;

public class Camera { // 부모 클래스
	//public String name;
	//private String name;// 이러면 다양한 문제생김. 게터세터 만들어서 할수도 있다.
	public String name;
	
	public Camera() { // ctrl, alt, s 눌러서 제너레이트 컨스트럭터(생성자) 만들어줘.
		//this.name = "카메라"; //생성자에서 다 name 카메라를 쓴다. 카메라 필드를 프라이빗 만들어 버리면?
		this("카메라"); // 바로 아래 생성자를 받음.
	}
	
	protected Camera(String name) {
		this.name = name;
	}

	public void takePicture() {
		// 사진 촬영
		System.out.println(this.name + " : 사진을 촬영합니다.");

	}

	public void recordVideo() {
		// 동영상 녹화
		System.out.println(this.name + " : 동영상을 녹화합니다.");
			
	}
	//13장 시작
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동여상 녹화");
	}

}
