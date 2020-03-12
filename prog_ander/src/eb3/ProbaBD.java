package eb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProbaBD {
	public static void main(String[] args) {
		try{
			Connection konexioa =
			DriverManager.getConnection("jdbc:mysql://localhost/ikasleak", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");
			Statement st = konexioa.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ikasleak"); 
			while (rs.next()){
				System.out.println("NAN: " + rs.getObject("nan") + ", Izena: " +
				rs.getObject("izena") + ", Abizenak: " + rs.getObject("abizenak") + ", Taldea: " +
				rs.getObject("taldea"));
				}
				// ResultSet itxi
				rs.close();
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
