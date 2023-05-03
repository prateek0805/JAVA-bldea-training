package TraningCodes;
class Dog{
	private String name;
	private String color;
	private int cost;
	
	void setData(String a,String b,int c) {
		name=a;
		color=b;
		cost=c;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class Test5 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		//d1.name="tommy";
	    //d1.cost=5000;
		d1.setData("Blacky", "black", 5000);
		d1.getData();
				

	}

}
