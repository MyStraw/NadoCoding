package chap_00_prac;

public class _01_practice {
    public static double integrate(double a, double b, int n) {
        double h = (b - a) / n; // 사다리꼴의 밑변길이
        double sum = 0.5 * (f(a) + f(b)); // 첫 번째 사다리꼴 높이와 마지막 사다리꼴의 높이를 더함
        //(윗변 + 아랫변) * 높이 * 0.5 니까.

        for (int i = 1; i < n; i++) {
            double x = a + i * h; // 사다리꼴의 밑변에 해당하는 x 좌표. 1씩 올라간다.
            sum += f(x); // sum = sum + f(x)란 얘긴데
        }

        //어차피 밑변길이는 똑같으므로 앞으로 묶을수 있고, 결국 sum만 계속 합해서 나중에 한방에 밑변길이만 곱해줘
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
        System.out.println(integral); // 출력 결과: 0.5000000000000001

        //근데 이러면 굳이 사다리꼴을 쓸필요가 있나? 그냥 사각형으로 해도 되는거 아녀?



    }
}
