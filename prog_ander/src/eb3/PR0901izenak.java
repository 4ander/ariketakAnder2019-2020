package eb3;
import java.io.*;
import java.util.Scanner;

public class PR0901izenak {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		Scanner teklatua=new Scanner(System.in);
		String izena;
		File fitxategia=null;
		FileReader fr=null;
		BufferedReader br=null;
		fitxategia=new File("fitxategiak/PR0901.txt");
		fr=new FileReader(fitxategia);
		br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(fitxategia);
		PrintWriter pw=new PrintWriter(fitxategia);
		
		System.out.println("hemaidazu izen bat, 1 sartzen bada programa amaituko da: ");
		izena=teklatua.next();
		
		while(!izena.equals("1")) {
			pw.println(izena);
			System.out.println("Beste bat: ");
			izena=teklatua.next();
		}
		pw.close();
		fw.close();
		String lerroa;
		while ((lerroa=br.readLine())!=null) {
			System.out.println(lerroa);
		}
		/*String lerroa;
		while ((lerroa=br.readLine())!=null){
			System.out.println(lerroa);
			}*/
		
		
	}

}
