package chap_07;

import java.util.Random;

public class _11_Package {
	public static void main(String[] args) {
		// 패키지
		// 랜덤 클래스
		
		Random random = new Random();
		System.out.println("랜덤 정수 : " + random.nextInt());//int 의 범위 내에서 정수형 값 반환
		//랜덤으로 정수 뽑아줭~
		//근데 너무 크게 나온다. 원하는 범위 내로만 해줭
		
		System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));//0이상 10 미만의 정수형 값
		System.out.println("랜덤 실수 : " + random.nextDouble());//0.0 이상 1.0 미만의 실수값
//		System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0));//더블은 범위 안된다
		
		//만약 5.0 이상 10.0 미만의 실수를 뽑으려면? 깨알팁
		double min = 5.0;
		double max = 10.0;
		System.out.println("랜덤 실수 (범위) : " + (min + (max - min)*random.nextDouble())); // 랜덤하면 0.0이상 1.0미만인데 여기에 5 곱하니 5.0 미만이 됨 
		System.out.println("랜덤 boolean : " + random.nextBoolean());
		
		// 로또 번호를 랜덤으로 보으려면?
		
		System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
		// nextInt(45) : 0 이상 45 미만의 수
		// nextInt(45) + 1 : 1 이상 46 미만의 수 = 1 이상 45 이하의 수
		
		//Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
		//BigInteger, BigDecimal
		//LocalDate, LocalTime, LocalDateTime, DateTimeFormatter,....
	}
	

}
