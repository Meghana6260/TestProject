package pk2;

import java.util.ArrayList;
import java.util.List;

public class search_ele {
	public static void main(String[]args) {
		List<String> al=new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("brown");
		al.add("yellow");
//		int index=al.indexOf("yellow");
//		System.out.println(index);
		if(al.contains("yellow")) {
			System.out.println("in list");
		}
		else {
			System.out.println("not in list");
		}

}
}
