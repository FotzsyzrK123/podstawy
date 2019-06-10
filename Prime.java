public class Prime{
	public static void main(String[] args){ 
		int pierwsze;
		pierwsze = Integer.parseInt(args[0]);
		int druga;
		int krotnosc;
		krotnosc = 0;
		boolean czySieDzieli = false;
		for(druga=2; druga<Math.sqrt(pierwsze); druga++){
			
			if((pierwsze%druga)==0){	
				czySieDzieli = true;
				krotnosc = druga;
			}
			System.out.println(druga + " " + czySieDzieli);
		}
			if(czySieDzieli==true){
				System.out.println("Nie jest pierwsza, poniewaz dzieli sie przez " + krotnosc);
			}
			else{
				System.out.println("Jest pierwsza");
			}
	}
}

