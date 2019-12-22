package isAhasA;

public class PhysicalGiftCard extends GiftCards {

		private String receipientHomeAddress;
		
	public PhysicalGiftCard() {
		// TODO Auto-generated constructor stub
	}

	public PhysicalGiftCard(PromoCode promoCode, Discount discount,
			String giftCardNumber, String receipientAddress) {
		super(promoCode, discount, giftCardNumber);
		// TODO Auto-generated constructor stub
		this.setReceipientHomeAddress(receipientAddress);
	}

	public String getReceipientHomeAddress() {
		return receipientHomeAddress;
	}

	public void setReceipientHomeAddress(String receipientHomeAddress) {
		this.receipientHomeAddress = receipientHomeAddress;
	}

}
