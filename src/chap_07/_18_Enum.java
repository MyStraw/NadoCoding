package chap_07;

public class _18_Enum {
	public static void main(String[] args) {
		// 열거형 (Enum) 상수들의 묶음.
		// 달력 : JAN, FEB, MAR, ...
		// 옷 사이즈 : S, M, L, XL
		// OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
		// 해상도 : HD, FHD, QHD, UHD, ...

		Resolution resolution = Resolution.HD; //인스턴스 만드는거랑 비슷하다. new 대신. resolution은 HD값을 가짐
		System.out.println(resolution);

		resolution = Resolution.FHD; //스위치 케이스문 잘 사용한다.
		System.out.println(resolution);

		System.out.print("동영상 녹화 품질 : ");
		switch (resolution) {
		case HD:
			System.out.println("일반화질");
			break;
		case FHD:
			System.out.println("고화질");
			break;
		case UHD:
			System.out.println("초고화질");
			break;
		}

		resolution = Resolution.valueOf("UHD"); // 문자열로부터 가져와서 열거형으로
		System.out.println(resolution);

		System.out.println("-------------------");

		for (Resolution myRes : Resolution.values()) { //values 하면 밑에 이넘에서 값 하나씩 꺼내주는거
			System.out.println(myRes.name() + " : " + myRes.ordinal()); //name은 안써도 뭐 똑같다. ordinal 열거형 상수 순서.
		}
//상수가 가지는 진짜값을 필요로 할수도.
		System.out.println("-------------------");
		for (Resolution myRes : Resolution.values()) {
			System.out.println(myRes.name() + " : " + myRes.getWidth()); //이번엔 값을 가져옴. 게터에서.
		}
	}
}
//1. 괄호 밖에서. 이런 상수들을 열거. 보통 대문자로 구분.
enum Resolution { //열거형. 3개의 상수. 위에 다시 가봐. 
	HD(1280), FHD(1920), UHD(3840); //int width에 해당하는 값 1280.

	private final int width; //값 저장. 가로크기. 값 정의 생성자 형태로.

	Resolution(int width) {
		this.width = width;
	}

	public int getWidth() { //어딘가에서 상요할수 있도록 리턴
		return width;
	}
}
