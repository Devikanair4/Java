package Container;

import java.io.FileReader;
import java.io.FileWriter;

public class FileRWEg {

	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("D:\\demo1.txt");
			f.write("Heyyy good afternoon");
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//reading
		try {
			FileReader f1 = new FileReader("D:\\demo1.txt");
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.print((char)i);
			}
			f1.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}
}
