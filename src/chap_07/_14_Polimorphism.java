package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polimorphism {
	public static void main(String[] args) {
		// 다형성
		// (IS-A) : 상속관계. is a 관계. FactoryCam is a Camera. 이건 성립. 역은 성립 안한다.

		// 상속은 is-a 관계
		// class Person : 사람
		// class Student extends Person : 학생 (학생은 사람이다. Student is a person)
		// class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

		Camera camera = new Camera();
//		FactoryCam factoryCam = new FactoryCam();
		Camera factoryCam = new FactoryCam(); //FactoryCam이 Camera에게 상속돼있으니 클변 = 뉴클에서 클 두개가 같지않다.
	
//		SpeedCam speedCam = new SpeedCam();
		Camera speedCam = new SpeedCam();
				
		//클, 변 = 뉴, 클 여기서 클래스를 부모클래스로 해줄수 있다. 다형성 이용.
		//부모클래스는 자식의 객체를 만들수있다.
		
		camera.showMainFeature();
		factoryCam.showMainFeature();//자식을 호출했는데 똑같은 결과가 나온다.
		speedCam.showMainFeature();
		
		//형태가 다양하다~ 카메라라는 부모 클래스로 서로다른 객체를 만들어줄수 있다. 관리 편하네
		//이런 객체도 배열로 관리가 가능하다.
		
		System.out.println("----------------");
		
		Camera[] cameras = new Camera[3];
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new SpeedCam();
		//for each 반복문
		for (Camera cam : cameras) {
			cam.showMainFeature();
			
		//위와 똑같이 나온다.	
		// 참고! SpeedCam speedCam = new SpeedCam();과 같이 생성된 객체도 cameras 배열로 관리는 할 수 있습니다.
		}
		//근데 여기서 문제.
		System.out.println("----------------");
//		factoryCam.detectFire();
//		speedCam.checkSpeed();
//		speedCam.recognizeLicensePlate();
//		지금 이거 쓸수가 없다. 위에서 카메라(부모) 클래스로 정의를 해서 부모클래스의 메소드만 접근가능. 자식클래스의
		//detecFire나 checkSpeed 같은걸 쓸수가 없다. 부모클래스의 메소드만 사용가능.
		//호출을 바로 해볼수가 없으니 어떻게 할까?
		
		//이 객체가 어느 클래스 소속인지 확인 => instanceof
		if (camera instanceof Camera) { //카메라 클래스의 카메라 인스턴스냐?
			System.out.println("카메라입니다.");
		}
		
		if (factoryCam instanceof FactoryCam) {//형변환
//			(double)3; 형변환 할때 형변환 하려는 (자료형)3 3이란 정수를 해당 자료형으로 바꿔준거 기억해?
			//chap_01의 _07_형변환을 보도록. 그거랑 같은 형식
//			factoryCam.detectFire(); 이것만으론 호출이 안되지? 앞에서 factoryCam객체를 부모 클래스로 만들었으니.
            ((FactoryCam)factoryCam).detectFire(); // 이걸 형변환을 이용해서 쓰면 된다.
            
			
		}
		
		if (speedCam instanceof SpeedCam) {
			((SpeedCam) speedCam).checkSpeed();
			((SpeedCam) speedCam).recognizeLicensePlate(); // 잘 뜬당
						
		}
		
		//참고!자바의 모든 클래스는 Object라는 클래스를 상속하고 있다. 오스트랄로피테쿠스 수준. 조상.
		//어떤 형태이건 간에 모든 클래스의 객체를 집어넣을수 있어서 한꺼번에 관리할수도 있다.
		
		Object[] objs = new Object[3];
		objs[0] = new Camera();
		objs[1] = new FactoryCam();
		objs[2] = new SpeedCam();
		
					

	}

}
