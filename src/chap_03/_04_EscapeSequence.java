package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character). 약속이 된 특별한 기능이 있는 문자
        // \n \t \\ \" \' 등이 있다
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
                // 몇글자 안되는데 3줄이나 차지하니까 아깝다

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭

        // 해물파전     9000원 -> 탭 두번 눌린 띄움
        // 김치전      8000원
        // 부추전      8000원
        // 이렇게 하면 9000원이랑 8000원이랑 띄움 표시가 어긋나서 보기 안좋다

        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\ : 역슬래시 (1개만 해서 하는건데 \P 라는걸 혹시라도 인식할수 있다.
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); // 문자열 사이에 큰 따옴표를 쓰려면 역슬래시.

        // \' : 작은따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // 이건 딱히 역슬래시 안해도 상관없지
        // 그럼 어디에 써?

        char c = 'A';
        c = '\''; // A를 ' 로 바꾸고 싶을때 쓸수있겠지?
        System.out.println(c);


    }
}
