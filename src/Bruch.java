
public class Bruch {
	
	private int zaehler;
	private int nenner;
	public static int Counter = 0;
	public static int berechnungen =0;

	
	public Bruch (int zaehler, int nenner){
		this.zaehler =zaehler;
		this.nenner = nenner;
		Counter++;
		}


	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}
	
	public double toDecimal(){
		double decimal = zaehler*1.0/nenner;
		berechnungen++;
		return decimal;
	}
	
	public void print(){
		System.out.println(zaehler+"/"+nenner);
	}
	
	public Bruch multiplicate(Bruch b2){
		int nzaehler;
		int nnenner;
		nzaehler= this.zaehler * b2.zaehler;
		nnenner= this.nenner * b2.nenner;
		Bruch ergebniss = new Bruch(nzaehler, nnenner);
		berechnungen++;
		return ergebniss;
	}
	public Bruch multiplicate2(Bruch b2,Bruch b3){
		berechnungen++;
		return new Bruch(this.zaehler*b2.zaehler*b3.zaehler, this.nenner*b2.nenner*b3.nenner);
	} //Stark optimierte Rückgabe

	public Bruch kuerzen(){
/*	for (int repeat =0;repeat <11;repeat++){
		for (int i = 2; i<11; i++){
		if (nenner%i == 0 && zaehler%i ==0){
			nenner=nenner / i;
			zaehler=zaehler /i;
			berechnungen++;
		}
		else continue;		
	
	}*/
	int i=2;
	while (i<nenner/2)
	{
		if (nenner%i == 0 && zaehler%i ==0){
			nenner=nenner / i;
			zaehler=zaehler /i;
			berechnungen++;
			i++;
	}
		else i++;
	}
	return new Bruch (zaehler,nenner);
}
}