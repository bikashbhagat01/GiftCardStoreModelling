package isAhasA;
import java.util.*;
public class CorporateVoucher extends GiftCards {
	private TreeMap<Integer, String> voucherReceipients;
	
	public CorporateVoucher() {
		// TODO Auto-generated constructor stub
	}

	public CorporateVoucher(PromoCode promoCode, Discount discount,
			String giftCardNumber,TreeMap<Integer, String> voucherReceipients) {
		super(promoCode, discount, giftCardNumber);
		// TODO Auto-generated constructor stub
		this.setVoucherReceipients(voucherReceipients);
	}

	public TreeMap<Integer, String> getVoucherReceipients() {
		return voucherReceipients;
	}

	public void setVoucherReceipients(TreeMap<Integer, String> voucherReceipients) {
		this.voucherReceipients = voucherReceipients;
	}

}
