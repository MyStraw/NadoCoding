package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

//Final
public class _17_Final {
	public static void main(String[] args) {
		//상수때 공부했다..? 변수를 final로 선언하면 선언과 동시에 초기화를 하고
		// 그 이후에 값을 사용할순 있지만 변경하는건 불가
		//chap_01 에 _05_랑 _06_ 참고
		//액션캠.java 만듦
		
		ActionCam actionCam = new ActionCam();
//		actionCam.lens = "표준렌즈"; //광각으로 설정해놨는데 여기서 표준으로 해놨네. 못바꾸게 못하나?
		//final 달자마자 여기 lesn에 빨간불 들어온다.
		//private로 접근제어자를 달아주는 방법도 있다. 하지만 private는 여전히 해당클래스에선 바꿀수가 있다.
		//완전히 고정하고 싶으면 액션캠 가서 final 달아줘라
		actionCam.recordVideo(); //레코드 비디오 호출. 부모클래스에 정의돼있는걸 호출
		//actionCam이 참조하는 ActionCam 클래스의 인스턴스 메소드인 'recordVideo()'를 호출
		//ActionCam의 인스턴스를 만들었는데, ActionCam은 또 Camera가 부모클래스니까...
		//actionCam은 ActionCam 클래스의 인스턴스인데 이 클래스의 recordVideo를 부른거지만
		//사실 recordVide는 부모클래스인 Camera에 있는것이므로 곧 Camera의 recordVideo();를 부른것이다.
		actionCam.makeVideo();
		
		System.out.println("----------------");
		
		SlowActionCam slowActionCam = new SlowActionCam();
//		slowActionCam.recordVideo(); 액션캠 파이널 해버리니 이것도.
		slowActionCam.makeVideo(); // 메소드 오버라이딩 잘 됐다~ 이걸 못하도록 바꿀라면? final 쓸수있다.
		
		
		//final 위치
		// public (final) class..
		// public (final) void...
		// public > abstract > static > final
	}
	
}
