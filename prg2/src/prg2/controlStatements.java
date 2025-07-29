package prg2;
import java.util.Scanner;
public class controlStatements {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println(" its a positive number");
			
		}
		else {
			System.out.println("its a negavtive number");
		}
		
	}
	

}
