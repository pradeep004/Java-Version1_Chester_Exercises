
public class AnotherJavaFile {
	String name = "Pradeep";
	int age = 25;
	
	public void howOld() {
		System.out.println(name  + " is " + age  + " years old");
	}
	
	public void sayhello(String name) {
		System.out.println("Helllo" + name);
	}
	
	public int howLongRetirement(int age) {
		System.out.println(name+ "'s remaining retirement is"+ (65-age));
		return (65-age);
		
	}
}
