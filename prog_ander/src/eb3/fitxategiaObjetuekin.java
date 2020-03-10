package eb3;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class fitxategiaObjetuekin {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException{
		Scanner teklatua=new Scanner(System.in);
		int aukera;
		
		ArrayList<frutak> ALF=new ArrayList<frutak>();
		
		String sagarrabitaminak[] = {"B2","A4"};
		/*frutak sagarra=new frutak("Sagarra",0.15,"berdea", sagarrabitaminak);
		frutak laranja=new frutak("laranja",0.12,"laranja",sagarrabitaminak);
		frutak platanoa=new frutak("platanoa",0.30,"oria",sagarrabitaminak);
		frutak mandarina=new frutak("mandarina",0.09,"laranja",sagarrabitaminak);
		
		ALF.add(sagarra);
		ALF.add(laranja);
		ALF.add(platanoa);
		ALF.add(mandarina);*/
		
		try {
			File fitxategia=new File("C:\\Users\\ik_1dw3\\Desktop\\borra\\prog_ander\\fitxategiak\\frutak.dat");
			FileInputStream fis=new FileInputStream(fitxategia);
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			try {
				ALF=(ArrayList<frutak>)ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		System.out.println("aukeratu:\n 1.-Fruta kopurua irakurri \n 2.- fruta berri bat sartu \n 3.- fruta bat ezabatu \n 4.-gorde eta irten: ");
		aukera=teklatua.nextInt();
		
		while(aukera!=4) {
		if(aukera==1) {
			for(int i=0; i<ALF.size();i++){
				System.out.println(ALF.get(i).getIzena());
			}
			}
		if(aukera==2) {
			System.out.println("izena: ");
			String izena=teklatua.next();
			System.out.println("altuera: ");
			double altuera=teklatua.nextDouble();
			System.out.println("kolorea: ");
			String kolorea=teklatua.next();
			
			frutak f1=new frutak(izena, altuera, kolorea, sagarrabitaminak);
			ALF.add(f1);
			
			}
		if(aukera==3) {
			System.out.println("ezabatu nahi duzunaren posizioa esan");
			for(int i=0; i<ALF.size();i++){
				System.out.println(ALF.get(i).getIzena());
			}
			int aukera2=teklatua.nextInt();
			ALF.remove(aukera2);
			}
		System.out.println("aukeratu:\n 1.-Fruta kopurua irakurri \n 2.- fruta berri bat sartu \n 3.- fruta bat ezabatu \n 4.-gorde eta irten: ");
		aukera=teklatua.nextInt();

		}
		
		try {
			File fitxategia=new File("C:\\Users\\ik_1dw3\\Desktop\\borra\\prog_ander\\fitxategiak\\frutak.dat");
			BufferedWriter bw=new BufferedWriter(new FileWriter(fitxategia));
			FileOutputStream fos=new FileOutputStream(fitxategia);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ALF);
			oos.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		



	}

}
