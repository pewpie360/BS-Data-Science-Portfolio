package Inheri;

//Person is a superclass
public class Person {
	private String name; //creating an instance private String var
	
	//default constructor
	public Person() {
		name = "No Name Value";
	}
	//constructor with parameter to get user input 
	public Person(String Nm) {
		name = Nm;
	}
	//constructor for setter/mutator which is set a new value of the name 
	public void setName(String n) {
		name = n;
	}
	//constructor for getter or return the pass value of the name
	public String getName() {
		return name;
	}
}

//TitledPerson is a subclass of Person
class TitledPerson extends Person{
	private String Mr;//creating an instance private String var
	
	//default constructor
	public TitledPerson() {
		Mr = "No Title Value";
	}
	//adding constructor with parameter for super()
	public TitledPerson(String title,String nm) {
		super(nm);
		Mr = title;
	}
	//overloading constructor for title
	public void SetTitle(String newMr) {
		Mr = newMr;
	}
	//constructor to get the title
	public String getTitle() {
		return Mr;
	}
	
	//adding constructor with parameter for super()
	public void reset(String Nmr,String newName) {
		setName(newName);//get the setName with parameter to use it to overload the current value on it
		Mr = Nmr;
	}
	//constructor use to display the value of the inputs
	public void writeOutput() {
		System.out.println("Title: " + Mr);
		System.out.println("Name: " + getName());
		System.out.println(Mr + " " + getName());
	}
}
