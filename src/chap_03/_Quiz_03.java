package chap_03;
// "901231-1234567" 인 경우 901231-1 까지 출력
// "030708-4567890" 인 경우 030708-4 까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String ju = "901231-1234567";
        System.out.println(ju.substring(0, 8));

        //내가 한 코드

        String id = "901231-1234567";
        System.out.println(id.substring(0, 8)); // 0 위치부터 8 위치 직전까지

        //강의 코드
        //맞았네

        //응용
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2)); //"-"의 위치가 6번째니까 2 더해서 8로 만듦




    }
}
