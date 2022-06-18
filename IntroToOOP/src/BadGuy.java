
public class BadGuy extends Charecters{
	String getAway ;
	public String getGetAway() {
		return getAway;
	}
	BadGuy(String name, int health, String getAway) {
		super(name, health);
		this.getAway = getAway;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printINfo() {
		System.out.println("name :"+ this.getName() + ",Helath :"+this.getHealth() + "getaway :"+this.getGetAway());
	}
	

}
