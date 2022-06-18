
public  abstract class Mammal extends Animal {
	
	private String furColor;
	
	public abstract void controlTemperature();
	
	public Mammal(String name,String furColor) {
		super(name);
		this.furColor =furColor;
	}
	
	public void getInfo() {
		System.out.println("name :"+this.getName());
		System.out.println("fur clolor : "+this.getFurColor());
	}
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	

}
