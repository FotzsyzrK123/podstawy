class Przysiady {
public static void main(String[] args){
	int przysiady;
	przysiady = Integer.parseInt(args[0]);
	if((przysiady%2)==0){
		System.out.println("Gratulacje! Zrobiles " + przysiady/2 + " przysiadow");
	}		
	else{
		if((przysiady/2)<2)
			System.out.println("Nie len sie! Jestes na dole. Rusz dupe do pelnego przysiadu!" + " Zrobiles dopiero " + przysiady/2 + " przysiad!");
		else if((przysiady/2)<4)
			System.out.println("Nie len sie! Jestes na dole. Rusz dupe do pelnego przysiadu!" + " Zrobiles dopiero " + przysiady/2 + " przysiady!");
		else
			System.out.println("Nie len sie! Jestes na dole. Rusz dupe do pelnego przysiadu!" + " Zrobiles dopiero " + przysiady/2 + " przysiadow!");
	}

}
}