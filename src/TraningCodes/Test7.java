package TraningCodes;
class Dog1{
	private String name;
	private String color;
	private int cost;

	public Dog1() {
		
	}
    public Dog1(String name) {
		this.name=name;
	}
    public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public Dog1(String name,String color) {
		this.name=name;
		this.color=color;
	}
    public Dog1(String name,String color,int cost) {
		super();
		this.name=name;
		this.color=color;
		this.cost=cost;
		
	}
}

public class Test7 {

	public static void main(String[] args) {
	Dog1 d1=new Dog1();
	System.out.println(d1.getName());
	System.out.println(d1.getColor());
	System.out.println(d1.getCost());
	
	Dog1 d2=new Dog1("Rocky");
	System.out.println(d2.getName());
	System.out.println(d2.getColor());
	System.out.println(d2.getCost());
	
	Dog1 d3=new Dog1("Tommy","White");
	System.out.println(d3.getName());
	System.out.println(d3.getColor());
	System.out.println(d3.getCost());
	
	Dog1 d4=new Dog1("Jonny","Brown",5000);
	System.out.println(d4.getName());
	System.out.println(d4.getColor());
	System.out.println(d4.getCost());
	}

}
