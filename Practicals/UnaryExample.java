class UnaryExample {
	
	public void increment(){
		int x=10;
		System.out.println(x++);  //10 
		System.out.println(x++);  //11 
		System.out.println(++x);  //13
		System.out.println(x++);  //13
		System.out.println(x);    //14
	}
	
	public void decrement() {
		int x=10;
		System.out.println("----------"); 
		System.out.println(x--);  //10
		System.out.println(x--);  //9
		System.out.println(--x);  //7
		System.out.println(--x);  //6
		System.out.println(x--);  //6
		System.out.println(x);	  //5 
	}
	public static void main(String args[]) {
		
		UnaryExample id = new UnaryExample();
		id.increment();
		id.decrement();
		
	}

}