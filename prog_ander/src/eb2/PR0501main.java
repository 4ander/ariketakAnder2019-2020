package eb2;
import java.util.Scanner;
import java.util.ArrayList;
/*zenbat aldagaia Static moduan dagoenez, objetu guztiek ikuz dezakete, beraz, 
 * aldagaia objetu batetan aldatzen den bakoitzean, guztietan aldatuko da*/


public class PR0501main {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		ArrayList<PR0501ONDO>kont=new ArrayList();
		int zenbatobj=0;
		String aukera;
		System.out.println("objetu berri bat?");
		aukera=teklatua.next();
		
		
		for(int i=0;!aukera.equals("ez");i++) {
			PR0501ONDO z1=new PR0501ONDO();
			kont.add(i,z1);
			System.out.println("esan objetuaren izena: ");
			kont.get(i).izena=teklatua.next();
			System.out.println("esan zenbat elementu dauden");
			kont.get(i).kopurua=teklatua.nextInt();
			kont.get(i).zenbat=z1.zenbat+1;
			System.out.println("objetu berri bat?");
			aukera=teklatua.next();
		}
		
		
		System.out.println(kont.get(0).zenbat+" objetu sortu dira ");
		for(int w=0;w<kont.size();w++) {
			System.out.println(kont.get(w).kopurua+" "+kont.get(w).izena+" daude");
		}
		System.out.println("objeturen bat modifikatu? ");
		aukera=teklatua.next();
		while(!aukera.equals("ez")) {
			System.out.println("1, gehitzeko");
			System.out.println("2, kentzeko");
			System.out.println("3, aldaketa zuzenean egiteko");
			String aukeratu=teklatua.next();
			
			
			switch(aukeratu) {
				1:
					
			}
		}
		
		
		
	}
	public void gehitu() {
		
	}
	public void kendu() {
		
	}
	public void aldatu() {
		
	}
	public void bilatu() {
		Scanner teklatua=new Scanner(System.in);
		System.out.println("zein objetu?: ");
		String aurkitzeko=teklatua.next();
		
		for(static int x=0;x<)
	}

}
