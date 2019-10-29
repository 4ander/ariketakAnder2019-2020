package eb1;
import java.util.Scanner;
public class PR0239zenbakiakgehitu {

	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		int bat=1;
		String katea = "";
		
		System.out.println("hemaidazu zenbakia:");
		znbk=teklatua.nextInt();
		while(znbk>=bat) {
			katea=katea+bat+",";
			bat++;
		}
		System.out.println("zure zenbakira heltzeko behar diren zenbakiak: "+katea);
		teklatua.close();
	}
}
