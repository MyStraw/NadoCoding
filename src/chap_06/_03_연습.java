package chap_06;

public class _03_연습 {

	public static String getPhoneNumber() {
		String phoneNumber = "010";
	
		return phoneNumber;
	}
	
	public static String getAddress() {
		return "서울시 어딘가" ; //위에서는 문자열 변수 정의를 하고 변수를 반환했는데
		// 여기선 값 자체를 바로 반환.
		
	}
	
	public static String getActivities() {
		return "볼링장, 탁구장, 노래방";
	}
	

	
	public static void main(String[] args) { //호출해서 반환받아보자
		getPhoneNumber(); //이게 호출. 근데 반환값을 받아야 하잖아?
		//그러면 반환값을 입력해줘야지. 값!을 받아오면 타입을 넣어줘 항상.
		
		String contactNumber = getPhoneNumber(); 
		//호출한 메소드에서 일 처리하고 phoneNumber 값을 반환한걸 여기에 대입
		//일 처리 끝난 phoneNumber안에 들어있는걸 String contactNumber로 전해준다
		System.out.println("호텔 전화번호 : "+ contactNumber);
		
		String address = getAddress();
		System.out.println("호텔 주소 : "+ address);
		
		
		System.out.println(("호텔 액티비티 : " + getActivities()));
		//그냥 바로 호출한거 적어도 돼. 그냥 이게 더 편하잖아?
		//일일이 또 대입하는것보다.
		
		
		
		
		
		
	}

	
	
	
}
