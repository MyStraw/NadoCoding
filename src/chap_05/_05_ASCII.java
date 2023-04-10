package chap_05;

public class _05_ASCII {
	public static void main(String[] args) {
		// 아스키 코드 (ANS) : 미국 표준 코드. 위키에서 찾아봥
		char c = 'A'; // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작.
		System.out.println(c); // A
		System.out.println((int) c); // 65 (영문자 A는 아스키 코드로 65다)

		c = 'B';
		System.out.println(c);
		System.out.println((int) c); // (int)c는 char 타입인 c를 int 타입으로 변환하는 것을 의미합니다.

		c++;
		System.out.println(c);
		System.out.println((int) c);

		// 이거 왜 이용하냐. 앞에서 String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		// 이거 일일이 입력 힘들었다. 다시 앞에꺼 가져와서 그부분을
		// char ch = 'A'로 바꾼다

		// 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
		String[][] seats3 = new String[10][15];
		char ch = 'A';
		// ch++; // B
		// ch++; // C
		for (int i = 0; i < seats3.length; i++) { // 세로
			for (int j = 0; j < seats3[i].length; j++) {
				seats3[i][j] = String.valueOf(ch) + (j + 1); // ch를 문자열로 인식시키기 위해. char은 문자 1개만 인식.
				// seats3 즉 A1, B2 이런식으로 문자열로 인식시켜야 하기 때문에 문자+문자열이 아닌 문자열+문자열로 바꿀 필요가 있다
				// 그래서 그냥 char로 정해진 ch를 String의 값으로 바꿀 필요성이 있다.
			}
			ch++; // B로 바꿔줌.
		}

		// 영화관 좌석 번호 확인
		for (int i = 0; i < seats3.length; i++) {
			for (int j = 0; j < seats3[i].length; j++) {
				System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
