
public class Uebung1 {

	public static void main(String[] args) 
	{
		double ergebniss;
		Bruch Test = new Bruch(5,3);
		Bruch Test2 = new Bruch(3,5);
		
		Test.print();
		ergebniss = Test.toDecimal();
		System.out.println(ergebniss);

		Test2.multiplicate(Test);
		Test.multiplicate2(Test, Test2);

		
		
	}

}
