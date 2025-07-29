package prg2;
import java.util.*;
public class array {
	public static void main (String[]args) {
		int []arr1= {1,2,4,3,5};
		int []arr2= {4,6,2,9,10};
		int[]res= new int[arr1.length];
		int n=arr1.length;
		for(int i=0;i<arr1.length;i++) {
				res[i]=arr1[i]+arr2[i];
			}
		Arrays.sort(res);
		System.out.println("Result: "+Arrays.toString(res));	
		
		
		for(int j=0;j<n/2;j++) {
			int temp=res[j];
			res[j] = res[n - 1 - j];
	        res[n - 1 - j] = temp;
	        }
			
			System.out.println(Arrays.toString(res));
			System.out.println(Arrays.toString(arr1)+(Arrays.toString(res)));
			
		}
	}

	
