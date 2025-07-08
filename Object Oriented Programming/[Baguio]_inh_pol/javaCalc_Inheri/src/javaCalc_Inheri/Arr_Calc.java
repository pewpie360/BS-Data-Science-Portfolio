package javaCalc_Inheri;

//Arr_Calc is the superclass
public class Arr_Calc {
	private double arra, arra1, arra2, arra3, arra4; //creating an instance private Double variable for the first array
	private double arr, arr1, arr2, arr3, arr4; //creating an instance private Double variable for the second array
	
	//blank constructor
	public Arr_Calc() {

	}

	//create a setter and manually pass arrays by index
	public void setArr(double newArr[], double newArr1[]) {
		arra = newArr[0];
		arra1 = newArr[1];
		arra2 = newArr[2];
		arra3 = newArr[3];
		arra4 = newArr[4];
		
		arr = newArr1[0];
		arr1 = newArr1[1];
		arr2 = newArr1[2];
		arr3 = newArr1[3];
		arr4 = newArr1[4];
	}
	
	public double getArray() {
		return arra;
	}
	public double getArray1() {
		return arra1;
	}
	public double getArray2() { //Create 5 separate getter for the first array
		return arra2;
	}
	public double getArray3() {
		return arra3;
	}
	public double getArray4() {
		return arra4;
	}
	
	public double getArr() {
		return arr;
	}
	public double getArr1() {
		return arr1;
	}
	public double getArr2() { //Create 5 separate getter for the second array
		return arr2;
	}
	public double getArr3() {
		return arr3;
	}
	public double getArr4() {
		return arr4;
	}
	
	//constructor use to display the value for the first array
	public void firstArr_output() {
		System.out.print("The first set for numbers are: " + getArray());
		System.out.print(" " + getArray1());
		System.out.print(" " + getArray2());
		System.out.print(" " + getArray3());
		System.out.print(" " + getArray4());
		System.out.println();
		
	}
	
	//constructor use to display the value for the second array
	public void secondArr_output() {
		System.out.print("The second set for numbers are: " + getArr());
		System.out.print(" " + getArr1());
		System.out.print(" " + getArr2());
		System.out.print(" " + getArr3());
		System.out.print(" " + getArr4());
		
	}


}

//calculate is the subclass of Arr_Calc
class Calculate extends Arr_Calc {
	private double array, array1, array2, array3, array4; //creating an instance private Double variable for calculation
	
	//create constructor that manually pass arrays and add both by index
	public void Add(double arri[], double arri1[]) {
		array = arri[0] + arri1[0];
		array1 = arri[1] + arri1[1];
		array2 = arri[2] + arri1[2];
		array3 = arri[3] + arri1[3];
		array4 = arri[4] + arri1[4];
	}
	
	//create constructor that manually pass arrays and subtract both by index
	public void Sub(double arri[], double arri1[]) {
		array = arri[0] - arri1[0];
		array1 = arri[1] - arri1[1];
		array2 = arri[2] - arri1[2];
		array3 = arri[3] - arri1[3];
		array4 = arri[4] - arri1[4];
	}
	
	//create constructor that manually pass arrays and multiply both by index
	public void Mult(double arri[], double arri1[]) {
		array = arri[0] * arri1[0];
		array1 = arri[1] * arri1[1];
		array2 = arri[2] * arri1[2];
		array3 = arri[3] * arri1[3];
		array4 = arri[4] * arri1[4];
	}
	
	//create constructor that manually pass arrays and divide both by index
	public void Div(double arri[], double arri1[]) {
		array = arri[0] / arri1[0];
		array1 = arri[1] / arri1[1];
		array2 = arri[2] / arri1[2];
		array3 = arri[3] / arri1[3];
		array4 = arri[4] / arri1[4];
	}
	
	public double getRes() {
		return array;
	}
	
	public double getRes1() {
		return array1;
	}
	
	public double getRes2() { //Create 5 separate getter for the result arrays
		return array2;
	}
	
	public double getRes3() {
		return array3;
	}
	
	public double getRes4() {
		return array4;
	}
	
	//constructor use to display the value operated arrays
	public void calculate_output() {
		System.out.print(getRes());
		System.out.print(" " + getRes1());
		System.out.print(" " + getRes2());
		System.out.print(" " + getRes3());
		System.out.print(" " + getRes4());
	}
}


