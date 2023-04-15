package chap_07;

public class _04_Method {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		//자동신고 여부가 블랙박스.java 클래스에 있었다. 가봐
		
		b1.autoReport();// 지원 안됨
		BlackBox.canAutoReport = true;
		b1.autoReport();// 지원 됨
		
		//이번엔 메모리 카드 삽입
		
		b1.insertMemoryCard(256); //256이라는 인수를 넣고 매개변수(capacity)에 전달
		
		// 일반 영상 : type 1
		// 이벤트 영상 (충돌 감지) :  type 2 
		// 영상을 두개로 분리.
		
		int fileCount = b1.getVideoFileCount(1); //일반영상
		System.out.println("일반 영상 파일 수 : " + fileCount + "개");
		
		fileCount = b1.getVideoFileCount(2); // 이벤트 영상
		System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
	}
	

}
