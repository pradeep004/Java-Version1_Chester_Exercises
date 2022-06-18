
public class Cat extends Mammal{
	
	private String sound;
	
	public Cat(String name, String furColor,String sound) {
		super(name,furColor);
		this.sound = sound;	
	}
	
	public void getInfo() {
		System.out.println("name :"+this.getName());
		System.out.println("fur clolor : "+this.getFurColor());
		System.out.println("SOund : "+this.getSound());
		
		
	}
	
	public void Sound() {
		System.out.println(this.getSound());
	}
	
	public void Sleep() {
		System.out.println("The cat sleeps 12 hrs");
	}
	
	@Override
	public void controlTemperature() {
		// TODO Auto-generated method stub	
		System.out.println("The common tempeture of mammal is 20C");
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
