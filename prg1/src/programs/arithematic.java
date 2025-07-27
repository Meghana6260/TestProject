package programs;
import java.util.Scanner;

public class arithematic {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st number");
		int a =sc.nextInt();
		System.out.println("enter 2nd number");
		int b =sc.nextInt();
		System.out.println("addition:"+ (a+b));
		System.out.println("subs:"+ (a-b));
		System.out.println("multiplication:"+ (a*b));
		System.out.println("division:"+ (a/b));
		System.out.println("modulus:"+ (a%b));
		
	}

}
