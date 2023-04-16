package chap_07;

//리퍼제품에 대해서만 할인적용
public class BlackBoxRefurbish {

	public String modelName;
	String resolution; //디폴트 접근제어자는 안적어도 돼.
	private int price; //블랙막스리퍼비시 클래스에서만 접근 가능하게 바꿔
	protected String color;

	// 우클릭 -> 리소스 -> 제너레이트 게터세터
	public String getModelName() { 
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getResolution() {
		if (resolution == null || resolution.isEmpty()) {
			return "판매자에게 문의하세요.";
		}
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	private int getPrice() { //프라이빗으로 바꾸면? _10에서 접근이 안된다.
		return price;
	}

	public void setPrice(int price) {
		if (price < 100000) {
			this.price = 100000;
		} else {
			this.price = price;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

} class A{
	
}





