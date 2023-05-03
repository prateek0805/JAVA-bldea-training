package TraningCodes;
class Tiger{
	private String name;
	private String color;
	private int cost;
	
	void setData(String name,String color,int cost) {
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class Test6 {

	public static void main(String[] args) {
		Tiger d1=new Tiger();
		//d1.name="tommy";
	    //d1.cost=5000;
		d1.setData("Blacky", "black", 5000);
		d1.getData();
				

	}

}
