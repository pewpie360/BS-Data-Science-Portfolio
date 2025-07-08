package javaCalc_Inheri;
import java.util.Scanner; //import package
public class Test_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //create a scanner 
		
		int i,j; //instantiate global int i and j
		
		Arr_Calc arr; // arr as ref to Arr_Calc
		
		//Creating a reference variable and instantiate the subclass with no value on the parameter
		Calculate calc = new Calculate();
		
		arr = calc; // Arr_Calc reference point to calculate object
		
		double f_num[] = new double[5]; //pass the converted array limit into one dimensional array
		
		//pass a loop statement
		for(i = 0; i <= 4; i++) {
			System.out.print("Enter the first set of numbers: ");// ask user to input first set of numbers
			f_num[i] = sc.nextDouble(); // convert inputs into double not int
		}
		double s_num[] = new double[5];
		for(j = 0; j <= 4; j++) {
			System.out.print("Enter the second set of numbers: "); // ask user to input second set of numbers
			s_num[j] = sc.nextDouble(); // convert inputs into double not int
		}
		
		arr.setArr(f_num, s_num); //Accessing the SetArr variable of an object and pass two variables that has its current value on it
		
		System.out.println("\nOperation: (+)Addition     (*)Multiplication\n           (-)Subtraction (/)Division" ); //user choose and operator
		System.out.print("Enter an Operator: ");
		char opt = sc.next().charAt(0);//convert inputs into char and must start at 0
		
		//create case statement
		switch(opt) {
		
		case '+':
			
			calc.Add(f_num, s_num); //setter for addition
				arr.firstArr_output(); //Display output for 1st Set
				arr.secondArr_output(); //Display output for 2nd Set

			System.out.print("\nThe sum of the numbers are: ");
			calc.calculate_output(); //Display output for sum of two arrays and applying also the getter method
			break;
			
		case '-':
			calc.Sub(f_num, s_num); //setter for subtraction
			arr.firstArr_output(); //Display output for 1st Set
			arr.secondArr_output(); //Display output for 2nd Set
			
			System.out.print("\nThe subtraction of the numbers are: ");
			calc.calculate_output(); //Display output for sub of two arrays and applying also the getter method
			break;
			
		case '*':
			calc.Mult(f_num, s_num);
			arr.firstArr_output(); //Display output for 1st Set
			arr.secondArr_output(); //Display output for 2nd Set
			
			System.out.println("\nThe product of the numbers are: ");
			calc.calculate_output(); //Display output for product of two arrays and applying also the getter method
			break;
			
		case '/':
			calc.Div(f_num, s_num);
			arr.firstArr_output(); //Display output for 1st Set
			arr.secondArr_output(); //Display output for 2nd Set
			
			System.out.println("\nThe quotient of the numbers are: ");
			calc.calculate_output(); //Display output for qoutient of two arrays and applying also the getter method
			break;
		}
	
	}

}
