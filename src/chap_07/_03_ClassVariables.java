package chap_07;

public class _03_ClassVariables {
	public static void main(String[] args) {
		//블랙박스가 충돌됐을때 어느정도 충격 이상이면 자동으로 경찰에 정보전달을 한다 가정
		
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		System.out.println(b1.modelName);
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
		System.out.println(b2.modelName);
		
		//자동으로 경찰에 신고되는 기능을 넣어보자.BlackBox.class로 가라
		// 특정 범위를 초과하는 충돌 감지 시 자동 신고기능 개발 여부
		
		System.out.println(" - 개발 전 - ");
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자도 신고 기능 : " + b2.canAutoReport);
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
		//static 붙은 클래스 변수는 객체별로 다른게 아니고 클래스 다 공통.
		//그러니 객체별로 b1. b2. 할필요 없이 다 똑같이 공통적용이니까
		//클래스의 변수이니까 객체. 으로 해도되긴 하지만
		//클래스. 으로 쓰는게 더 권장된다.
			
		// 기능 개발
		BlackBox.canAutoReport = true;
		//블랙박스 클래스의 canAutoReport 값. 이걸 바꿔줭
		//뒤에는 변수이니까 우리가 int money = 10000; 이렇게 하는식으로
		//처음 한번 int money 외쳐주면 그담부턴 int 안적어도 되잖아
		//그거처럼 바로 canAutoReport 변수를 = true; 해주면 되는건데
		//어디에 있는건진 알아야지. BlackBox클래스 에서 만든 클래스 변수이니
		//그 클래스 박스를 호출해줘야 한다.
		//.을 기준으로 왼쪽은 변수가 만들어진 대상의 위치가 되고, 오른쪽은 변수로 내가 쓸것을 말함. 
		
		System.out.println(" - 개발 후 - ");
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자도 신고 기능 : " + b2.canAutoReport);
		System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
	}

}
