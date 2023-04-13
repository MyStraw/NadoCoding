package chap_06;

public class _03_Return { //반환값 return
	// 호출하면 반환된 값을 받아와서~ 해보겠다
	// 호텔 정보 제공하는 프로그램
	
	// 호텔 전화번호
	public static String getPhoneNumber() { // void는 반환값이 없는것. void가 아닌 반환값 필요하면 반환값에
		//해당하는 타입을 입력해. 여긴 String.
		String phoneNumber = "02-1234-5678";
		return phoneNumber; //폰넘버 정보. 겟넘버는 똑같은 자료형이어야한다.
	}

	// 호텔 주소
	public static String getAddress() {
		return "서울시 어딘가"; // 값 자체를 바로 반환

	}

	// 호텔 액티비티
	public static String getActivities() {
		return "볼링장, 탁구장, 노래방";
	}

	public static void main(String[] args) {
		// 반환값 , return
		String contactNumber = getPhoneNumber();
		System.out.println("호텔 전화번호 : " + contactNumber);

		String address = getAddress();
		System.out.println("호텔 주소 : " + address);

		System.out.println("호텔 액티비티 : " + getActivities()); // 그래 바로 써도 되잖아

	}
}
