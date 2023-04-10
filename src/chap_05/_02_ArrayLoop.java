package chap_05;

public class _02_ArrayLoop {
	public static void main(String[] args) {
		// 배열의 순회
		String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };
		// System.out.println(coffees[0] + " 하나");
		// System.out.println(coffees[1] + " 하나");
		// ...// 언제 이렇게 다해? 근데 0,1,2~~ 오~? for 반복문 쓰면 되겠네

		// for 반복문 순회
		for (int i = 0; i < 4; i++) { // 지금은 커피4개 (배열크기)를 알아서 쉽지만, 몇갠지 모른다면?
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("주세요");
		System.out.println("-----------------------");

		// 배열의 길이를 이용한 순회(4인거 모를때)
		for (int i = 0; i < coffees.length; i++) { // length 쓰면 바로 알수있다.
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("주세요");

		System.out.println("-----------------------");

		// enhanced for (for-each) 반복문 //이걸 써서도 위랑 똑같이 할수있다.
		for (String coffee : coffees) {// coffes 배열 값을 순회하는데 coffee라는 이름으로 받아서 쓰겠다
			System.out.println(coffee + "하나");
		}
		System.out.println("주세요");

		System.out.println("-----------------------");

		// fori 처럼 foreach 를 적으면 자동 위의 폼을 완성시켜준다.

		for (String coffee : coffees) {
			System.out.println(coffee + " 하나");
		}
		System.out.println("주세요");
		// fori 와 foreach 차이점?
		// fori는 index 값을 알수있다. 이걸 이용할때. 10개 주문중 선착순 3명~
		// 배열의 모든 요소 순회하며 작업 - foreach

	} // 엔터 말고 Tab 치는게 더 효율적인듯

}
