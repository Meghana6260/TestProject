package exception;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filetest {
	public static void main(String[]args) {
		try {
			File file=new File("C:\\Users\\ahhsa\\OneDrive\\Desktop\\meg.txt");
			if(file.createNewFile()) {
				System.out.println("file is created!");
			}
			else {
				System.out.println("file already exists");
			}
			FileWriter writer=new FileWriter(file);
			writer.write("hi java");
			writer.close();
			
			FileReader reader=new FileReader(file);
			int c;
			while((c=reader.read())!=-1) {
				char ch=(char) c;
				System.out.print(ch);
			}
		}
		catch(IOException e) {
			System.out.print("exception");
			
		}
	}

}
