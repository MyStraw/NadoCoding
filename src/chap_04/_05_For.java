package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다."); // 알트 눌리고 마우스로 드래그 하면 같은줄 범위 수정가능
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장의 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("---- 반복문 사용 ----");

        // 반복문 사용 For (선언 ; 조건 ; 증감)
        for (int i = 0; i < 10; i++) { // i += 1 해도 되겠지?
            // System.out.println("어서오세요. 나코입니다." + i);
            // System.out.println("환영합니다. 나코입니다." + i);
            System.out.println("환영합니다. 코나입니다." + i); // 이 안 문장만 바꾸면 일일이 수정할 필요 없겠지?
        }

        // 짝수만 출력 (fori 만 적고 엔터 하면 알아서 선언 조건 증감 완성해줌
        // 0, 2, 4, 6, 8 짝수일때만 출력해보자
        for (int i = 0; i < 10 ; i += 2 ) {
            System.out.print(i); // print에 ln 없이 하면 줄바꿈 없이 가로로 나열한다
        }

        System.out.println(); //아무것도 안해주면 줄바꿈

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0 ; i--) { //i-= 1 해도 되겠지
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지의 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");


        System.out.println("그냥 장난. 1부터 n까지 더하면 얼마?");
        int n = 10;
        int summ = (n * (n + 1)) / 2;
        System.out.println("1부터 " + n + "까지 더했을때 합은 " + summ);
        }
    }
