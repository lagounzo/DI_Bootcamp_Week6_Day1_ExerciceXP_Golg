/**
 * @author N'ZO LAGOU
 * 
 *  Exercise 2 : Constructor Chaining
Instructions
Create a class called “Car” with the following properties:

make (String)
model (String)
year (int)
color (String)
price (double)
Create a default constructor that initializes all properties to default values.

Create a parameterized constructor that takes values for the make, model, and year properties, and uses the “this” keyword to call the default constructor and set the values of the remaining properties.

Create another parameterized constructor that takes values for all properties, and uses the “this” keyword to call the previously created parameterized constructor and set the values of the make, model, and year properties.

Create a method called “displayCarInfo” that prints out the values of all properties in the following format: “Make: <make>, Model: <model>, Year: <year>, Color: <color>, Price: <price>“

In the main method, create an object of the Car class using each of the constructors and call the “displayCarInfo” method to display the property values for each object.
 * 
 */


package gold;

public class Car {

	private String make;
	private String model;
	private int year;
	private String color;
	private double price;

	public Car() {
		super();
		this.make = "";
		this.model = "";
		this.year = 0;
		this.color = "";
		this.price = 0;

	}

	public Car(String make, String model, int year) {
		this();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car(String make, String model, int year, String color, double price) {
		this(make, model, year);
		this.color = color;
		this.price = price;
	}
	
	public void displayCarInfo() {
		System.out.println("Make: " + make + ", Model: "+ model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("Opel", "O7", 2021);
		Car car3 = new Car("Benz", "B7", 2022, "Black", 300000);
		
		car1.displayCarInfo();
		car2.displayCarInfo();
		car3.displayCarInfo();
	}

	}


