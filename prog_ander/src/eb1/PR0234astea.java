package eb1;
import java.util.Scanner;

public class PR0234astea {

	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		String eguna;
		System.out.println("esan lehen bi letrak: ");
		eguna=teklatua.next();
		
		switch(eguna) {
		case "AL": System.out.println("Astelehena");
		break;
		case "AA": System.out.println("Asteartea");
		break;
		case "AZ": System.out.println("Asteazkena");
		break;
		case "OG": System.out.println("osteguna");
		break;
		case "OL": System.out.println("Ostirala");
		break;
		case "LA": System.out.println("Larunbata");
		break;
		case "IG": System.out.println("Igandea");
		break;
		default:System.out.println("Errorea");
		}
		teklatua.close();
	}
}
