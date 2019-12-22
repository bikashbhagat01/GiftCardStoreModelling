package isAhasA;

/*1. Identify	and	Implement	Objects
2. Identify	and	Implement	Relationships
a. HAS-A
i. 1	to	1
ii. 1	to	many
b. IS-A
3. Implement	Discounts	and	Promo	Codes*/

public class driver {
	public static void main(String[] args) {
		
		System.out.println("Gift Card Store Initialised");
		GiftCardStore giftCardStore = new GiftCardStore();
		System.out.println();
		System.out.println("===================");
		
		System.out.println("Store Admin Created giftCard");
		System.out.println("===================");

		GiftCards giftCard = giftCardStore.createAndGetGiftCard();
		System.out.println();

		System.out.println(giftCard + "\n");
		
		System.out.println("Store Admin Converting giftCard into e-GiftCard");
		
		EGiftCard eGC = giftCardStore.GetEGiftCard(giftCard, "demoDan@gmail.com");
		
		System.out.println("===================");

		System.out.println("Buyer Buys E-GiftCard with their e-mail address credentials ");
		System.out.println("===================");

		System.out.println(eGC);
		
		
		
		
	}
	
}

