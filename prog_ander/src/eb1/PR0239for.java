package eb1;
import java.util.Scanner;

public class PR0239for {
	public static void main(String[] args) {
		int znbk;
		String katea="";
		Scanner teklatua=new Scanner(System.in);
		System.out.println("hemaidazu zenbakia: ");
		znbk=teklatua.nextInt();
		for(int i=1;i<=znbk;i++) {
			katea=katea+i+",";
		}System.out.println("Zure zenbakira heltzeko behar izan diren zenbaki guztiak: "+katea);
		teklatua.close();
	}

}
