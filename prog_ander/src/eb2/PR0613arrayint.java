package eb2;
import java.util.Scanner;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

public class PR0613arrayint {
	public static int aukera;
	public static int znbk;
	public static ArrayList <Integer> zenbakiak=new ArrayList<Integer>();
	public static boolean aurkitua=false;
	public static int posizioa=-1;
	public static Scanner teklatua=new Scanner(System.in);




	public static void main(String[] args) {
		
		while(aukera!=5) {
		aukeratu();
		System.out.println(aukera);
		switch(aukera) {
		case 1:
			znbkeskatu();
			zenbakiak.add(znbk);
			break;
		case 2:
			znbkeskatu();
			znbkbilatu();
			if(aurkitua==true) {
				System.out.println(" zure zenbakia "+(posizioa+1)+" posizioan dago");
			}
			else {
				System.out.println("zure zenbakia ez dago");
			}
			break;
		case 3:
			znbkeskatu();
			znbkbilatu();
			if(aurkitua==true) {
				zenbakiak.remove(zenbakiak.get(posizioa));
			}
			else {
				System.out.println("zure zenbakia ez da aurkitu");
			}
			break;
		case 4:
			zerrenda_o_a();
			break;
		case 5:
			System.out.println("aguuuur!");
			teklatua.close();
			break;
		}
	}
		
}
	
	
	
	
	
	
	
	
	
	
	public static int aukeratu() {
		Scanner teklatua=new Scanner(System.in);

		System.out.println("esan egin nahi duzuna");
		System.out.println("1.-zenbaki bat sartu");
		System.out.println("2.- zenbaki bat bilatu");
		System.out.println("3.-zenbaki bat ezabatu");
		System.out.println("4.-aurkeztu zenbaki guztiak txikitik handira");
		System.out.println("5.-irten");
		aukera=teklatua.nextInt();
		
		return aukera;
	}
	
	public static int znbkeskatu() {
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("zenbakia: ");
		znbk=teklatua.nextInt();
		return znbk;
	}
	
	public static int znbkbilatu() {
		
		
		for(int i=0;i<zenbakiak.size()-1;i++) {
			if(znbk==zenbakiak.get(i)) {
				posizioa=i;
				aurkitua=true;
			}
		}
		return posizioa;
				
		
	}
	
	public static void zerrenda_o_a() {
		Collections.sort(zenbakiak);
		
		for (int w=0;w<zenbakiak.size()-1;w++) {
			System.out.println(zenbakiak.get(w));
		}
	}

}
