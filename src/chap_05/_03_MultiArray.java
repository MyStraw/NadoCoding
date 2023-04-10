package chap_05;

import java.sql.SQLOutput;

public class _03_MultiArray {
	public static void main(String[] args) {
		// 다차원 배열 (2차원 배열) {행렬이네 보니까}
		// 앞의 String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		// 이건 가로로 1차원, 세로까지 하면 직사각형의 2차원이 되겠지? - 면

		// 소규모 영화관 좌석
		// A1 - A5
		// B1 - B5
		// C1 - C5

		String[] seatA = { "A1", "A2", "A3", "A4", "A5" };
		String[] seatB = { "B1", "B2", "B3", "B4", "B5" };
		String[] seatC = { "C1", "C2", "C3", "C4", "C5" };

		// 3 X 5 크기의 2차원 배열
		String[][] seats = new String[][] { { "A1", "A2", "A3", "A4", "A5" }, // 위에 일자로 콤마 한것처럼 중괄호끼리 콤마로 구분
				{ "B1", "B2", "B3", "B4", "B5" }, { "C1", "C2", "C3", "C4", "C5" }, };

		// B2 에 접근하려면? 항상 순서는 0부터!
		System.out.println(seats[1][1]);// 행렬 생각. (1,1)에 B2 가 있지

		// C5 에 접근하려면?
		System.out.println(seats[2][4]);

		// 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸 (꼭 행렬처럼 행이 다 같은갯수 아니어도 돼)
		String[][] seats2 = { { "A1", "A2", "A3" }, { "B1", "B2", "B3", "B4" }, { "C1", "C2", "C3", "C4", "C5" } };

		// A3 에 접근하려면?
		System.out.println(seats2[0][2]); // C5가 있으니 A5도 있지 않을까? 하고 접근하면?

		// A5 에 접근하려면?
		System.out.println(seats2[0][4]); // ArrayIndexOutOfBoundsException - 배열 인덱스 넘어갔다

		// 3차원, 4차원, 5차원도 가능. 업무에선 1,2차원 쓰고 아주아주 드물게 3차원도 쓴다
		// 3차원 배열 만들기
		String[][][] marray = new String[][][] { { {}, {}, {} }, { {}, {}, {} }, { {}, {}, {} }, };
		/*
		 * marray[0][1][2];
		 * 
		 * // 그냥 선언만 하고싶다면 (세로 X 가로 X 높이) String[][][] marray = new String[3][3][3];//
		 * 3X3X3 만드는겨
		 * 
		 */

	}
}
