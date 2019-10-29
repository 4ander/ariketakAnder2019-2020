package eb1;
import java.util.Scanner;
public class PR0203BEZa {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		double prezioa;
		double emaitza;
		System.out.println("esaidazu prezioa");
		prezioa=teklatua.nextDouble();
		if(prezioa>2000) {
			emaitza=prezioa*1.16;
		}else {
			emaitza=prezioa*1.07;
		}
		System.out.println(prezioa+" prezioa+BEZa "+emaitza+" hematen du");
	}

}
