package eb2;
import java.util.Scanner;

/*Iturburu-kode honek 20 hitz gordetzen ditu eta  alfabetikoki ordenatuta ateratzen ditu */
public class PR0328hiztegi {

	public static void main(String[] args) {
		String hiztegia[]=new String[5];
		String katea;
		Scanner teklatua=new Scanner(System.in);
		boolean aldaketa_gabe=true;
		
		/*kateak array barruan sartzen*/
		for(int i=0;i<hiztegia.length;i++) {
			System.out.println("hemaidazu kate bat: ");
			katea=teklatua.next();	
			hiztegia[i]=katea;
		}
		/*bukle honek hiztegia azken hitzetik lenengora konparatzen du besteekin, ordenatzeko*/
		do {
		for(int d=hiztegia.length-1;d!=0;d--) {
			for(int hitz=0;hitz<hiztegia.length-1&hitz!=d;hitz++) {
				if(hiztegia[d].compareTo(hiztegia[hitz])<0) {
					aldaketa_gabe=false;
					String aldatzeko=hiztegia[d];
					for(int y=d--;d<=hitz;d--) {
						hiztegia[d]=hiztegia[y];
					}
					hiztegia[hitz]=aldatzeko;
				}
			}
		}
		}
		while(aldaketa_gabe=true);
		/*kateak erakusten*/
		for(int w=0;w<hiztegia.length;w++) {
			System.out.println(hiztegia[w]);
		}
	
}
}

