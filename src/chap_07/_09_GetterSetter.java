package chap_07;

public class _09_GetterSetter {
	public static void main(String[] args) {
		// _08_에서 했던 생성자를 주석처리
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
//		b1.resolution ="FHD";
		b1.price = 300000;
		b1.color = "블랙";

		// 할인행사
		b1.price = -5000; // 하려고 하는데 5000원을 깎아야 하는데 5000원을 주는걸로 잘못 찍음
		System.out.println("가격 : " + b1.price + "원");

		// 고객 문의. 해상도 정보를 주석처리 하는 바람에 안보임
		System.out.println("해상도 : " + b1.resolution);// 값이 null로 나옴
		// 블랙박스 클래스 제일 아래로

		System.out.println("-------------");
		
		BlackBox b2 = new BlackBox();
		b2.setModelName("하양이");
		b2.setPrice(-5000); //-5000으로 해도 100000이 나오네.
		b2.setColor("화이트");

		System.out.println("가격 : " + b2.getPrice() + "원");
		System.out.println("해상도 : " + b2.getResolution());
		
		b2.price = -5000;// 이걸로 여전히 설정할수 있다. 이거못하게 하는걸 다음장에서.
		
		//b1에 비해 합리적인 정보가 나온다
		//게터와 세터 이용하면 이상한값에 대한 오류를 줄일수 있고
		//값을 가져오는 과정에서도 값이 없다거나 이상할때 대안으로 줄수있는 값을
		//설정할수 있다.

	}
}
