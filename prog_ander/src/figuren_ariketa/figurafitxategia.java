package figuren_ariketa;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class figurafitxategia {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner teklatua=new Scanner(System.in);
		ArrayList<figurak> ALF=new ArrayList<figurak>();
		File fitxategia=new File("fitxategiak/figurak.dat");

 		try {
 			FileInputStream fis=new FileInputStream(fitxategia);
 			ObjectInputStream ois=new ObjectInputStream(fis);
 			ALF=(ArrayList<figurak>)ois.readObject();
 		}
 		catch(IOException e) {
 			e.printStackTrace();
 		}
		

		
		/*zirkulua Z1=new zirkulua("zirkulua", 12, 12, 6);
		laukia L1=new laukia("laukia", 15, 15);
		triangelua T1=new triangelua("tiangelua", 12, 8, 5, 5, 10);
		
		ALF.add(Z1);
		ALF.add(L1);
		ALF.add(T1);*/
		
		
		System.out.println("ongi etorri, esan egin nahi duzuna: \n 1.-Zerrenda ikusi \n 2.-Figura berri bat sartu \n 3.-Figura baten perimetroa kalkulatu \n 4.- figura baten azalera kalkulatu \n 5.- irten");
		int aukera=teklatua.nextInt();
		
		while(aukera!=5) {
			if(aukera==1) {
				for(int i=0; i<ALF.size();i++) {
					System.out.println(ALF.get(i).getmota());
				}
			}
			if(aukera==2) {
				
			}
			if(aukera==3) {
				System.out.println("Esan figuraren posizioa eta perimetroa kalkulatuko da: ");
				for(int i=0; i<ALF.size();i++) {
					System.out.println(ALF.get(i).getmota());
				}
				int figaukera=teklatua.nextInt();
				System.out.println(ALF.get(figaukera).azalera());
				
				
			}
			if(aukera==4) {
				System.out.println("Esan figuraren posizioa eta perimetroa kalkulatuko da: ");
				for(int i=0; i<ALF.size();i++) {
					System.out.println(ALF.get(i).getmota());
				}
				int figaukera=teklatua.nextInt();
				System.out.println(ALF.get(figaukera).perimetroa());
				
			}
			System.out.println("esan egin nahi duzuna: \n 1.-Zerrenda ikusi \n 2.-Figura berri bat sartu \n 3.-Figura baten perimetroa kalkulatu \n 4.- figura baten azalera kalkulatu \n 5.- irten");
			aukera=teklatua.nextInt();
			
		}
		BufferedWriter bw=new BufferedWriter(new FileWriter(fitxategia));
		FileOutputStream fos=new FileOutputStream(fitxategia);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ALF);
	}

}
