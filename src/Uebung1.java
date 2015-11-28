
public class Uebung1 {

	public static void main(String[] args) 
	{
		double ergebniss;
		Bruch Test = new Bruch(420,45);
		Bruch Test2 = new Bruch(240,720);
		Bruch Test3 = new Bruch(100,100);
		Bruch b1 = new Bruch(127,1);
		Bruch b2 = new Bruch(1,127);
		Bruch erg2 = new Bruch(1,1);
		
		Test.print();
		
		System.out.println(Test.toDecimal());

		Bruch erg = Test2.multiplicate(Test);
		erg.print();
		
		erg= Test3.multiplicate2(Test, Test2);
		erg.print();
		
		erg2=erg.kuerzen();
		erg2.print();
		System.out.println(erg2.toDecimal());
		
		System.out.println("Es befinden sich "+Bruch.Counter+ " Brüche im System.");
		System.out.println("Es wurden "+Bruch.berechnungen +" Berechnungen durchgeführt");
		
	}

}
