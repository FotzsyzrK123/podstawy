class Domowa {
public static void main(String[] args){
	String imieUzytkownika = args[0];
	String rzeczownik = args[1];
	System.out.println(imieUzytkownika +" to " + rzeczownik);
	if(args[0].compareTo("Krzys")==0){
	System.out.println("Witaj Krzysiu!");
	}
	else{
	System.out.println("Kim jestes Srullu??");
	}
}
}