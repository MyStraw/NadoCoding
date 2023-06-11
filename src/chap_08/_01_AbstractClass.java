package chap_08;
//추상 클래스
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) //보여줄건 보여주고 숨길건 숨기고.
    	// 꼭 필요한 정보만 공개하는...(다음시간 인터페이스도) //추상클래스는 완성되지 않은 클래스.
        // abstract 라는 키워드를 써서.
        // 추상 클래스 (아직 완성되지 않은 클래스) => 객체를 만들수가 없다.
        // 추상 메소드 (추상 클래스 혹은 인터페이스에서만 사용 가능한, 껍데기만 있는 메소드)// 메소드 만들수도 있고 안만들어도 되고.
    	// 다만 추상메소드가 존재한다면 자식에서 구현을 해야만 된다
    	// Camera로 이동
    	
    	    	
        // Camera camera = new Camera(); // 만드려고 시도해도 안만들어져. 객체 생성될수 없다고.
    	// Camera 클래스 파일을 분명 만들었음에도 안만들어져. 추상=> 객체 생성이 안된다.
    	// 추상 클래스는 모호한, 완성되지 않은 클래스라서 객체를 만들수가 없다.
    	// 추상 클래스에선 추상메소드도 함께.
        FactoryCam factoryCam = new FactoryCam(); //카메라를 상속받은 팩토리 캠에선 객체생성이 된다.
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
        
        
        
//        FactoryCam factoryCam = new FactoryCam(); //카메라를 상속받은 팩토리 캠에선 객체생성이 된다.
//        factoryCam.showMainFeature();
//
//        SpeedCam speedCam = new SpeedCam();
//        speedCam.showMainFeature();
    }
}
