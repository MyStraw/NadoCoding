package chap_06;
//메소드 오버로딩
//이름이 같은 메소드를 여러개 만드는것. 04에서 쓴거 복붙
public class _05_Overloading {
    public static int getPower(int number) {//전달받는 파라미터를 정수로 받았는데 이걸
    	//문자열로 받아올수도 있다.
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {//문자열로 받아오고 아래에서 다시 정수로 변환
        int number = Integer.parseInt(strNumber); // 받아온 문자열을 정수로 변환하는 과정.
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
