package eb1;
import java.util.Scanner;
public class PR0240FOR {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		int znbk;
		String emaitza="";
		
		System.out.println("hemaidazu zenbakia: ");
		znbk=teklatua.nextInt();
		
		for(int i=1;i<=znbk;i++) {
			if(i%2==0) {
				emaitza=emaitza+i+",";
			}
		}
		
		System.out.println("0-tik zure zenbakirarte "+emaitza+" zenbakiak bakoitiak dira");
		teklatua.close();
}
}
