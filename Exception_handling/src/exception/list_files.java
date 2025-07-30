package exception;
import java.util.Date;
import java.io.File;
public class list_files {
	public static void main(String []args) {
		File file=new File("C:\\Users\\ahhsa\\OneDrive\\Desktop");
		String[] filelist=file.list();
		for(String name:filelist) {
			System.out.println(name);
		}
	}

}
