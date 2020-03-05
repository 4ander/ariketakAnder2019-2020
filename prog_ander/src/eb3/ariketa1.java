package eb3;
import java.io.*;
import java.util.Scanner;
public class ariketa1 {
	/*funciona pero no guarda el resultau en el fichero*/

	public static void main(String[] args) {
		File fitxategiaIzenak;
		File fitxategiaAdinak;
		File fitxategiaOsorik;
		FileReader fr;
		BufferedReader br;
		Scanner teklatua=new Scanner(System.in);
		
		fitxategiaIzenak=new File("C:/Users/ik_1dw3/Desktop/pa borrar/ariketa1izenak.txt");
		fitxategiaAdinak=new File("C:/Users/ik_1dw3/Desktop/pa borrar/ariketa1Adinak.txt");
		fitxategiaOsorik=new File("C:/Users/ik_1dw3/Desktop/pa borrar/ariketa1izenak_eta_adinak.txt");
		
		System.out.println("Esan noren datuak nahi dituzun: ");
		String izena=teklatua.next();
		
		try {
			String emaitza=null;
			fr=new FileReader(fitxategiaIzenak);
			br=new BufferedReader(fr);
			
			String lerroa;
			while ((lerroa = br.readLine()) != null) {
				String[]parteak=lerroa.split("#");
				if(parteak[0].equals(izena)) {
					emaitza=parteak[0]+"#"+parteak[1];
				}
				
		}
			
			fr=new FileReader(fitxategiaAdinak);
			br=new BufferedReader(fr);
			lerroa="";
			while ((lerroa = br.readLine()) != null) {
			String[]parteak1=lerroa.split("#");
			if(izena.equals(parteak1[0])) {
			emaitza=emaitza+"#"+parteak1[1];
			}
		}
			FileWriter fw=new FileWriter(fitxategiaOsorik);
			PrintWriter pw=new PrintWriter(fw);
			pw.print(emaitza);
			System.out.println(emaitza);
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}
