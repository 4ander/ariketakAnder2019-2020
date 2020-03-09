package probak;
import java.io.*;

public class probafitxategiak {
	public static void main (String[] args) throws IOException {
		File fitxategia=new File("fitxategiak/proba.txt");
		FileReader fr=new FileReader(fitxategia);
		BufferedReader br =new BufferedReader(fr);
		FileWriter fw = new FileWriter(fitxategia);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Kaixo mundua");
		pw.close();
		
		String lerroa;
		while ((lerroa=br.readLine())!=null){
			System.out.println(lerroa);
			}
		
	}

}
