package collectiontutorial;

//The meaning of Encapsulation, is to make sure that "sensitive" data is 
//hidden from users. To achieve this, you must:

//declare class variables/attributes as private
//provide public get and set methods to access and 
//update the value of a private variable
//In Java, getter and setter are two conventional methods that are used for retrieving and updating the value of a variable.
//=============

//class Person {
//	private String name;
//
//	// Getter
//	public String getName() {
//		return name;
//	}
//
//	// Setter
//	public void setName(String newName) {
//		this.name = newName;
//	}
//}
//
//public class Getter_Setter {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person myObj = new Person();
//		myObj.name = "John";// error here we can not
//		System.out.println(myObj.name);
//	}
//
//}
// ================
class Person {
	private String newName;

	Person() {
		this.newName = "Default Name";
	}

	// Getter
	public String getName() {
		return this.newName;
	}

	// Setter
	public void setName(String newName) {
		this.newName = newName;
	}
}

public class Getter_Setter {
	public static void main(String[] args) {
		Person myObj = new Person();
		// myObj.setName("John");
		System.out.println(myObj.getName());
	}
}