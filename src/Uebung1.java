
public class Uebung1 {

	public static void main(String[] args) 
	{
		double ergebniss;
		Bruch Test = new Bruch(7,3);
		Bruch Test2 = new Bruch(3,5);
		Bruch Test3 = new Bruch(1,2);
		
		Test.print();
		
		System.out.println(Test.toDecimal());

		Bruch erg = Test2.multiplicate(Test);
		erg.print();
		
		erg= Test3.multiplicate2(Test, Test2);
		erg.print();
		
	}

}
