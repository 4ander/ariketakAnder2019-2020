package eb2;
import java.util.Scanner;
import java.util.ArrayList;
/*zenbat aldagaia Static moduan dagoenez, objetu guztiek ikuz dezakete, beraz, 
 * aldagaia objetu batetan aldatzen den bakoitzean, guztietan aldatuko da*/


public class PR0501main {
	static ArrayList<PR0501ONDO>kont=new ArrayList();
	static Scanner teklatua=new Scanner(System.in);
	static String iz;
	static boolean izenakerr=false;
	static int i;



	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int zenbatobj=0;
		String aukera="bai";
		
		
		
		
	
		while(!aukera.equals("ez")) {
			System.out.println("1, gehitzeko");
			System.out.println("2, kentzeko");
			System.out.println("3, aldaketa zuzenean egiteko");
			System.out.println("4, dena ikusteko");
			String aukeratu=teklatua.next();
			
			
			switch(aukeratu) {
			case "1":
					gehitu();
					break;
			case "2":
					kendu();
					break;
			case "3":
					aldatu();
					break;
			case "4":
				erakutsi();
				aukera="ez";
				break;
			}
			
		}
		
		
		
	}
	public static void gehitu() {
		System.out.println("esan izena: ");
		String ize=teklatua.next();
		String ize1=ize;
		iz=ize1;
		System.out.println("esan kopurua: ");
		int kop=teklatua.nextInt();
		bilatu();
		
		
		if(izenakerr==true) {
			System.out.println("izena errepikatu duzu, ez da objetua sortuko");
		}
		else {
			PR0501ONDO p1=new PR0501ONDO();
			p1.izena=ize;
			p1.kopurua=kop;
			p1.zenbat=p1.zenbat+1;
			kont.add(p1);
		}
	}
	public static void kendu() {
		System.out.println("Esan ezabatu nahi duzun objetuaren izena");
		iz=teklatua.next();
		bilatu();
		kont.remove(i);
		kont.get(0).zenbat=kont.get(0).zenbat-1;
	}
	public static void aldatu() {
		System.out.println("zein aldatu nahi duzu? ");
		iz=teklatua.next();
		bilatu();
		if(izenakerr==true) {
			System.out.println("esan izen berria: ");
			String izenberria=teklatua.next();
			System.out.println("kantitate berria: ");
			int kantberria=teklatua.nextInt();
			kont.get(i).izena=izenberria;
			kont.get(i).kopurua=kantberria;
		}
		
	}
	public static void bilatu() {
		for(i=0;i<kont.size();i++) {
			if(kont.get(i).izena.equals(iz)) {
				izenakerr=true;
				break;
			}
		}
	}
	public static void erakutsi() {
		for(int i=0;i<kont.size();i++) {
			System.out.println(kont.get(i).izena+" objetuak "+kont.get(i).kopurua+" elementu ditu");
		}
	}

}
