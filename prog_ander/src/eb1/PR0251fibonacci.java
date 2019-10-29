package eb1;
import java.util.Scanner;

public class PR0251fibonacci {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		int zenb1=0;
		int zenb2=1;
		int gorde;
		int emaitza;
		int emaitzaFinala=0;
		
		System.out.println("hemaidazu zenbaki bat: ");
		znbk=teklatua.nextInt();
		
		for (int i=0;i<znbk;i++) {
			emaitza=zenb1+zenb2;
			gorde=zenb2;
			zenb2=zenb1+zenb2;
			zenb1=gorde;
			emaitzaFinala=emaitzaFinala+emaitza;
		}
		System.out.println("zure zenbakiaren fibonaccia hau da: "+emaitzaFinala);
		teklatua.close();
	}

}
