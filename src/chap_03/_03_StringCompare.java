package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같은면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자를 구분한다
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 식당. 화장실 비번. 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용) 비밀번호 입력 잘 하면 true 나오겠지//5 == 5 처럼도 가능하지 않을까?
        System.out.println(s1 == s2); // true (참조) ㅇㅇ 이렇게 해도 똑같다

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // false (참조한곳은 다르다)

        // 왜 달라질까. 식당에서 화장실 비밀번호를 벽에 붙여놨다. 메모지 1장에 붙여놨으니 모든 사람들이 이걸 참조한다.
        // new Stringㄴ 통하는건 서로 다른 메모지에 일일이 1234를 적어서 손님들에게 나눠준것과 같다. 내용은 같아도
        // 각각의 메모지가 존재하게 되는것.
        // equals는 내용을 비교하는 거지만 ==은 참조해온 원본의것(메모리)을 비교한다.
        // 즉 문자열의 내용을 비교할때 equals를 써야한다.

        //s1, s2를 똑같이 "1234"라고 입력했지만, s2 = "1234"라고 했음에도 자바에서는 이거랑 똑같은 위에줄 원본을 참조해서 기억을 하는 방식을 택한다
        //그래서 s2는 s1의 내용을 참조한것이라 생각한다.
        //new string은 따로따로 메모리를 기억해두게 만드는 것.

    }
}
