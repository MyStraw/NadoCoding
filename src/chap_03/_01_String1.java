package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        
        // 문자열의 길이
        
        System.out.println(s.length()); // 29
        //배송 리뷰 글자수 몇개 이상 해줘~ 할때 사용가능//
        
        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true 
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 (첫번째 I 는 0번째로 친다). J는 7번째에 나옴.
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1로 표시
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치정보. and의 위치가 12. 뒤에 나오는 and는 표시 안됨
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 and의 위치정보.
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false)


    }
}
