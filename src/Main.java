
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
			
			System.out.println("�Ƿ���Լ¼�������ɽ�Y/n");
			Scanner sc = new Scanner(System.in);
			byte b = sc.nextByte();
			if(!(b == 'Y' || b == 'y')){
				break;
			}
			sc.close();
		}
			
	}
	


}
