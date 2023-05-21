package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
    	//int[] iArray = {1, 2, 3, 4, 5}; 이렇게는 사용이 안된다. double도.
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};//int, double, float, long, boolean 이런건 기본자료형. 제네릭 타입으로 바로 못써
		//wrapper class를 써줘야 한다. Integer.parseInt(); 같은거.
        //Double.toString();이런거.        
//        int-> Integer.parseInt();
//        double -> Double.toString();
//        float -> Float 이런식으로 대문자로 써서
        //이런 클래스들 쓰면 제네릭스 무난하게 쓸수있다.
        //불필요한 코드 중복을 없앤다.
        //아래에 Any 말고 타입별로 다 만든걸 이걸로 한방에 해버렸네? <이게 핵심.
        
        
        String[] sArray = {"A", "B", "C", "D", "E"}; //제네릭스가 지원하는건 객체. 참조형 자료.
        //메소드 만들어보자~
        printIntArray(iArray); //바로 밑으로 가서 보자.
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type, K : Key, V : Value, E : Element <> 뭐 아무거나 와도 된다. 타입 암꺼나.
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

  
}
