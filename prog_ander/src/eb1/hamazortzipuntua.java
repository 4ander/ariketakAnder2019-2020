package eb1;
import java.util.Scanner;
public class hamazortzipuntua {

	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		System.out.println("emaidazu zenbaki oso bat");
		double znbkosoa=teklatua.nextDouble();
		System.out.println("zure zenbaki osoa "+znbkosoa+" da");
		System.out.println("heman zenbaki erreal bat: ");
		int znbkerreala=teklatua.nextInt();
		System.out.println("zure zenbaki erreala "+znbkerreala+" da");
		System.out.println("heman karaktere bat: ");
		char c = teklatua.next().charAt(0);
		System.out.println("zure karakterea "+c+" da");
		System.out.println("heman kate bat: ");
		String katea=teklatua.next();
		System.out.println("zure katea "+katea+" da");
		System.out.println("aguuuuuuuuuur!");
		teklatua.close();
	}

}
