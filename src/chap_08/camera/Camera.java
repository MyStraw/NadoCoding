package chap_08.camera;

public abstract class Camera { //추상 클래스
	//abstract만 바뀌었을뿐. 다시 01로.
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 구현해야 하는 추상메소드. 이름만 적어준다.
} //보통 몸통을 정의해줘야 하는데 이건 이름만 적고 몸통, 즉 {} 이게 없다. 
//선언만 하고 세미콜론으로 끝. 이 Camera라는 클래스를 상속하는 자식 클래스에서 이 메소드를 구현하도록 해줘야한다.
