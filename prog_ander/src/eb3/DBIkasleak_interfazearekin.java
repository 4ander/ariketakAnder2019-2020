package eb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBIkasleak_interfazearekin {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner(System.in);
		try{
			Connection konexioa =
			DriverManager.getConnection("jdbc:mysql://localhost/ikasleak", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");
			Statement st = konexioa.createStatement();
			System.out.println("Aukeratu bat:\n 1.-ikasle guztiak ikusi\n 2.-ikasle baten datuak aldatu\n 3.-Ikasle bat ezabatu\n 4.-Ikasle berri baten datuak sartu\n 5.-irten");
			int aukera=teklatua.nextInt();
			
			while(aukera!=5) {
			switch(aukera) {
				case 1:
					ResultSet rs=st.executeQuery("select * from ikasleak2");
					while (rs.next()){
						System.out.println("Nan: " + rs.getObject("nan") + ", Izena: " +
						rs.getObject("izena") + ", Abizena: " + rs.getObject("abizenak") + ", Taldea: " +
						rs.getObject("taldea"));
						}
						// ResultSet itxi
						rs.close();
						System.out.println("Aukeratu bat:\n 1.-ikasle guztiak ikusi\n 2.-ikasle baten datuak aldatu\n 3.-Ikasle bat ezabatu\n 4.-Ikasle berri baten datuak sartu\n 5.-irten");
						aukera=teklatua.nextInt();
					break;
				case 2:
					rs=st.executeQuery("select * from ikasleak2");
					while (rs.next()){
						System.out.println("Nan: " + rs.getObject("nan") + ", Izena: " +
						rs.getObject("izena") + ", Abizena: " + rs.getObject("abizenak") + ", Taldea: " +
						rs.getObject("taldea"));
						}
					System.out.println("Esan aldatu nahi duzun ikaslearen izena: ");
					String aldatuikasle=teklatua.next();
					System.out.println("nana: ");
					String nanberria=teklatua.next();
					System.out.println("izena: ");
					String izenberria=teklatua.next();
					System.out.println("abizena: ");
					String abizenberria=teklatua.next();
					System.out.println("taldea: ");
					String taldeberria=teklatua.next();
					
					st.execute("UPDATE  ikasleak2 set nan='"+nanberria+"', izena='"+izenberria+"', abizenak='"+abizenberria+"', taldea='"+taldeberria+"'where izena='"+aldatuikasle+"'");
						// ResultSet itxi
						rs.close();
						
						System.out.println("Aukeratu bat:\n 1.-ikasle guztiak ikusi\n 2.-ikasle baten datuak aldatu\n 3.-Ikasle bat ezabatu\n 4.-Ikasle berri baten datuak sartu\n 5.-irten");
						aukera=teklatua.nextInt();
					break;
				case 3:
					rs=st.executeQuery("select * from ikasleak2");
					while (rs.next()){
						System.out.println("Nan: " + rs.getObject("nan") + ", Izena: " +
						rs.getObject("izena") + ", Abizena: " + rs.getObject("abizenak") + ", Taldea: " +
						rs.getObject("taldea"));
						}
					System.out.println("Esan ezabatu nahi duzunaren izena");
					String ezabatzeko=teklatua.next();
					st.execute("Delete from ikasleak2 where izena='"+ezabatzeko+"'");
						// ResultSet itxi
						rs.close();
						
						System.out.println("Aukeratu bat:\n 1.-ikasle guztiak ikusi\n 2.-ikasle baten datuak aldatu\n 3.-Ikasle bat ezabatu\n 4.-Ikasle berri baten datuak sartu\n 5.-irten");
						aukera=teklatua.nextInt();
					break;
				case 4:
					System.out.println("nana: ");
					String nanberria1=teklatua.next();
					System.out.println("izena: ");
					String izenberria1=teklatua.next();
					System.out.println("abizena: ");
					String abizenberria1=teklatua.next();
					System.out.println("taldea: ");
					String taldeberria1=teklatua.next();
					
					st.execute("insert into ikasleak2 values('"+nanberria1+"','"+izenberria1+"','"+abizenberria1+"','"+taldeberria1+"')");
					
					System.out.println("Aukeratu bat:\n 1.-ikasle guztiak ikusi\n 2.-ikasle baten datuak aldatu\n 3.-Ikasle bat ezabatu\n 4.-Ikasle berri baten datuak sartu\n 5.-irten");
					aukera=teklatua.nextInt();
					break;
				}
			}
			

			
				// Statement itxi kontsulta egin eta gero
				st.close();

			// konexioa itxi
			konexioa.close();
			}
			catch (SQLException sqle){
			// ez baldin bada konexioa era egokian egin
			sqle.printStackTrace();
			System.out.println("Konexio errorea");
			}
		
	}

}
