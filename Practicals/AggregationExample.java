class Idproof { //class1
	int inum;
	String city;
	String state;
	int pincode;
	String dob;
	
		Idproof(int inum, String city, String state, int pincode, String dob) {
			this.inum = inum;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.dob = dob;
		}

}

class Student { //class2
	int id;
	String name;
	String emailId;
	long contact;
	Idproof idp; // this idp(object) gives the reference to the above class which brings all the items from it.

		Student (int id, String name, String emailId, long contact, Idproof idp) {
			this.id = id;
			this.name = name;
			this.emailId = emailId;
			this.contact = contact;
			this.idp = idp;
		
		}
		
		public void show() {
			System.out.println(id+ " " +name+ " "+emailId+ " "+contact);
			System.out.println(idp.inum+" "+idp.city+ " "+idp.state+ " "+idp.pincode+ " "+idp.dob);
		}
}

class AggregationExample{ //main class
	public static void main (String args[]) {
		Idproof id = new Idproof(101, "mumbai", "mh", 12345, "12-05-2006");
		Idproof id1 = new Idproof(102, "hyderabad", "tel", 78645, "17-03-2006");
		Idproof id2 = new Idproof(103, "delhi", "delhi", 86745, "02-12-2010");
		
		Student s = new Student(1, "Devika", "devika12@gmail.com",9876543, id);
		Student s1 = new Student(2, "Sam", "sam12@gmail.com",9883453, id1);
		Student s2 = new Student(3, "Chirag", "chirag23@gmail.com",978643,id2);
		
		
		s.show();
		s1.show();
		s2.show();
	}
}