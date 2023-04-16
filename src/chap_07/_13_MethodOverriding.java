package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
	public static void main(String[] args) {
		//메소드 오버라이딩 :  자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
		//카메라에 새로운거 하나 추가해보자
		
		Camera camera = new Camera();
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedCam = new SpeedCam();
		
		camera.showMainFeature();
		factoryCam.showMainFeature();
		speedCam.showMainFeature();
		
		//다 오버라이딩 하고 보면 카메라에서 적은 showMain이랑 다른글이 나온다.
	}

}
