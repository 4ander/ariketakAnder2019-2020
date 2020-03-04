package eb3;

import java.io.*;
import java.util.Scanner;

public class FitxategiakAdib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner teklatua = new Scanner(System.in);
			int aukera;
			
			do {
				System.out.println("aukeratu eragiketa:\n 1. Irakurri.\n 2. Idatzi.\n 3. Irten.\n");
					aukera=teklatua.nextInt();
					
					switch (aukera) {
					case 1:
						try {
							File fitxategia = null;
							FileReader fr = null;
							BufferedReader br = null;
							fitxategia = new File("C:/Users/ik_1dw3/Desktop/pa borrar/proba.txt");	//kokapena aldatzen bada, ruta osoa jarri behar da
							fr = new FileReader (fitxategia);
							br = new BufferedReader(fr);
							
							String lerroa;
							while ((lerroa = br.readLine()) != null) {
							System.out.println(lerroa+"\n");
							}
							fr.close();
						} catch (FileNotFoundException fnfe) {
							//fitxategia ez badu ikusten
							System.out.println("Errorea irakurtzean. Fitxategia ezin da irakurri");
						} catch (IOException ioe) {
							ioe.printStackTrace();
						}
						break;
					case 2:
						try {
							FileWriter fw = null;
							PrintWriter pw = null;
							fw = new FileWriter ("C:/Users/ik_1dw3/Desktop/pa borrar/proba.txt");
							pw= new PrintWriter (fw);
							
							System.out.println("Sartu izena:");
								String izena = teklatua.next();
							pw.println(izena);
							System.out.println("Izena sartuta.\n");
							fw.close();
						} catch (FileNotFoundException fnfe) {
							//fitxategia ez badu ikusten
							System.out.println("Errorea irakurtzean. Fitxategia ezin da irakurri");
						} catch (IOException ioe) {
							System.out.println(ioe);
						}
						break;
					case 3:
						System.out.println("Irteten...");
						teklatua.close();
						break;
					}
			} while (aukera != 3);
	}

}

