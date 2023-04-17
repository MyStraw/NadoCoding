package chap_01;

public class _05_VariableNaming {
	public static void main(String[] args) {
		// 변수 이름 짓는 법
		// 1. 저장할 값에 어울리는 이름
		// 2. 밑줄(_), 문자(abc), 숫자 사용 가능 (공백 사용 불가)
		// 3. 밑줄 또는 문자로 시작 가능 (숫자로 시작은 안됨)
		// 4. 한 단어 또는 2개 이상 단어의 연속
		// 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
		// 6. 예약어 사용 불가 (public, static, void, int , double, float, ...)

		// 다른 나라 입국 신고서 (여행)
		String nationality = "대한민국"; // 국적
		String firstName = "현성"; // 이름
		String lastName = "김"; // 성
		String dateOfBirth = "2001-12-31"; // 생년월일
		String residentialAddress = "무슨 호텔"; // 체류지
		String purposeOfVisit = "관광"; // 입국목적
		String flightNo = "KE657"; // 항공 편명
		String _flightNo = "KE657"; // 밑줄 시작
		String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
//        String -flightNo = "KE657"; 그냥 하이픈이라 안됨

		int accompany = 2; // 동반 가족 수
		int lengthOfStay = 5; // 체류 기간

		String item1 = "시계";
		String item2 = "가방";
//        String 3item = "전자제품";

		// 프로그램의 흐름을 위해 사용되는경우 등 (크게 이름이 중요하지 않을 때)
		int i = 0;
		String s = "";
		String str = "";

		// 절대 변하지 않는 상수는 대문자로
		final String CODE = "KR"; // 코드만 보고 상수임을 알수있도록 CODE라고 이름 짓는다
		// final 붙이면 KR이 상수가 된다(뭔말이야 이건) - 바꿀수 없는 수. 변수랑 다른말
//        CODE = "US"; // 상수는 US로 다시 바꿀수 없다.

		System.out.println(CODE); // 실행해봐라 오류난다

	}
}
