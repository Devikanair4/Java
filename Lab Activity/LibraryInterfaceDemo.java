package NewPackage;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers ku1 = new KidUsers(10, "Kids");
		ku1.registerAccount();
		ku1.requestBook();
		KidUsers ku2 = new KidUsers(18, "Fiction");
		ku2.registerAccount();
		ku2.requestBook();
		AdultUser au1 = new AdultUser(5, "Kids");
		au1.registerAccount();
		au1.requestBook();
		AdultUser au2 = new AdultUser(23, "Fiction");
		au2.registerAccount();
		au2.requestBook();
	}
}