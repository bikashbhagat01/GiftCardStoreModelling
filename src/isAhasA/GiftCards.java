package isAhasA;

public class GiftCards {
	
	private PromoCode promocode;
	private Discount discount;
	private String giftCardNumber;
	
	
	
	public GiftCards() {
		// TODO Auto-generated constructor stub
		
		this.setDiscount(new Discount());
		this.setPromocode(new PromoCode());
		this.setGiftCardNumber("NoValue");
	}

	public GiftCards(PromoCode promoCode, Discount discount, String giftCardNumber){
		
		this.setDiscount(discount);
		this.setGiftCardNumber(giftCardNumber);
		this.setPromocode(promoCode);
	}

	public String toString(){
		
		return this.getGiftCardNumber() + "  " + getDiscount() + " - " + getPromocode();
	}
	public PromoCode getPromocode() {
		return promocode;
	}



	public void setPromocode(PromoCode promocode) {
		this.promocode = promocode;
	}



	public Discount getDiscount() {
		return discount;
	}



	public void setDiscount(Discount discount) {
		this.discount = discount;
	}



	public String getGiftCardNumber() {
		return giftCardNumber;
	}



	public void setGiftCardNumber(String giftCardNumber) {
		this.giftCardNumber = giftCardNumber;
	}
	
	

}
