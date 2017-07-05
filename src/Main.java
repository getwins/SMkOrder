
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
			
			System.out.println("是否继续录入下条成交Y/n");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
//			byte b = sc.nextByte();
			String s = sc.nextLine();
			if(!(s == "Y" || s == "y")){
				break;
			}
		}
			
	}
	


}
