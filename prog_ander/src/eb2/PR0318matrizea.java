package eb2;
import java.util.Scanner;
/*iturburu-kode honek 12 zenbaki eskatuko dizkio erabiltzaileari, eta gero zenbakiak ordenatuko ditu*/

public class PR0318matrizea {
	public static void main(String[] args) {
		int znbk;
		/*3 dimentzioko array bat sortzen da*/
		int[][][]matrizea=new int[5][5][5];
		Scanner teklatua=new Scanner(System.in);
		int kont=0;
		int kont2=1;
		
		/*arraiaren lehen dimentzioan lehen 4 zenbakiak sartzen dira, [1][0][0]-tik hasi behar da, ezin da [0][0][0] erabili*/
		while(kont<4) {
		System.out.println(kont+" = ");
		znbk=teklatua.nextInt();
		matrizea[kont2][0][0]=znbk;
		kont2++;
		kont++;
		}
		kont2=1;//zenbatzailea "1" zenbakian jartzen da berriro, horrela 1- etik 4-ra zenbatzeko berriz
		/*arrayaren bigarren dimentzioan hurrengo 4 zenbakiak sartzen dira, [0][1][0]-tik hasita*/
		while(kont<8) {
		System.out.println(kont+" = ");
		znbk=teklatua.nextInt();
		matrizea[0][kont2][0]=znbk;
		kont2++;
		kont++;	
		}
		kont2=1;
		/*arrayaren hirugarren dimentzioan hurrengo 4 zenbakiak sartzen dira, [0][0][1]-etik hasita*/
		while(kont<12) {
		System.out.println(kont+" = ");
		znbk=teklatua.nextInt();
		matrizea[0][0][kont2]=znbk;
		kont2++;
		kont++;
		}
		/*matrizea lerroka ateratzen du, lau lerro dira eta lerro bakoitzean 3 bloke daude*/
		System.out.println(matrizea[1][0][0]+"----"+matrizea[0][1][0]+"----"+matrizea[0][0][1]);
		System.out.println(matrizea[2][0][0]+"----"+matrizea[0][2][0]+"----"+matrizea[0][0][2]);
		System.out.println(matrizea[3][0][0]+"----"+matrizea[0][3][0]+"----"+matrizea[0][0][3]);
		System.out.println(matrizea[4][0][0]+"----"+matrizea[0][4][0]+"----"+matrizea[0][0][4]);



	}
	

}
