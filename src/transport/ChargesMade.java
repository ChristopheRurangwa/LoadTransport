package transport;

public class ChargesMade {

	protected double price;
	protected double length;
	protected double width;
	protected double height;
	protected double charges;
	
	
	
	
	public ChargesMade(double price, double length, double width, double height, double charges) {
		super();
		this.price = price;
		this.length = length;
		this.width = width;
		this.height = height;
		this.charges = charges;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	//PriceEstimate pri=new PriceEstimate(price, length, width, height, charges);
	
	public  void dimensions(double length, double width, double height, double weight) {
		
		
		setLength(length);
		setWidth(width);
		setHeight(height);
		setCharges(4);
		
		setPrice(getCharges());
		PriceEstimate pri=new PriceEstimate(getPrice(), getLength(), getWidth(), getHeight(), getCharges());
		pri.setEstimate(getCharges());
		
		double maxVol=216;
		double maxWgt=440;
		
		double vol=getLength()*getWidth()*getHeight();
		
		if(vol > maxVol && weight > maxWgt) {
			System.out.println("THE DIMENSIONS EXCEED LIMIT CAPACITY: \n vol: "+vol+" \n weight: "+weight);
			
		}
		
		else{
			System.out.println("VOl: "+vol+"\n Weight: "+ weight);
			}
		
		if((maxWgt<=439)||(maxWgt>=299)) {
			double chg=pri.getEstimate()*400;
			System.out.println("The factor is $"+getPrice()+" & the charge is per load: $"+chg);
			
		}
		
		
		
	}

	
}
