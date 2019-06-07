class Logika {
	public static void main(String[] args){
	boolean porownanie = (2 == 3);	
		System.out.println("Czy 2 rowna sie 3? " + porownanie);
		porownanie = (2 == 2);	
		System.out.println("Czy 2 rowna sie 2? " + porownanie);
		System.out.println("!(2==2) " + !(2 == 2));
		System.out.println("(2==2) && (2 == 3) " + ((2==2) && (2 == 3)));
		System.out.println("(2==2) || (2 == 3) " + ((2==2) || (2 == 3)));
		System.out.println("(2==2) && (3 == 3) " + ((2==2) && (3 == 3)));
		System.out.println("(2==4) || (2 == 3) " + ((2==4) || (2 == 3)));
		System.out.println("No co tam, Panie Znako? :D");
	
	
		if(true){
			System.out.println("Prawda to zawsze prawda");	
		}
	
		if(false){
			System.out.println("Prawda to czasem falsz");	
		}		
			
		if(2>1){
			System.out.println("2>1");	
		}
			
		porownanie = ("kot"=="pies");
		if(porownanie){
			System.out.println("pies to kot");	
		}
		else {
		System.out.println("Pies to nie kot");
		}
	}
}