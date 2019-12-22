package isAhasA;

public interface GiftCardStoreActions {
	
	GiftCards createAndGetGiftCard(); // Only for ADMIN
	GiftCards purchaseGiftCard(); // Only for User
	public EGiftCard GetEGiftCard(GiftCards giftCard, String email); // Only for User
}
