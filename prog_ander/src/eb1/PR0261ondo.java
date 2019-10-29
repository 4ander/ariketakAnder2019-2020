package eb1;
import java.util.Scanner;

public class PR0261ondo {
	public static void main(String[] args) {
		int znbk=0;
		String erroma="";
		int znbk2=0;
		int kont;
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("hemaidazu zenbaki bat 0-tik 999-ra: ");
		znbk=teklatua.nextInt();
		
		if(znbk>=10) {
			if(znbk>=100) {
				kont=3;
			}else {
				kont=2;
			}
		}else {
			kont=1;
		}
		while(kont>0) {
			if(kont!=1) {
				if(kont!=2){
					String bat="C";
					String bost="D";
					String hamar="M";
				}else {
					String bat="X";
					String bost="L";
					String hamar="C";
				}
			}else {
				String bat="I";
				String bost="V";
				String hamar="X";
			}
			znbk2=znbk/10^kont-1;
			
			if(znbk2!=9) {
				if(znbk2<=5) {
					
				}
			}
		}
	}

}
