package chap_07;

public class _07_This {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";// 까망이(최신형)
		//그냥 까망이만 하니까 물건 잘 안팔려서 이름을 바꿔볼가 한다
		//뒤에 최신형을 붙이면 좀 더 주목하지 않을까~
		//modelName에 바로 넣어줘도 되는데
		//BlackBox 클래스에 이걸 추가해주는 메소드를 추가 해보자
		b1.appendModelName("(최신형)");
		//void appendModelName(String modelName) {}
		//이거 해주긴 귀찮으니까.
		//빨간색 에러에 마우스 대면 추가해주는거 클릭해봐.
		//블박 클래스에 void 부터 해서 자동생성해줌
				
		System.out.println(b1.modelName);
		
		//근데 걍 이렇게만 하면 걍 계속 까망이로 나오네?
		//블박에서 modelName =+ modelName 이거때문에 그럼
		//필드(인스턴스 변수)와 파라미터 매개변수 이름이 같아서 그래
		//modelName =+ modelName 이건 둘다 파라미터로만 받은거
		//파라미터(전달값)로 모델네임 받은걸 또다시 모델네임에 더하는 꼴밖에 안됨.
		//전달값으로 (최신형)(최신형)이것만 정해준거.
		//전달값(파라메터)는 출력하는 값이 아니잖아?
		//입력값->함수->출력값 이 나와야 하는거지.
		
		
		
		

		
	}
}
