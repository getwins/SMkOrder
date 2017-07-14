
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(;;){
			try{
				SanitySystemIn sanitySystemIn = new SanitySystemIn();
				sanitySystemIn.doSystemIn();
				
				MkRecord mkRec = new MkRecord(sanitySystemIn);
				mkRec.mkRecord();
			}
			catch(Exception err){
				err.printStackTrace();
			}
			
			System.out.print("是否继续录入下条成交Y/n:");
			
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if(!(s.charAt(0) == 'Y' || s.charAt(0) == 'y')){
				System.exit(0);
			}
		}
			
	}
	


}
