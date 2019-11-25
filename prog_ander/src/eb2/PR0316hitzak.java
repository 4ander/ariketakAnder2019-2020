package eb2;
import java.util.Scanner;
/*Iturri-kode honek kateak eskatzen ditu eta karakteretan gordetzen ditu gero, karaktere handiena eta txikiena hemateko*/
public class PR0316hitzak {

	public static void main(String[] args) {
		String katea;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("hemaidazu kate bat: ");
		katea=teklatua.next();
		/*erabiltzaileak kate bat sartzen du eta "katea" aldagaiean sartzen da
		 , ondoren katea karaktereka banatzen da eta "karaktereak" array barruan sartzen da*/
		char[]karaktereak=katea.toCharArray();
		/*beste array bat sortzen da, "balioak", non karaktere bakoitzaren ASCII balio sartuko da*/
		int[]balioak=new int[karaktereak.length];
		
		for(int i=0;i<karaktereak.length;i++) {
			//ASCII balioa karaktereka atera eta "balioak" array barruan sartzen da
			int asciiValue = (int) karaktereak[i];
			balioak[i]=asciiValue;
			System.out.println(balioak[i]+"---"+karaktereak[i]);
		}
		int min=balioak[0];
		char minznbk = 0;
		int max=balioak[0];
		char maxznbk = 0;
		//minimoa kalkulatzen da
		for(int w=0;w<balioak.length;w++) {
			if(min>balioak[w]) {
				min=balioak[w];
				minznbk=karaktereak[w];
			}
			if(max<balioak[w]) {
				max=balioak[w];
				maxznbk=karaktereak[w];
			}
		}
		System.out.println("zenbakirik altuena "+maxznbk+"("+max+") da, eta txikiena "+minznbk+" da, ("+min+")");

	}

}
