package oopsdemo2;

// Dynamic polymorphism
public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();
		vObj.drive();
		
		Vehicle vCar=new Car1();   // Upcasting
		vCar.drive();  // invoke overriden drive method of car1 class
		
		Vehicle vTruck=new Truck(); // Upcasting
		vTruck.drive();
	//	vTruck.load();  // compile time error

		Truck t1=new Truck();
		t1.load();
	}

}
