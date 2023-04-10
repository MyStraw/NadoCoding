package chap_01;

public class _03_Variables {
	public static void main(String[] args) {
		String name = "나도코딩"; // 문자열 변수
		int hour = 15; // 정수형 변수

		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");

		double score = 90.5; // 실수형 변수
		char grade = 'A'; // 한글자
		name = "강백호";
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade + "입니다.");

		boolean pass = false; // T or F
		System.out.println("이번 시험에 합격했을까요? " + pass);

		double d = 3.14123456789; // 실수형 변수, 64비트로 더 많은 소수점 표시 가능
		float f = 3.14123456789F; // 같은 실수 변수이지만, 32비트, 메모리 사용량이 적다
		System.out.println(d);
		System.out.println(f);

		long l = 1000000000000L; // int 같은 정수 변수지만 21억을 못넘긴다. long은 가능
		l = 1_000_000_000_000L; // 아래바를 그어주면 숫자 구분 쉽게 가능. 컴마 해주는것처럼
		System.out.println(l);

		// int, long - 정수
		// float, double - 실수
		// boolean - 참, 거짓
		// char, String - 글자(1개), 여러개

	}
}
