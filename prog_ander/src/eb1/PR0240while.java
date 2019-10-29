package eb1;
import java.util.Scanner;
public class PR0240while {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		int kont=1;
		String emaitza="";
		
		System.out.println("hemaidazu zenbakia: ");
		znbk=teklatua.nextInt();
		while (kont<=znbk) {
			if(kont%2==0) {
				emaitza=emaitza+kont+",";
			}
			kont++;
		}
		System.out.println("0-tik zure zenbakirarte "+emaitza+" zenbakiak bakoitiak dira");
		teklatua.close();
	}

}
