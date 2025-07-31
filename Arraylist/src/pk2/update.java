package pk2;

import java.util.ArrayList;
import java.util.List;

public class update {
	public static void main(String[]args) {
		List<String> al=new ArrayList<String>();
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("brown");
		al.add("yellow");
		al.set(0, "pink");
		System.out.println(al);

}
}
