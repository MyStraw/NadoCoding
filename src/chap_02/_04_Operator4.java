package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // ||는 or 라는 뜻. 하나라도 true 이면 true (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true (최고의 식당)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3 은 1 보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나, 3 은 1 보다 작다 (false)

        //System.out.println(1 < 3< 5); // 연속 두개 비교는 안된다. 아래처럼 해라
        System.out.println(1 < 3 && 3 < 5); // 이렇게 해야 한다. 괄호 없어도 되지만 있는게 가독성이 좋다.

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false 반대로 결과 내달란겨
        System.out.println(!(5 == 3)); // true

    }
}
