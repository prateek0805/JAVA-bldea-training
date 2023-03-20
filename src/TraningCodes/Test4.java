package TraningCodes;


import java.util.Scanner;


public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1||i==n ||j==1||j==n) {
							
						System.out.print("& ");
					}
					else {
					System.out.print("- ");
				}
					}
		// TODO Auto-generated method stub
System.out.println();
	}
				sc.close();
}
}
