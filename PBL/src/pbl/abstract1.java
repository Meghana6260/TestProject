package pbl;
abstract class Shape{
	public abstract double volume();
}
class rectangle extends Shape{
	int length,width;
	
	rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public double volume() {
		
		return length*width;
	}
}

class square extends Shape{
	int side;
	
	square(int side){
		this.side=side;
	}
	
	public double volume() {
		return side*side;
	}
}
public class abstract1 {
	public static void main(String[]args) {
		Shape rect=new rectangle(2,3);
		System.out.println("volume of rect:"+rect.volume());
		
		Shape sq=new square(3);
		System.out.println("volume of square:"+sq.volume());
	}

}
