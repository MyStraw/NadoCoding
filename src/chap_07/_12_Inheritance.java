package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
	public static void main(String[] args) {
		//챕터7 안에 카메라 패키지 새로 만들어서 3개의 카메라 클래스를 만들어
		//상속
		
		Camera camera = new Camera();// ctrl shift o
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedCam = new SpeedCam();
		
		System.out.println(camera.name);
		System.out.println(factoryCam.name);
		System.out.println(speedCam.name);
		
		camera.takePicture();
		factoryCam.recordVideo();
		speedCam.takePicture();
		
		factoryCam.detectFire();
		speedCam.checkSpeed();
		speedCam.recognizeLicensePlate();
		
		//같은 카메라인데 똑같은 동작들이 있었다. 이걸 다 일일이 해줬는데...
		//테이크픽쳐, 레코드비디오는 공통이잖아.
		//extends 하고 공통되는거 필드나 메소드 다 지워도 똑같이 됨.
		//상속은 한 부모로부터만 가능. 여러 부모로부터 상속받는건 안됨.
		
	}
	
}
