package chap_06;
// 개인정보중 일부를 비공개로 전환하는 프로그램 작성
// 이름 : 나코딩
// 주민등록번호 : 990130-1234567
// 잔화번호 : 101-1234-5678

// 실행 결과
// 이름 : 나**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****

// 조건
// 개인정보를 비공개를 전환하는 메소드 작성
// 하나의 메소드에서 모든 동작 처리
// 각 정보는 아래 위치부터 비공개 적용

// 이름은 2번째 글자
// 주민등록번호 9번째 글자
// 전화번호 10번째 글자

// 메인 코드는 주어져있음. 다른 메소드만 만들면 되겠네.

// 힌트
// substring() = 문자열의 일부를 자를수 있다.
// length() = 문자열의 길이를 알수있다.

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 나코딩 -> 나
        // for (int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 나**
        }
        return hiddenData;
    }
    
    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
