package prg2;

import java.util.Arrays;

public class min_max {

	public static void main(String[] args) {
		int []arr= {23,12,45,1,87,90};
		System.out.println("original:"+Arrays.toString(arr));
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min: "+min+" "+"max: "+max);

	}

}
