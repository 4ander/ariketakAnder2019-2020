package eb1;
import java.util.Scanner;

public class PR0209notak {

	public static void main(String[] args) {
		double nota;
		String nota1="";
		Scanner teklatua=new Scanner (System.in);
		System.out.println("hemaidazu zure nota ");
		nota=teklatua.nextDouble();
		
		if (nota>=3) {
			if(nota >=5) {
				if(nota>=6) {
					if (nota>=7) {
						if(nota>=9) {
							nota1="zure nota bikain da";
						}else {
							nota1="zure nota oso ondo da";
						}
					}else {
						nota1="zure nota ondo da";
					}
				}else {
					nota1="zure nota nahiko da";
				}
			}else {
				nota1="zure nota gutxi da";
			}
		}else {
			nota1="zure nota oso gutxi da";
		}System.out.println(nota1);
		teklatua.close();
	}
}
