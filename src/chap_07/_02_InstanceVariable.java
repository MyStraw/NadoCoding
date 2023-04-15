package chap_07;

public class _02_InstanceVariable {
	public static void main(String[] args) {
		//처음 만든 블랙박스 제품
		
		BlackBox b1 = new BlackBox();// 객체 b1 만들고
		b1.modelName = "까망이"; // b1. 까지 하면 뭘 할수있는지 목록 나온다. 거기서 골라.
		b1.resolution = "FHD"; //. 이게 호출이다.
		b1.price = 200000;
		b1.color = "블랙";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);//b1 1개가 가지고 있는 정보들을 이렇게 출력할수있다.
		
		System.out.println("-------------------------");
		
		//또 하나 제품 더 만들라면?						
		// 새로운 블랙박스 제품
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
		b2.resolution = "UHD";
		b2.price = 300000; 
		b2.color = "화이트";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
		
		//설계도(BlackBox.java)를 따라 정보에 따라서 객체 생성.
	}

}
