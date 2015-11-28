
public class Bruch {
	
	private int zaehler;
	private int nenner;

	
	public Bruch (int zaehler, int nenner){
		this.zaehler =zaehler;
		this.nenner = nenner;
		}


	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}
	
	public double toDecimal(){
		double decimal = zaehler*1.0/nenner;
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
		//System.out.println(bruchb2.zaehler+"/"+bruchb2.nenner);
		return ergebniss;
	}
	public Bruch multiplicate2(Bruch b2,Bruch b3){
		int nzaehler;
		int nnenner;
		nzaehler= this.zaehler * b2.zaehler * b3.zaehler;
		nnenner= this.nenner * b2.nenner * b3.nenner;
		Bruch ergebniss = new Bruch(nzaehler, nnenner);
		//System.out.println(bruchb3.zaehler+"/"+bruchb3.nenner);
		return ergebniss;
	}

}
