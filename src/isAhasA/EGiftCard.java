package isAhasA;

public class EGiftCard extends GiftCards {

	private String receipientEmailAddress;
	
	
	public EGiftCard() {
		// TODO Auto-generated constructor stub
	}

	public EGiftCard(GiftCards giftCard, String emailAddress) {
		super(giftCard.getPromocode(), giftCard.getDiscount(), giftCard.getGiftCardNumber());
		// TODO Auto-generated constructor stub
		this.setReceipientEmailAddress(emailAddress);
		
	}
	
	public String toString(){
		return this.getPromocode() + " with " + this.getDiscount() + " | ID: " + this.getGiftCardNumber()
				+ " Received by " + this.receipientEmailAddress;
	}
	
	public String getReceipientEmailAddress() {
		return receipientEmailAddress;
	}

	public void setReceipientEmailAddress(String receipientEmailAddress) {
		this.receipientEmailAddress = receipientEmailAddress;
	}

}
