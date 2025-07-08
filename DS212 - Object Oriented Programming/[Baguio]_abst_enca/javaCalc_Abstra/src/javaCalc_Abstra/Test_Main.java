package javaCalc_Abstra;
import java.util.*;
public class Test_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		display dis = new display();
		
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
		
		dis.setArr(f_num, s_num); //Accessing the SetArr variable of an object and pass two variables that has its current value on it
		
		System.out.println("\nOperation: (+)Addition     (*)Multiplication\n           (-)Subtraction (/)Division" ); //user choose and operator
		System.out.print("Enter an Operator: ");
		char opt = sc.next().charAt(0);//convert inputs into char and must start at 0
		
		//create case statement
		switch(opt) {
				
		case '+':
					
			dis.Add(f_num, s_num); //setter for addition
				dis.firstArr_output(); //Display output for 1st Set
				dis.secondArr_output(); //Display output for 2nd Set

				System.out.print("\nThe sum of the numbers are: ");
				dis.calculate_output(); //Display output for sum of two arrays and applying also the getter method
				break;
		case '-':
			dis.Sub(f_num, s_num); //setter for subtraction
			dis.firstArr_output(); //Display output for 1st Set
			dis.secondArr_output(); //Display output for 2nd Set
			
			System.out.print("\nThe subtraction of the numbers are: ");
			dis.calculate_output(); //Display output for sub of two arrays and applying also the getter method
			break;
			
		case '*':
			dis.Mult(f_num, s_num);
			dis.firstArr_output(); //Display output for 1st Set
			dis.secondArr_output(); //Display output for 2nd Set
			
			System.out.println("\nThe product of the numbers are: ");
			dis.calculate_output(); //Display output for product of two arrays and applying also the getter method
			break;
			
		case '/':
			dis.Div(f_num, s_num);
			dis.firstArr_output(); //Display output for 1st Set
			dis.secondArr_output(); //Display output for 2nd Set
			
			System.out.println("\nThe quotient of the numbers are: ");
			dis.calculate_output(); //Display output for qoutient of two arrays and applying also the getter method
			break;

	}
		
	}
}

