package chap_06;

public class _04_ParameterAndReturn { // 02번이랑 같이 비교하면서 봐봐. void 유무로 전달 반환 갈린다.
//전달값과 반환값을 함께 가지는 메도스
	public static int getPower(int number) { // return을 할거니 void 없애
		int result = number * number; // 2번에선 바로 출력가지 했지만
		// 이번엔 반환만 하고 밑에서 반환값을 불러들여 밑에서 출력해보자
		return result;
		// return number * number;
	}

	public static int getPowerByExp(int number, int exponent) { // 위에서 인트로 했으니까
		// 여기서도 인트로 했다. 받아와야 하니가 get이란 이름.
		// number*number 이란걸 반환했고 그걸 받아주면 돼.
		int result = 1;
		for (int i = 0; i < exponent; i++) { // i나 j가 꼭 어디 표출되거나 쓰여야 되는게 아니다

			result *= number;
		}
		return result; //_02_에서 만든거에서 이거 한줄만 엄으면 끝.
	}

	public static void main(String[] args) { //
		// 전달값과 반환값이 있는 메소드
		// 맨 윗줄 getPower 메소드 호출. 전달값 2를 넣어보자~ 4가 나오네
		// 근데 겟파워를 하면 전달값을 받고 그에 해당하는 반환값이 생기는데
		// 이걸 또 저장해줘야지. 이걸 저장해주기 위한 변수를 또 선언해야지
		// 그러니 int로 또 선언. returnValue
		// 정리. getPower메소드를 호출하면서 2라는 값을 전달하고
		// ->그럼 겟파워로 올라가봐. 올라가서 2라는 값 전달 받으면 그 아래로 내려가서
		// 2*2를 한 결과를 내주고 그걸 result 변수로 선언해주고
		// 그 result 값을 다시 return으로 반환해 돌려준다.
		// 그럼 그 반환된 값을 받아서 retVal로 받고
		// 그걸 프린트
		int retVal = getPower(2); // 2*2=4 리턴 밸류
		System.out.println(retVal); // 4

		retVal = getPower(3);
		System.out.println(retVal); // 3 * 3 = 9

		retVal = getPowerByExp(3, 3); // 3*3*3 = 27 // 반환형태가 어차피 int니까 retVal 쓸수있지.
		System.out.println(retVal);

		System.out.println(getPowerByExp(2, 4)); // 2*2*2*2 = 16
		//retVal로 전달 안받아도 바로 이렇게 해줘도 된다.

	}

}
