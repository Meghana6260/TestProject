package prg2;
import java.util.*;
public class insert_specific_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12, 54, 76, 98};
		int insertindex=2;
		int newvalue=65;
		System.out.println("original array"+Arrays.toString(arr));
		for(int i=arr.length-1;i>=insertindex;i--) {
			arr[i]=arr[i-1];
		}
		arr[insertindex]=newvalue;
		System.out.println("result:"+Arrays.toString(arr));
	}

}
