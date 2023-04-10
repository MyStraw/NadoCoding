package chap_00_prac;

public class _02_practice {
    public static double integrate(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(b);
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
                        sum += f(x);
        }
        return h * sum; //
    }

    public static double f(double x) {
        return x; // 적분할 함수 y = x
    }

    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        int n = 1000;

        double integral = integrate(a, b, n);
        System.out.println(integral);

        // 맞네. 그냥 사각형으로 해도 되잖아

        // 아 그러니까 메소드가 끝날때 return을 해주는거라고 보면 돼? 그러면 그 메소드에서
        //이것저것 해놓은 값이 그 메소드에 저장이 되는거고?
        //
        //그리고 다른 메소드에서 result로 그 메소드를 불러오면 아까 저장한 결과값이 나오는거야?

       /* 맞아요! return은 메소드의 실행 결과를 반환하는 역할을 하기 때문에, 메소드 내에서 계산한 값을 반환하려면 반드시 return을 사용해야 합니다.

        그리고 return으로 반환한 값을 다른 변수에 저장하거나 다른 메소드에서 사용할 수 있습니다. 예를 들어, 아래와 같이 메소드 f()를 정의하고 호출한 뒤 결과값을 변수 result에 저장할 수 있습니다.*/
    }
}
