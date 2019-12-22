package isAhasA;

public class PromoCode implements PromoCodeInterface {
	private String promoCodeText;
	private String promoCodeValidity;
	private String promoCodeCreationDate;
	
	
	public PromoCode() {
		// TODO Auto-generated constructor stub 
		this.setPromoCodeCreationDate("Today's Date");
		this.setPromoCodeValidity("0 days");
		this.setPromoCodeText("XXXX-XXXX-XXXX");
		
	}
	
	public PromoCode(String date, String validity, String text){
		
		this.setPromoCodeCreationDate(date);
		this.setPromoCodeValidity(validity);
		this.setPromoCodeText(text);
		
	}
	
	public String toString(){
		return this.getPromoCodeText() + " " + this.getPromoCodeCreationDate() + "<till>" + this.getPromoCodeValidity();
	}
	
	
	public String getPromoCodeText() {
		return promoCodeText;
	}

	public void setPromoCodeText(String promoCodeText) {
		this.promoCodeText = promoCodeText;
	}

	public String getPromoCodeValidity() {
		return promoCodeValidity;
	}

	public void setPromoCodeValidity(String promoCodeValidity) {
		this.promoCodeValidity = promoCodeValidity;
	}

	public String getPromoCodeCreationDate() {
		return promoCodeCreationDate;
	}

	public void setPromoCodeCreationDate(String promoCodeCreationDate) {
		this.promoCodeCreationDate = promoCodeCreationDate;
	}

}
