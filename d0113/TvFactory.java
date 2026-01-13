package d0113;

public class TvFactory {
	String brandName;
	
	public TvFactory(String brandName) {
		this.brandName = brandName;
	}
	
	public TV getBrand() { // 브랜드가 삼성이면 stv를 반환 LG면 ltv를 반환 삼성도 LG도 아니면 null 반환
		if(brandName.equals("LG")) {
			TV tv = new LTv();
			return tv; 
		} else if (brandName.equals("삼성")) {
			TV tv = new STv();
			return tv;
		} else {
			return null;
		}
	}
}
