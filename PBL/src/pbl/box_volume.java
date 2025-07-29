package pbl;
import java.util.Scanner;

class Volume {
    int height, width, depth;

   
    Volume(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    
    int vol1() {
        return height * width * depth;
    }
}

public class box_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter depth: ");
        int d = sc.nextInt();
        Volume v = new Volume(h, w, d);
        System.out.println("Volume of the box: " + v.vol1());
    }
}
