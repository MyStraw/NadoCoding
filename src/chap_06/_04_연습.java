package chap_06;

public class _04_연습 {
	// int number에 전달값이 들어가고 메소드명 옆에 (void에) 반환형태가 들어간다.
	// 여기 void 대신 int 나 String, 괄호안에 전달값을 넣으면 둘다 가진다.
	// 메소드 내에서는 거듭제곱 연습까지만 하고, 메인에서 출력.
//	public static void power(int number) { 
//		System.out.println(number + " 의 2승은 " + result);
//	}

	public static int getPower(int number) { //number는 파라미터, 매개변수. 지역변수.//필드와는 다르다.
		int result = number * number;
		return result;
		// return number * number ; //이렇게 한줄로 해도 된다.
	}

	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {

			result *= number;
		}
		System.out.println(number + " 의 " + exponent + " 승은 " + result);

	}
	
	public static void main(String[] args) {
		getPower(2); //2는 Arg.인수.
	
		
	}
}

