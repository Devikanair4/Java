package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg4 {

	public static void main(String[] args) {
		
//		objects of student class (parametersed constructor)
		Student ram = new Student(1, "ram", "Advance Java");
		Student ajay = new Student(2, "Ajay", "AWS");
		Student raju = new Student(3, "Raju", "Excel");
		
//		objects of student class (Setter method)
		Student abhi = new Student();
		abhi.setStudent_rollNumber(4);
		abhi.setStudent_name("Abhi");
		abhi.setCourse("Basic Computer");
		
//		Creating ArrayList for Storing Student Class Objects
		ArrayList<Student> studentList = new ArrayList<Student>();
		
//		Adding Student in ArrayList(studentList)
		studentList.add(ram);
		studentList.add(ajay);
		studentList.add(raju);
		studentList.add(abhi);
		
		studentList.add(new Student(5, "rajan", "Digital Marketing"));
		
		
		studentList.remove(0);
		Iterator<Student> itr =  studentList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
