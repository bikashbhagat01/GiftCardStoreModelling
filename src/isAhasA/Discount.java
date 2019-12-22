package isAhasA;

public class Discount implements DiscountInterface{
	
	
	private double percentageDiscount;
	private double cashAmountDiscount;
	private String typeOfDiscount;
	
	public Discount() {
		// TODO Auto-generated constructor stub
		
		this.setPercentageDiscount(0.0);
		this.setCashAmountDiscount(0.0);
		this.setTypeOfDiscount("Percentage");
		
	}
	
	public Discount(String type, double value){
		
		this.setTypeOfDiscount(type);
		if (this.typeOfDiscount.equalsIgnoreCase("percentage")){
			this.setPercentageDiscount(value);
			this.setCashAmountDiscount(0);
		} 
		else {
			this.setTypeOfDiscount("Cash");
			this.setCashAmountDiscount(value);	
			this.setPercentageDiscount(0);
		}
	}
	
	// Default Behavior Set as percentage, Optional
	public Discount(double value){
		this.setTypeOfDiscount("Percentage");
		this.setCashAmountDiscount(value);
	}
	
	public String toString(){
		
		if(this.getTypeOfDiscount().equalsIgnoreCase("Percentage"))
		return this.getTypeOfDiscount() + " " + this.getPercentageDiscount();
		else 
			return this.getTypeOfDiscount() + " " + this.getCashAmountDiscount();
	}
		
	
	//Getters and Setters
	public double getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	public double getCashAmountDiscount() {
		return cashAmountDiscount;
	}

	public void setCashAmountDiscount(double cashAmountDiscount) {
		this.cashAmountDiscount = cashAmountDiscount;
	}
	
	public String getTypeOfDiscount() {
		return typeOfDiscount;
	}

	public void setTypeOfDiscount(String typeOfDiscount) {
		this.typeOfDiscount = typeOfDiscount;
	}

	

	
}
