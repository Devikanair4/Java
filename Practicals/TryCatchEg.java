public class TryCatchEg {
	public static void main(String args[]) {
		try {  //may throw exception
			//int num=88/0;
			System.out.println(num);
			System.out.println(num.length());
		}
		catch (Exception e){ //handle exception
			System.out.println(e);
		}
	}
}