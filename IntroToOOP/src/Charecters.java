
public class Charecters {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	private int health;
	
	Charecters (String name, int health){
		this.name = name;
		this.health = health;
		
	}
	public void printINfo() {
		System.out.println("name :"+ this.name + ",Helath :"+this.health);
	}
	
	
	
	
}
