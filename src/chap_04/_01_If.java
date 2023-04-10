package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오후 3시

        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생락 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        } //중괄호 안해주면 if 아래에 조건2개가 되면서 if조건에 충족되지 않으면 모든문장이 표시되지 않는다
        System.out.println("커피 주문 완료 #1");
        
        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피
        // if (hour < 14 && morningCoffee == false)
        if (hour < 14 && !morningCoffee) { // == false 말고 ! 넣어도 된다)
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if (hour >= 14 || morningCoffee == true) { // == true 없어도 된다
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");

        



    }
}
