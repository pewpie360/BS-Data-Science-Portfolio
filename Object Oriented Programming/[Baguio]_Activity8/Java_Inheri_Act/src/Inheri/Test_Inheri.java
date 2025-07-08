package Inheri;

public class Test_Inheri {

	public static void main(String[] args) {
		
		//Creating a reference variable and instantiate the subclass with no value on the parameter
		TitledPerson Tp = new TitledPerson();
		
		//Accessing the reset var of an objects to display value of TitledPerson obj
		//Tp.reset("Honorable", "Mark");
		
		//Accessing the SetTitle var of an object to overload the current value on it
		Tp.SetTitle("Mister");
		
		//Accessing the setName var of an object to overload the current value on it
		//Tp.setName("Jay");
		
		//Accessing the display var of an object to display the current value inputs
		Tp.writeOutput();
	}

}
