package eb3;
import java.io.*;
import java.util.Scanner;

public class PR0904kopiafitxategiak {
	public static void main(String[] args) throws IOException {
		String fitx1;
		String fitx2;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Zein kopiatu nahi duzu?: ");
		fitx1=teklatua.next();
		File fitxategiOriginala=new File("fitxategiak/"+fitx1);
		System.out.println("Zein fitxategitan?: ");
		fitx2=teklatua.next();
		File fitxategiKopia=new File("fitxategiak/"+fitx2);
		FileWriter fw=new FileWriter(fitxategiKopia);
		FileReader fr=new FileReader(fitxategiOriginala);
		FileReader fr2=new FileReader(fitxategiKopia);
		BufferedReader br=new BufferedReader(fr);
		BufferedReader br2=new BufferedReader(fr2);
		PrintWriter pw=new PrintWriter(fitxategiKopia);
		String lerroa;
		
		while((lerroa=br.readLine())!=null) {
			pw.println(lerroa);
			
		}
		fw.close();
		br.close();
		fr.close();
		pw.close();
	}

}
