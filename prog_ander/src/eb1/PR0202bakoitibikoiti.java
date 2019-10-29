package eb1;
import java.util.Scanner;

public class PR0202bakoitibikoiti {

	public static void main(String[] args) {
		int znbk;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("hemaidazu zenbaki bat ");
		znbk=teklatua.nextInt();
		if(znbk%2==0) {
			System.out.println(znbk+" zenbakia bikoitia da");
		}else {
			System.out.println(znbk+" zenbakia bakoitia da");
		}
		teklatua.close();
		
	}
}
