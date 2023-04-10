package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While // for는 정확한 반복 횟수가 있는데, 정확한 반복횟수가 없다면? 수영장 발차기 몇번으로 25m 수영장 끝까지 갈수있나
        // 수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
        move = 0;
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착하였습니다.");



    }
}
