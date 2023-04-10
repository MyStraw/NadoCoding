package chap_04;
/*

조건
주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
경차 또는 장애인 차량은 최종 요금에서 50% 할인

주차요금 예시
일반 차량 5시간 주차 시 20000원
경차 5시간 주차 시 10000원
장애인 차량 10시간 주차 시 15000원

실행결과
일반 차량 5시간 주차 시 20000원
주차 요금은 20000 원입니다.

경차 5시간 주차 시 10000원
주차 요금은 10000 원입니다.

장애인 차량 10시간 주차 시 15000원
주차 요금은 15000 원입니다.

*/

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 20;
        int fee = 4000 * time; //미리 계산해서 int 해라.
        int max = 30000;

        boolean dis = true;
        
        if (fee > 30000) {
            fee = 30000;
        }
        if (dis = true) {
            fee = fee/2;
            System.out.println("경차 혹은 장애인 차량에 해당합니다");
        }
        System.out.println("주차 요금은 "+ fee + "원 입니다");

        //내코드

        System.out.println("------------------------");


        int hour = 10; // 주차시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee2 = hour * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)

        // 30000원 초과 시 일일 최대 요금으로 수정
        if(fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // fee = fee/2 // 50% 할인 적용
        }
        System.out.println("주차 요금은 " + fee + " 원입니다");
    }
}
// 내 코드.
