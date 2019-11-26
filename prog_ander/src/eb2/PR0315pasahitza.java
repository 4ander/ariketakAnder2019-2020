package eb2;
import java.util.Scanner;
/*iturburu-kode honek erabiltzaie eta pasahitz batzuk eskatuko ditu eta ondo badaude mezu bat aterako du*/

public class PR0315pasahitza {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		String[]erabiltzaileak= {"Arkaitz","Ander","Kaiet","Eneko","Oihane","Unai","Sergio","Markel","David","Aritz"};
		String[]pasahitzak= {"Arkaitz","Ander","Kaiet","Eneko","Oihane","Unai","Sergio","Markel","David","Aritz"};

		String id;
		String pass;
		boolean aurkitzeko=true;
		System.out.println("hemaidazu izena: ");
		id=teklatua.next();
		System.out.println("heman pasahitza: ");
		pass=teklatua.next();
		int aukerak=3;
		
		while(aukerak!=0&aurkitzeko==true) {
		for(int i=0;i<erabiltzaileak.length;i++) {
		if(id.equals(erabiltzaileak[i])) {
			if(pass.equals(pasahitzak[i])){
				System.out.println("sar zaitezke");
				aurkitzeko=false;
			}
			}
		}if(aurkitzeko==true&aukerak!=1) {
			aukerak--;
			System.out.println("errorea erabiltzaile edo pasahitzean, beste "+aukerak+" aukera dituzu sartzeko...");
			System.out.println("hemaidazu izena: ");
			id=teklatua.next();
			System.out.println("heman pasahitza: ");
			pass=teklatua.next();
		}
	}

}
}
