package chap_07.camera;

public final class ActionCam extends Camera {
	public final String lens;// = "광각렌즈"; //같은 메소드 내에서도 변경 불가.
	//"광각렌즈" 없이 초기화 없이 할수도 있다. 선언과 동시에 이처럼 초기화만 해줄수도 있지만
	//뒤에 광각렌즈 주석처리 해보자. 그리고 생성자에서 초기화 할수있다. 
	public ActionCam() {
		super("액션 카메라"); //카메라 클래스에서 기본 생성자가 this로 (String name)을 가리키니 이게 가능.
		lens = "광각렌즈"; //파이널 한다 하더라도 생성자에서 처리가능.
		//생성자는 어차피 객체가 만들어지는 시점에 동시에 호출되기때문에. 선언과 동시에 초기화 하는것과 같다.
	} //이건 오버로딩이 아니다.! Camera(부모) 클래스의 생성자를 호출하는 코드이다.
	// Camera 클래스에서 name의 기본값을 "카메라"로 지정했다.
	// 생성자가 객체의 필드값을 변경할수 있다.
	public final void makeVideo(){ //final 붙이면 자식에서 오버라이딩 못하게된다.
		//this.lens = "값변경 불가";
		System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
				
	}//이거만든 양반이 고집세서 아예 딴데서 못쓰게 하고싶다! -> 아예 클래스를 final로
	//아예 상속할수 없다. ->슬로우캠 상속 못하게됨.

}
