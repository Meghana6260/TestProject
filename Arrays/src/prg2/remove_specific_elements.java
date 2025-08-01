package prg2;
import java.util.*;
public class remove_specific_elements {

	public static void main(String[] args) {
		int []arr= {23,45,76,12,87};
		System.out.println(Arrays.toString(arr));
		int removeindex=2;
		for (int i=removeindex;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			}
		System.out.println("After removing the second element: "+(Arrays.toString(arr)));

		}

}
