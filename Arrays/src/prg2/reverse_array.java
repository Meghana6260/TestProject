package prg2;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {
		int []arr= {12,54,76,20,9};
		int n=arr.length;
		System.out.println("original:"+Arrays.toString(arr));
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("result:"+Arrays.toString(arr));

    }
}
      
