package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 "," 로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (앞 내용은 삭제) // Java and Python and C.
        //그렇다고 s에 7부터 시작하는게 반영된게 아니다. 반영을 시키고 싶다면
        //s = s.substring(7)을 하면 됨
        //7번째인지 일일이 세는게 힘들다면 앞 강의에서 배운 indexOf를 사용한다
        System.out.println(s.substring(s.indexOf("Java"))); //위랑 동일해짐
        //"Java" 가 시작하는 위치부터, "." 이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 끝 위치는 "."을 포함하지 않는다.
        //즉, 시작 위치부터 끝 위치 "직전" 까지

        // 공백 제거
        s = "           I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python - 컴마를 넣고싶어서 이렇게 하면 알아보기도 힘들고 불편하다
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
        //concatimate(사슬같이 잇다)



    }
}
