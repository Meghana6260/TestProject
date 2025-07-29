package prg2;
import java.util.HashSet;
public class duplicate_values {

	public static void main(String[] args) {
		int [] arr= {12,54,18,65,12,54};
		System.out.print("original:");
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		HashSet<Integer> seen =new HashSet<>();
		HashSet<Integer> unseen =new HashSet<>();
		
		for(int num:arr) {
			if(!seen.add(num)) {
				unseen.add(num);
			}
		}
		if(unseen.isEmpty()) {
			System.out.println("No Duplicates");
			
		}
		else {
			System.out.println("duplicate values:"+ unseen);
		}

	}

}
