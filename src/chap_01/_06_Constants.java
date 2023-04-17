package chap_01;

public class _06_Constants {
	public static void main(String[] args) {
		final String KR_COUNTRY_CODE = "+82"; // 국가 번호 (빨리)
//        KR_COUNTRY_CODE = "+8282";
		System.out.println(KR_COUNTRY_CODE);

		final double PI = 3.141592; // 원주율 //누가 바꿀수 있는 수가 아니기 때문에 바꾸면 안됨.
		//상수화 시킴. 그럴때 final 붙인다.
		final String DATE_OF_BIRTH = "2001-12-31"; // 생년 월일
	}
}
