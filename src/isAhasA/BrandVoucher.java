package isAhasA;
import java.util.*;

public class BrandVoucher extends GiftCards {
	private List<String> applicableBrands;
	public BrandVoucher() {
		// TODO Auto-generated constructor stub
	}

	public BrandVoucher(PromoCode promoCode, Discount discount,
			String giftCardNumber, List<String> applicableBrands) {
		super(promoCode, discount, giftCardNumber);
		// TODO Auto-generated constructor stub
		this.setApplicableBrands(applicableBrands);
	}

	public List<String> getApplicableBrands() {
		return applicableBrands;
	}

	public void setApplicableBrands(List<String> applicableBrands) {
		this.applicableBrands = applicableBrands;
	}

}
