package chap_06;
//변수의 범위
public class _07_VariableScope {
    public static void methodA(int number) {
        //System.out.println(number);
        //System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3;

        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
}
//메인영역 내에서 number 만들고 3 넣고 이걸
//다른 메소드A를 만들어 이걸 출력하려 하면?
//4번줄로 올라가 프린트넘버를 하니 에러가 뜬다. 왜?
//메인영역에서 선언한 변수는 메인영역(괄호)내에서만 쓸수있다. 다른곳에선 쓸수없다.
//새로운 메쏘드B 변수 리절트 변수1을 선언하고, 메인에서 쓸라니까 쓸수없다.
//이것도 똑같이 메소드 B에서 만든걸 다른곳에서 사용을 할수없다. A에서도 쓸수없다.
//이런걸 지역변수라고 한다. 변수가 선언된 영역 내에서만 사용할수 있다.
//중괄호 열고 닫고 안에서만 쓸수있게된다. 벗어나면 다른곳에서 쓸수가 없어.
//18번도 마찬가지. for문 밖에서 i를 출력하려고 시도하면 빨갛게 되면서 쓸수없다고 한다.
//for문에서 선언된 i는 for의 {}안에서만 사용할수 있는것.
//int j를 선언하고 그 괄호를 벗어나서 출력하면 안된다.
//하지만 14번에서 선언된 넘버3는 중괄호가 아래까지 돼있으니 그 안이면 어디서나 쓸수있다.
//다른 메소드에서 쓰고싶다면 전달값(파라미터, 매개변수)으로 보내야한다.
