package exception;
import java.io.File;
import java.io.FilenameFilter;
public class get_files_byextension {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ahhsa\\OneDrive\\Desktop\\internship"
				+ "");
		String []list=file.list(new FilenameFilter(){
			public boolean accept(File dir,String name) {
				if(name.toLowerCase().endsWith(".py")) {
					return true;
				}
				else {
					return false;
				}
			}
		});
		for (String f:list) {
			System.out.println(f);
		}
	}

}
