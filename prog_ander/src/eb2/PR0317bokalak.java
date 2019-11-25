package eb2;
import java.util.Scanner;
/*iturri-kode homek string bat eskatuko du eta bokal bakoitze zenbat aldiz sartu den esango du*/

public class PR0317bokalak {

	public static void main(String[] args) {
		String katea;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Hemaidazu hitz bat bat: ");
		katea=teklatua.next();
		char[]karaktereak=katea.toCharArray();
		int aeiou[]=new int[5];
		
		for(int i=0;i<karaktereak.length;i++) {
			System.out.println(karaktereak[i]);
			if(karaktereak[i]=='a'|karaktereak[i]=='A') {
				aeiou[0]++;
			}else if(karaktereak[i]==69|karaktereak[i]==101) {
				aeiou[1]++;
			}else if(karaktereak[i]==73|karaktereak[i]==105){
				aeiou[2]++;
			}else if(karaktereak[i]==79||karaktereak[i]==105) {
				aeiou[3]++;
			}else if(karaktereak[i]==85|karaktereak[i]==117) {
				aeiou[4]++;
			}
		}System.out.println("'a' letra "+aeiou[0]+" aldiz idatzi da.");
		System.out.println("'e' letra "+aeiou[1]+" aldiz idatzi da. ");
		System.out.println("'i' letra "+aeiou[2]+" aldiz idatzi da. ");
		System.out.println("'o' letra "+aeiou[3]+" aldiz idatzi da. ");
		System.out.println("'u' letra "+aeiou[4]+" aldiz idatzi da. ");

	}

}
