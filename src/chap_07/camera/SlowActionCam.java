package chap_07.camera;

public class SlowActionCam /*extends ActionCam*/ { //액션캠에 final 붙이니 상속 안됨.
	
	public String name; //액션캠에 final 붙이니 직접 만들어 써야됨.
	
	public SlowActionCam() {
		// super("슬로우 액션 카메라"); //이거 쓸라고 하니까 부모에서 이걸 받는 생성자(메소드)를 안만들어놨네
		// 그냥 디스로 하자.
		this.name = "슬로우 액션 카메라"; // 조상인 카메라 클래스걸 지정.
	}
//
//	public void makeVideo() {// 액션캠꺼 복붙
//		System.out.println(this.name + " : " 
//	+ this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
//	액션캠에서 파이널로 바꿔버리니 이거 사용 못하게됨.
//	}
	
	//final로 상속이 막히면
	
	public void makeVideo() {
		System.out.println("자체 개발한 비디오 제작 기능"); //이런식으로 직접 만들어 써야해.
	}

}
