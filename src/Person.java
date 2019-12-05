class Person{
	void eat(){
		System.out.println("eat");
	}

	void walk(){
		System.out.println("walk");
	}
}


class Student extends Person{

	void read(){
		System.out.println("student read method executed");
	}
	void eat(){
		System.out.println("eat student");
	}
}

 
 class TestPerson{
 public static void main(String[] args) {
 	
 		/*Person p=new Student();
 		Student s1=(Student)p;
 		s1.read();
 		s1.eat();
 		s1.walk();
*/


 		Student s= new Student();
 		Person p=(Person)s;
 		s.eat();
 		s.walk();
 		
		p.walk();
 		p.eat();

		((Student)p).read();
 		s.read();
 	}	
 }