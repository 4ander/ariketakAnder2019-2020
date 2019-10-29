package eb1;
import java.util.Scanner;

public class PR0239dowhile {

	public static void main(String[] args) {
		int bat=1;
		int znbk;
		String katea="";
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("hemaidazu zenbakia: ");
		znbk=teklatua.nextInt();
		do {
			katea=katea+bat+",";
			bat++;
		}while (bat<=znbk);
		System.out.println("Zure zenbakira heltzeko behar diren zenbaki guztiak:"+katea);
	}
}
