class Podstawy {
public static void main(String[] args){
	String imieUzytkownika = args[0];
	int wiek = Integer.parseInt(args[1]);
	System.out.println("Witaj "  + imieUzytkownika);
	System.out.println("Masz " + wiek + " lat");
	System.out.println("Do 100 lat brakuje Ci " + (100 - wiek));
}
}