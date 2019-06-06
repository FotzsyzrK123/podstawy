class If {
	public static void main(String[] args){
	int wybor;
		wybor = Integer.parseInt(args[0]);
		
		if(wybor==17){
			System.out.println("Twój wybór to liczba 17");
		}

		else if(wybor<17){
			System.out.println("Twój wybór wynosi mniej niż 17");	
		}

		else{
			System.out.println("Twój wybór wynosi więcej 17");
		}
	}
}