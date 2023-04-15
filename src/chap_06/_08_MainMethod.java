package chap_06;
//메인메소드
public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요.");
        }
    }
}
//
//지금까지 계속 메인영역 만든건 메인 메소드이다.
//앞에서 만든 겟파워 같은 메소드인데, 자바 프로그램이 실행될때
//가장 먼저 진입하는 곳이다. void라서 반환값은 없고
//String 배열을 전달값(파라미터)로 받는 메소드이다. args 변수.
//스트링값을 어떻게 전달받을수 있을까?
//런 애즈 컨피겨에서 arg값 넣어줘
		
		
		