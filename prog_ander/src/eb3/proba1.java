package eb3;
import java.io.*;
import java.util.Scanner;
/*3 txt, batetan izena+#+abizena, beste batetan izena+#+adina eta hirugarrena guk sortua, izena, adina eta abizena izan behar ditu*/

public class proba1 {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		
		File fitxategiairakurri=null;
		FileReader fr=null;
		BufferedReader br =null;
		fitxategiairakurri=new File("C:/Users/ik_1dw3/Desktop/pa borrar/proba.txt");
		System.out.println("esan egin nahi duzuna:  1.-irakurri dagoena  2.-Idatzi izen berri bat  3.-irten");
		int aukera=teklatua.nextInt();
		
		if(aukera==1) {
			
			fitxategiairakurri=new File("C:/Users/ik_1dw3/Desktop/pa borrar/proba.txt");
			try {
				fr=new FileReader (fitxategiairakurri);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br=new BufferedReader(fr);
			String lerroa=null;
			try {
				while ((lerroa=br.readLine())!=null){
				System.out.println(lerroa);
				
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(aukera==2) {
			
			fitxategiairakurri=new File("C:/Users/ik_1dw3/Desktop/pa borrar/proba.txt");
			try {
				fr=new FileReader (fitxategiairakurri);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br=new BufferedReader(fr);
			
			FileWriter fitxategiaidatzi = null;
			PrintWriter pw = null;
			try {
				fitxategiaidatzi = new FileWriter (fitxategiairakurri, true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw= new PrintWriter (fitxategiaidatzi);
			System.out.println("idatzi hitza: ");
			String hitza=teklatua.next();
			pw.println(hitza);
			String lerroa=null;
			try {
				while ((lerroa=br.readLine())!=null){
				System.out.println(lerroa);
				
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
			

		}
		
	}
}


