package eb1;
import java.util.Scanner;

public class PR0209caserekin {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int nota;
		System.out.println("esan nota ");
		nota=teklatua.nextInt();
		switch (nota) {
		case 0:
		case 1: 
		case 2:System.out.println("oso gutxi");
		break;
		case 3:
		case 4:System.out.println("gutxi");
		break;
		case 5:System.out.println("nahiko");
		break;
		case 6:System.out.println("ondo");
		break;
		case 7:
		case 8:System.out.println("oso ondo");
		break;
		case 9:
		case 10:System.out.println("bikain");
		break;
		}teklatua.close();
	}
}
