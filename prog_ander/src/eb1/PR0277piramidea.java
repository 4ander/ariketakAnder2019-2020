package eb1;
import java.util.Scanner;

public class PR0277piramidea {
	public static void main(String[] args) {
		int znbk;
		String katea="";
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("hemaidazu zenbaki bat: ");
		znbk=teklatua.nextInt();
		
		for (int i=1; i<=znbk;i++) {
			for(int h=1;h<=i;h++) {
				katea=katea+i;
			}katea=katea+"\n";
		}System.out.println(katea+"\t");
	}
}
