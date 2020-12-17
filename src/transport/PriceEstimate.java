package transport;

public class PriceEstimate extends ChargesMade {
	

	public PriceEstimate(double price, double length, double width, double height, double charges) {
		super(price, length, width, height, charges);
		// TODO Auto-generated constructor stub
		
		
	}
	private double estimate;
	

	

	public double getEstimate() {
		return estimate;
	}

	public void setEstimate(double estimate) {
		this.estimate = estimate;
	}
	
	
	
}
