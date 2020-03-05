package eb3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class PR0911SerializablePertsonak  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<serializPertsona>ALP=new ArrayList();

		
		FileOutputStream fos=new FileOutputStream ("ariketa.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		FileInputStream fis=new FileInputStream ("ariketa.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		serializPertsona P1=new serializPertsona("Ander","Gomez","Zabala");
		serializPertsona P2=new serializPertsona("Arkaitz","Garcia","Otero");
		serializPertsona P3=new serializPertsona("Eneko","Garcia","Vilamor");
		serializPertsona P4=new serializPertsona("Sergio","Cortes","niidea");
		serializPertsona P5=new serializPertsona("Kaiet","Ortiz","de Zarate");
		
		ALP.add(P1);
		ALP.add(P2);
		ALP.add(P3);
		ALP.add(P4);
		ALP.add(P5);
		
		oos.writeObject(ALP);
		ArrayList<serializPertsona>ALP2=new ArrayList();
		ALP2=(ArrayList<serializPertsona>)ois.readObject();
		 
		
		for(int i=0;i<ALP2.size();i++) {
			System.out.println(ALP2.get(i));
		}
		fos.close();
		fis.close();
		oos.close();
		ois.close();


	}

}
