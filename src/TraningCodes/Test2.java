package TraningCodes;



import java.util.Scanner;
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(age < 18 ) {
			System.out.println("you are still minor");
		}
		else if(age > 65) {
			System.out.println("you are senior citizen");
		}
		else {
			System.out.println("Congragulations");
		}
	
		
		
		// TODO Auto-generated method stub

	}

}
