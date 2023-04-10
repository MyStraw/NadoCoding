package chap_05;

//의자 배열을 떠올려보자
//식당 의자인지, 4개가 붙어있는 공항 의자인지

public class _01_Array {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";

		System.out.println(coffeeRoss + "하나"); // 아메리카노 하나
		System.out.println(coffeeRachel + "하나");
		System.out.println(coffeeChandler + "하나");
		System.out.println(coffeeMonica + "하나");
		System.out.println("주세요");

		// 배열 선언 첫 번째 방법
		// String[] coffees = new String[4]; //크기4에 해당하는 배열. 외워!중요!
		// 공항 의자 4개 한묶음 만들었다고 생각

		// 두 번째 방법
		// String coffees[] = new String[4]; // 똑같다. 자료형(String)뒤에 적어두면 보기 좋지 않을까

		// coffees[0] = "아메리카노"; // 의자 4자리 중에 어디에 배치? // index로 위치 설정해주는데 index는 0부터 시작
		// coffees[1] = "카페모카";
		// coffees[2] = "라떼";
		// coffees[3] = "카푸치노";

		// 세 번째 방법
		// String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"}; //선언과 동시에
		// 배열.
		// string[] 대괄호 안에 아무것도 안넣고 중괄호{} 안에 컴마로 구분하면 알아서 배열크기 판단한다. 4개만큼.

		// 네 번째 방법
		String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" }; // 세번째랑 같은데 new String[]생략
		// 배열하고 값도 바로 집어넣고.
		System.out.println("-----------------------------");

		// 커피 주문
		System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
		System.out.println(coffees[1] + " 하나");
		coffees[2] = "에스프레소"; // 값 변경
		System.out.println(coffees[2] + " 하나");
		System.out.println(coffees[3] + " 하나");
		System.out.println("주세요");

		// 다른 자료형에서도 가능
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		double[] d = new double[] { 10.0, 11.2, 13.5 }; // 중괄호 안의 형태는 선언한(double)과 같은 값이어야 한다!
		boolean[] b = { true, true, false };

	}
}
