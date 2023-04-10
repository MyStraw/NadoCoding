package chap_01;

public class _07_TypeCasting {
	public static void main(String[] args) {
		// 형변환 TypeCasting
		// 정수형에서 실수형으로
		// 실수형에서 정수형으로

		// int to float, double
		int score = 93;
		System.out.println(score); // 93
		System.out.println((float) score); // 93.0
		System.out.println((double) score); // 93.0

		// float, double to int
		float score_f = 93.3f;
		double score_d = 98.8;
		System.out.println((int) score_f); // 93
		System.out.println((int) score_d); // 98

		// 정수 + 실수 연산
		score = 93 + (int) 98.8; // 93 + 98
		System.out.println(score); // 191

		score_d = (double) 93 + 98.8; // 93.0 + 98.8 근데 93은 어차피 실수에도 포함되므로 더블 안해도 되긴 됨
		System.out.println(score_d); // 191.8

		score_d = 93 + 98.8;
		System.out.println(score_d);

		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 191 -> 191.0
		// int -> long -> float -> double (자동 형변환) 작은 범위에서 큰 범위는 자동으로 된다

//        int convertedScoreInt = score_d; // 191.8 -> 191 에러뜬다. 큰 범위를 작은 범위로 넣으려니까...
		int convertedScoreInt = (int) score_d;
		// double -> float -> long -> int (수동 형변환)

		// 숫자를 문자열로 (클래스의 도움을 받아야.. 난쥬 배움)
		String s1 = String.valueOf(93);
		s1 = Integer.toString(93);
		System.out.println(s1); // 93

		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2); // 98.8

		// 문자열을 숫자로
		int i = Integer.parseInt("93");
		System.out.println(i); // 93
		double d = Double.parseDouble("98.8"); // 따옴표 안은 문자열을 의미하고 문자열 98.8을 숫자 98.8로 인식시킨다
		System.out.println(d); // 98.8

		int error = Integer.parseInt("자바"); // 자바라는 글자는 올바른 숫자형태가 아니라 에러난다
	}
}
