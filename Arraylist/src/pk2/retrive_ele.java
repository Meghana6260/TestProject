package pk2;

import java.util.ArrayList;
import java.util.List;

public class retrive_ele {
	public static void main(String[]args) {
		List<String> al=new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		String ele=al.get(0);
		System.out.println("first ele:"+ele);
		String ele1=al.get(2);
		System.out.println("first ele:"+ele1);
		
	}

}
