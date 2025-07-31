package pk2;

import java.util.ArrayList;
import java.util.List;

public class insert_pos {
	public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
	al.add("red");
	al.add("green");
	al.add("blue");
	System.out.println(al);
	al.add(0,"yellow");
	al.add(2,"brown");
	System.out.println(al);
	

}
}
