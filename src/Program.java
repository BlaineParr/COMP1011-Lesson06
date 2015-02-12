
public class Program {

	public static void main(String[] args) 
	{
		Car myCar = new Car(true);
		System.out.println(myCar.toString());
		
		Train smallTrain = new Train(false);
		System.out.println("Does my train have storage? " + smallTrain.haveStorage());
	} //method main ends
} //class ends
