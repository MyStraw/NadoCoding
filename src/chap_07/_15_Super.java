package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
	public static void main(String[] args) {
		// Super
		// 공장카메라. 화재감지-> 동영상 녹화를 하면서 화재감지를 하겠지
		// 스피드캠. 촬영과 동시에 속도측정 후 차량번호 인식 하겠지
		// 오버라이딩 하면 되지 않겠나
		
		// 카메라 클래스에 있는 레코디 비디오랑 테이크 픽쳐를 각각 공장캠, 스피드캠에 복사해주고
		// 뒤이어 스피드체크, 속도측정 같은것도 덧붙여 주면 차례로 할것
		// 부모클래스의 메소드, 생성자 호출 => super
		
		FactoryCam factoryCam = new FactoryCam();				
		SpeedCam speedCam = new SpeedCam();
		
		factoryCam.recordVideo();
		System.out.println("-----------------");
		speedCam.takePicture();
		
		//근데 이래도 돼? 상속한 이유가 부모의 변수, 메소드 등을 자식에서 사용하기 위해.
		//공통부분은 쓰고 아닌부분은 자식에서 만들어쓰기 위함인데... 또 다시 만들었다. 상속의 의미가 사라지지
		
	}

}
