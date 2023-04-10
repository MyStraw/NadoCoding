package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) { // 밑에꺼랑 합쳐서 else if (ranking == 2 || ranking == 3) 해도 된다
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // case 1일 경우 그 아래 문장 수행하고, break를 만날때까지 실행하다가 만나면 중괄호를 빠져나간다
        // (중괄호 안써도 되지만 쓰는걸 습관화 하고 즉 case 2,3 default를 빠져나간단 얘기)
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // 위 케이스에 해당 안할시 디폴트값
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#2");

        // case 2 와 3을 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // 위 케이스에 해당 안할시 디폴트값
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#3");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price += price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원
        // case 1: 아래에 break가 없으니까 break 만날때까지 아래로 내려오면 case 2에서 1000원 더해지고 3에서 또 1000원
        // 그럼 case 1은 10000원이 된다

        // if는 이런식으로 범위가 있는값을 할때 좋고, 딱딱 정해진 케이스가 있을땐 case가 좋다
        int score = 95;
        if (score >=90)
            System.out.println("A");
        else if (score >=80)
            System.out.println("B");


    }
}
