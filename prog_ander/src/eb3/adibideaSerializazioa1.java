package eb3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class adibideaSerializazioa1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		//lotura egingo dut
		try {
		FileOutputStream fos=new FileOutputStream ("konplexuak.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		serializPertsona k=new serializPertsona("Kepa","Etxebarria","Artetxe");
		
		//idatzi fitxategian
		oos.writeObject(k);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
		FileInputStream fis=new FileInputStream ("konplexuak.dat");
		ObjectInputStream ois=new ObjectInputStream (fis);
		//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
		serializPertsona k=(serializPertsona)ois.readObject();
		System.out.println(k.toString());
		ois.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		
	
	}
}
