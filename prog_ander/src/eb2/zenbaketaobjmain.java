package eb2;
import java.util.ArrayList;
import java.util.Scanner;

public class zenbaketaobjmain {
	static ArrayList<PR0501zenbaketaobj> obj=new ArrayList();

	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		System.out.println("zenbat objetu?: ");
		znbk=teklatua.nextInt();
		for(int i=0;i<=znbk-1;i++) {
			PR0501zenbaketaobj obj1=new PR0501zenbaketaobj();
			obj.add(obj1);
			obj.get(i).kopurua=i+1;
			
		}
		idatziZenbat();
	}
	private static void idatziZenbat() {
		System.out.println("objetu kopurua "+obj.get(obj.size()-1).kopurua+" da");
	}

}
