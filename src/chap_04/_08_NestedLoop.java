package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문
        
        // 별 (*) 사각형 만들기
        /*

        *****
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5; i++) { // ln이 있다. 위에 가로로 다섯개 만든걸 세로로 x5. 중괄호 잘봐
           /* System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");*/
            for (int j = 0; j < 5; j++) { // 가로로 다섯개 만들기 ln 없음 주의
                System.out.print("*");
            }
            System.out.println(); //ln이 있다. 위에 가로로 다섯개 만든걸 세로로 x5. 중괄호가 젤 처음꺼랑 연관
        }

        // 별 (*) 왼쪽 삼각형 만들기
        /*

        *
        **
        ***
        ****
        *****

         */
        for (int i = 0; i < 5; i++) {
            // for (int j = 0; j < i + 1; j++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 별 (*) 오른쪽 삼각형 만들기
        /*

                 *
                **
               ***
              ****
             *****

             SSSS*
             SSS**
             SS***
             S****
             *****
         */
        for (int i = 0; i < 5; i++) { // 이중반복문
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k <= i ; k++) {
                System.out.print("*");

            }
            System.out.println();
            // 반복문 안에 반복문. i=0인 상태에서 j가 0일때 조건만족, 공백 하나 찍고
            // 또 j가 1일때 조건만족 또 공백 하나 찍히고
            // ...j가 4이면 조건 만족 안하니 이걸로 공공공공가 찍히고 그다음 걸로 넘어가면
            // k=i 이기 때문에 여기서 * 하나 찍힘
            // i=0 에서 SSSS*이 찍힌다. 이게 한 싸이클
        }
    }
}
