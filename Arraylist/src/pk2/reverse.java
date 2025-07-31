package pk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse {
	public static void main(String[]args) {
		List<String> al=new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("brown");
		al.add("yellow");
		Collections.reverse(al);
		System.out.println(al);

}
}
