package pbl;

class House{
	private String address;
	private int no_ofrooms;
	private int area;
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address=address;
	}
	
	public int getrooms() {
		return no_ofrooms;
	}
	public void setrooms(int rooms) {
		this.no_ofrooms=rooms;
	}
	
	public int getarea() {
		return area;
	}
	
	public void setarea(int area) {
		this.area=area;
	}
	
	public int calculateprice(int per_meter_square) {
		return this.area*per_meter_square;
	}
}

public class encapsulation {
	public static void main (String[]args) {
		House h=new House();
		h.setaddress("Vidyanagar");
		h.setrooms(8);
		h.setarea(1200);
		double price=h.calculateprice(2000);
		System.out.println(h.getaddress());
		System.out.println(h.getrooms());
		System.out.println(h.getarea());
		System.out.println("price:"+price);
	}

}
