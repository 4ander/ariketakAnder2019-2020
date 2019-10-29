package eb1;
import java.util.Scanner;

public class PR0235Menua {

	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		double znbk1;
		double znbk2;
		double emaitza;
		int aukera;
		
		System.out.println("Ongi etorri!, hemaidazu lehen zenbakia: ");
		znbk1=teklatua.nextDouble();
		System.out.println("hemaidazu bigarrena: ");
		znbk2= teklatua.nextDouble();
		System.out.println("hemen dituzu aukerak:");
		System.out.println("6.-batuketa");
		System.out.println("7.-kenketa");
		System.out.println("8.-biderketa");
		System.out.println("9.-zatiketa");
		System.out.println("10.-ondarra");
		System.out.println("1.-irten");
		aukera=teklatua.nextInt();
		
		switch (aukera) {
		case 6: emaitza=znbk1+znbk2;
		System.out.println(znbk1+" eta "+znbk2+" zenbakien arteko eragiketa "+emaitza+" da");
		break;
		case 7: emaitza=znbk1-znbk2;
		System.out.println(znbk1+" eta "+znbk2+" zenbakien arteko eragiketa "+emaitza+" da");
		break;
		case 8: emaitza=znbk1*znbk2;
		System.out.println(znbk1+" eta "+znbk2+" zenbakien arteko eragiketa "+emaitza+" da");
		break;
		case 9: emaitza=znbk1/znbk2;
		System.out.println(znbk1+" eta "+znbk2+" zenbakien arteko eragiketa "+emaitza+" da");
		break;
		case 10: emaitza=znbk1%znbk2;
		System.out.println(znbk1+" eta "+znbk2+" zenbakien arteko eragiketa "+emaitza+" da");
		break;
		case 1: teklatua.close();
		break;
		default: System.out.println("opzio hori ez dago");
		break;
		}teklatua.close();
	}
}
