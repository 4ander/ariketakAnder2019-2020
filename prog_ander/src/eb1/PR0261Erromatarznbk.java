package eb1;
import java.util.Scanner;

public class PR0261Erromatarznbk {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		String katea="";
		//900 ZENBAKIAREKIN GAIZKI
		
		System.out.println("hemaidazu zenbaki bat 0-tik 999-ra: ");
		znbk=teklatua.nextInt();
		if(znbk>=500) {
			katea=katea+"D";
			znbk=znbk-500;
		}
		if (znbk>=100) {
			while (znbk>=100) {
				katea=katea+"C";
				znbk=znbk-100;
			}
		}
		if(znbk>=90) {
			znbk=znbk-90;
			katea=katea+"XC";
		}
		if(znbk>=50) {
			katea=katea+"L";
			znbk=znbk-50;
		}
		if(znbk>=40) {
			katea=katea+"XL";
			znbk=znbk-40;
		}
		if(znbk>=10) {
			while(znbk>=10) {
				katea=katea+"X";
				znbk=znbk-10;
			}
		}
		
		while(znbk!=0) {
			if(znbk>5) {
				znbk=znbk-5;
				katea=katea+"V";
			}else {
				katea=katea+"I";
				znbk--;		
			}
		}
		
		System.out.println("zure zenbakia erromatarrez "+katea+" da wapo");
		teklatua.close();
	}

}
