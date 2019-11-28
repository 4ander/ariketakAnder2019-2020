package eb2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AL1Ariketa {
	public static void main(String[] args) {
		String katea;
		int kont=0;
		ArrayList kateak=new ArrayList<String>();
		Scanner teklatua=new Scanner(System.in);
		
		while (kont!=3) {
			System.out.println("hitz bat: ");
			katea=teklatua.next();
			kateak.add(katea);
			kont++;
		}
		Collections.sort(kateak);
		
		for(int i=0;i<kateak.size();i++) {
			System.out.println(kateak.get(i));
		}
	}

}
