public class Choinka{
  public static void main(String[] args){
	int pietra;
		pietra = Integer.parseInt(args[0]);
	for(int i=0;i<=pietra;i++){
		for(int j=0;j<i;j++){
		System.out.print("*");
	}
	System.out.println("");
	}
 }
}