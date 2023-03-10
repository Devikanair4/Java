package Container;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileIOStreamEg {

	public static void main(String[] args) {
		//writing in bytes
		try {
			FileOutputStream f = new FileOutputStream("D:\\demo.txt");
			String name = "We are learning java io classes";
			byte array[]=name.getBytes(); //converting strings to byte array
			f.write(array);
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//reading
		try {
			FileInputStream f1 = new FileInputStream("D:\\demo.txt");
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
