package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
    	//int result = 1;
    	//result result;
    	//result *= number; 어차피 이거 계산하는 똑같은 아래메소드를 호출할거니 필요없다. 지워.
    	
        return getPower(number, 2); //겟 파워에서 겟파워 파라미터 2개 오버로딩 메소드를 또 불러올수있다.
    } //아래 오버로딩 메소드의 exponent에 2를 넣어주면 여기선 2승만 계산하는 메소드가 된다.
    
    //메소드가 필요한 이유   

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}

//2의 2승을 구하기. 3의 3승을 구하기 이런거 하려면
//int result = 1;
//for(int i = 0; 1<2; 1++){
//result *=2;}
//이렇게 하고 3의 3승 구하려면 코드 또 복사해서 또 쓰고 또 쓰고 해야된다.
//이런 똑같은 연산을 계속 코드복사하며 할필요가 없잖아. 공식만 넣어놓고
//인수만 다르게 계속 넣어서 결과만 보여주면 되니까.
