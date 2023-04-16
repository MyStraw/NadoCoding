package chap_07;

public class _10_AccessModifier {
	public static void main(String[] args) {
		// 캡슐화(Encapsulation). 서로 연관된것 끼리만 한 캡슐에 담는다. 변수, 기능들
		// 정보은닉(Information hiding). 객체 허용하는 메소드로만 접근 가능하게.
		
		
		// 접근제어자. 카페 전체공개, 특정회원공개 등등. 글열람 범위제한
		// 총 4개가 있다.
		// private : 해당 클래스 내에서만 접근 가능
		// public : 모든 클래스에서 접근 간으
		// default : (아무것도 적지 않았을때) 같은 패키지 내에서만 접근 가능. chap7끼리만
		// protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능.
		//(디폴트랑 같지만, chap6에서 chap7에서 자식일땐 접근가능. 상속을 이해해야돼!
		
		//앞장에서 게터세터에서 가격정보를 세터로 값을 집어넣었어도 인스턴스로 값을 넣을수 있는게
		//문제였다. 이걸 접근제어자로 막아보자. 9장 코드 복사
		// 블랙박스 리퍼
		
		BlackBoxRefurbish b1 = new BlackBoxRefurbish();
		b1.modelName = "까망이";
//		b1.resolution ="FHD";
		b1.setPrice(200000);  //원래 b1.price = 200000; 이거던걸 바꿈. 아래들도 다.
		b1.color = "블랙";

		
		b1.setPrice(-5000); 
//		System.out.println("가격 : " + b1.getPrice() + "원"); //겟프라이스를
		//private로 바꾸면?

		
		System.out.println("해상도 : " + b1.resolution);
		

		System.out.println("-------------");
		
		BlackBoxRefurbish b2 = new BlackBoxRefurbish();
		b2.setModelName("하양이");
		b2.setPrice(-5000); 
		b2.setColor("화이트");

//		System.out.println("가격 : " + b2.getPrice() + "원");
		System.out.println("해상도 : " + b2.getResolution());
		
//		b2.price = -5000; //이걸 못하게 하려면?
		//블박 리퍼비시에서 프라이스 필드에 private 달아버리면
		//게터 세터로 사용하는거 외에 객체호출로 하는걸 못하게됨.
		
		
	}

}
