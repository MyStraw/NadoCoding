package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For

        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 그 즉시 동작 멈추고 바로 다음회차로 넘어간다. 밑에 break 있는 항목을 안함
            }
            sold++; // 판매 처리  -- 이건 위에 빈칸에 들어가면 20번에서 끝나버린다. 순서 생각!
            // 컨티뉴 후에 이걸 써야 컨티뉴 건이 다음으로 넘어간다.
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
            System.out.println("영업을 종료합니다.");

            System.out.println("------------------");

            // While 문
            sold = 0;
            /*int index = 1; // 손님 번호
            while (index <= 50) {
                System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

                // 손님이 없다면 (noShow)
                if (index == noShow) {
                    System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                    index++; // 이거 넣는거 주의! 컨티뉴 걸리면 브레이크 다음번의 index++을 못하니까.
                    continue;
                }
                sold++; // 판매 처리
                if (sold == max) {
                    System.out.println("금일 재료가 모두 소진되었습니다.");
                    break;
                }
                index++;
            }
            System.out.println("영업을 종료합니다.");*/

            int index = 0; // 손님 번호를 0으로 해.
            while (index < 50) { //이거도 <=를 <로 해줘야 50명이지. <=이면 51명인 상황
                index++; // 여기서 바로 플플 해버려
                System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

                // 손님이 없다면 (noShow)
                if (index == noShow) {
                    System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                    //index++; 위에 했으니 안해도 됨
                    continue;
                }
                sold++; // 판매 처리
                if (sold == max) {
                    System.out.println("금일 재료가 모두 소진되었습니다.");
                    break;
                }
                // index++; 이것도 안해도 됨
            }
            System.out.println("영업을 종료합니다.");

            //_10_에서도 그렇고 index++ 의 위치잡는게 참 어려웠는데 이걸 간단하게 하려면

            // int index = 0; //1이아닌 0으로 하고
            // while (index <50) {
            // index++; 여기에 바로 박아버려 => 이러면 index++을 한번만 해도 되겠지

            // break; 조건이 있기때문에 while(true)로 무한반복으로 해놔도 똑같다.(50명인 상황은 아니겄징)
            // 똑같은걸 계속해서 더 똑똑하게 만들어봐
        }

    }
}
