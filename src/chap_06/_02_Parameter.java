package chap_06;

public class _02_Parameter {
	// 전달값, parameter 이 있는 메소드
	//거듭제곱 계산해주는 메소드 만들자
	//2 -> 2*2 = 4
	//거듭제곱을 파워 라고
	//여기선 소괄호 안에 필요한 값을(정수) 넣어준다. int number에서 받아서
	//1  usages
	public static void power(int number) { // Parameter, 매개변수, void 니까 반환값 없다.여기서 프린트
		int result = number * number; //result에 결과값을 저장할거다
		System.out.println(number + " 의 2승은 " + result);
	}
	// 메소드 전달값(알규)를 2개 이상 할수도 있다

	// 2 usage (이 안의 값을 2개=전달값을 2개. 파라미터를 2개. 매개변수.) 
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) { // i나 j가 꼭 어디 표출되거나 쓰여야 되는게 아니다
			// 몇번 반복인지 조건으로 쓰는것일뿐.
			// 여기전 exponent 보다 작을때까지만 계속 돌린단 얘기다. 단지 그런조건일뿐.

			result *= number;// i가 0번째일때 한바퀴 돌면, 그리고 i는 1이 되고
			// result = 1인 상태에서 number = 2 이니까 2가 된다
			// {괄호를 못벗어 났으므로 다시 for로 와}
			// i는 1일때 두바퀴째. result는 앞에서 초기화 안됐으므로 여전히 2
			// 2 x 2(number)니까 4다
			// i가 2인, 3바퀴째. exponent가 3이니까 이게 마지막 바퀴다.
			// 앞에서 result가 4인채 끝났으니, 4x2 = 8로서 result가 끝남

		}
		System.out.println(number + " 의 " + exponent + " 승은 " + result);

	}

	public static void main(String[] args) { //호출은 메인영역에서 메소드 이름 똑같이 적고. power(); 괄호안에 값 넣어.
		// 전달값, Parameter
		// 2 -> 2 * 2 = 4
		// 3 -> 3 * 3 = 9
		// 이런 메소드 만들어 볼거야

		// Argument = 인수. 2라는 값을 power에 전달. 2를 전달. 
		// 호출되어 올라가면 파워 메소드에 2라는 인수를 number에 저장. 이때 이 number를 Parameter(전달값), 매개변수라 한다.
		power(2); // 2 * 2 = 4
		power(3);

		powerByExp(2, 3); // 2* 2 * 2 = 8
		powerByExp(3, 3);
		powerByExp(10, 0);

	}

}
