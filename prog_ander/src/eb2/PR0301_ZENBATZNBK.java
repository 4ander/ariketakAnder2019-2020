package eb2;
import java.lang.reflect.Array;
import java.util.Scanner;
//programa honek zenbaki bat eskatuko du 1 etik 5 era, 0 sartzean zenbaki bakoitza idatzi den kopurua hemango ditu
public class PR0301_ZENBATZNBK {
	 
	
public static void main(String[] args) {
	 int znbk;
	 int zerrenda[]=new int[5];
	boolean aurkitua=false;
	
	Scanner teklatua=new Scanner(System.in);
	
	System.out.println("hemaidazu zenbaki bat, 0 sartzean zerrenda osoa agertuko da: ");
	znbk=teklatua.nextInt();
	while (znbk!=0) {
		for(int i=0;i<=zerrenda.length-1; i++) {
			
			if(znbk-1==i) {
				zerrenda[i]++;
				System.out.println("hemaidazu zebaki bat: ");
				znbk=teklatua.nextInt();
			}
			
		}
		
	}
	for(int w=0;w<zerrenda.length;w++) {
		System.out.println(zerrenda[w]);
	}
}
}
