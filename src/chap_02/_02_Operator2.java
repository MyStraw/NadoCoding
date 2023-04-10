package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); // 12

        num =  num - 2;
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2; // 나머지
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        // num = num + 2;
        num += 2; //이게 위에꺼랑 같은식이다. 자기 자신에게 무언갈 더할때 += 하면 바로 됨
        System.out.println(num); // 12

        // num = num - 2;
        num -= 2;
        System.out.println(num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20

        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10

        // num = num % 2;
        num %= 2;
        System.out.println(num); // 0

    }

}
