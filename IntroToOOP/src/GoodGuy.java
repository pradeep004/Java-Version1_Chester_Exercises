
public class GoodGuy extends Charecters{
	String catchPhrase;
	public String getCatchPhrase() {
		return catchPhrase;
	}


	GoodGuy(String name, int health, String catchPhrase) {
		super(name, health);
		this.catchPhrase= catchPhrase;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void printINfo() {
		System.out.println("name :"+ this.getName() + ",Helath :"+this.getHealth() + "getaway :"+this.getCatchPhrase());
	}
	

}


