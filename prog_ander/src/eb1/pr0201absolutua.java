package eb1;
import java.util.Scanner;

public class pr0201absolutua {

	public static void main(String[] args) {
		int znbk;
		int znbk1;
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("hemaidazu zenbaki bat ");
		znbk=teklatua.nextInt();
		if (znbk<0) {
			znbk1=znbk*-1;
			System.out.println(znbk+" zenbakiaren zenbaki absolutua "+znbk1+" da");
		}else {
			znbk1=znbk;
			System.out.println(znbk+" zenbakiaren zenbaki absolutua "+znbk1+" da");
		}
		teklatua.close();
	}
	
}
