package pk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copy_lists {
	public static void main(String[]args) {
	List<String> al=new ArrayList<String>();
	al.add("red");
	al.add("green");
	al.add("blue");
	al.add("brown");
	al.add("yellow");
	List<String> bl=new ArrayList<String>();
	bl.add("10");
	bl.add("20");
	bl.add("30");
	bl.add("40");
	bl.add("50");
	Collections.copy(al, bl);
	System.out.println(al);
	System.out.println(bl);
}
}
