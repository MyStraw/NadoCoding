package chap_02;
// 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램 작성
/*
조건
키가 120cm 이상인 경우에만 탑승 가능
삼항 연산자 이용

결과
키가 115cm 이므로 탑승 불가능합니다
키가 121cm 이므로 탑승 가능합니다
*/
public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 115;
        int y = 121;
        String tall_x = (x >= 120) ? "가능" : "불가능";
        String tall_y = (y >= 120) ? "가능" : "불가능";

        System.out.println("키가 " + x + "cm 이므로 탑승 " + tall_x + "합니다");
        System.out.println("키가 " + y + "cm 이므로 탑승 " + tall_y + "합니다");

        // 위에껀 내 코드

        // 아래 강의코드

        int height = 115;
        String result = (height >=120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
        // 위에 115를 121로 바꾸면 됨.






    }
}
