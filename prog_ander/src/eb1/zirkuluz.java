package eb1;
import java.util.Scanner;

public class zirkuluz {
	
	public static void main(String[]args) {
		double perimetroa=0;
		double erradioa=0;
		double pi=3.1415;
		Scanner teklatua=new Scanner(System.in);
		
		System.out.println("programa honek zirkuluaren perimetroa aterako du");
		System.out.println("sartu erradioa: ");
		erradioa=teklatua.nextDouble();
		perimetroa=erradioa*pi*2;
		System.out.println(perimetroa);
		teklatua.close();
	}

}
