package isAhasA;

public class GiftCardStore implements GiftCardStoreActions {
	
	private GiftCards giftCard;
	private EGiftCard eGiftCard;
	public GiftCardStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GiftCards createAndGetGiftCard() {
		// TODO Auto-generated method stub
		
		
		PromoCode promoCode = new PromoCode("12-12-2019","40 Days", "A54F-D553-X10O");
		System.out.println("PromoCode Created : ");
		System.out.println(promoCode);
		
		Discount discount = new Discount("Cash", 5000);
		
		System.out.println("Discount Assigned : ");
		System.out.println(discount);
		
		this.giftCard = new GiftCards(promoCode,discount,"222-111-222");
		
		return this.giftCard;
	}
	
	public EGiftCard GetEGiftCard(GiftCards giftCard, String email) {
		// TODO Auto-generated method stub
		
		//First Call create and get GiftCard before getting egiftCard
			
		System.out.println("Email for E-GiftCard Assigned : " + email);
		this.eGiftCard = new EGiftCard(giftCard,email);
		
		return this.eGiftCard;
	}
	
	

	@Override
	public GiftCards purchaseGiftCard() {
		// TODO Auto-generated method stub
		
		return getGiftCard();
		
	}
	public GiftCards createAndGetEGiftCard() {
		// TODO Auto-generated method stub
		
		
		PromoCode promoCode = new PromoCode("12-12-2019","40 Days", "A54F-D553-X10O");
		System.out.println("PromoCode Created : ");
		System.out.println(promoCode);
		
		Discount discount = new Discount("Cash", 5000);
		
		System.out.println("Discount Assigned : ");
		System.out.println(discount);
		
		this.giftCard = new GiftCards(promoCode,discount,"222-111-222");
		
		return this.giftCard;
	}
	
	public GiftCards getGiftCard() {
		return giftCard;
	}

	public void setGiftCard(GiftCards giftCard) {
		this.giftCard = giftCard;
	}

}
