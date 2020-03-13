package eb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PDF_BDariketa1 {
	public static void main(String[] args) {
		try{
			Connection konexioa =
			DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");
			Statement st = konexioa.createStatement();
			st.executeUpdate("Create database dbautoak");
			st.executeUpdate("create table dbautoak.autoa(kodea int(5),marca varchar(10), Eredua varchar(10), kolorea varchar(10), matrikula varchar(7), ekoizpendata varchar(8))");	
			st.executeUpdate("insert into dbautoak.autoa values (12345, 'Dacia','Logan','Grisa','777777S',2014)");
			ResultSet rs=st.executeQuery("select * from dbautoak.autoa");

			while (rs.next()){
				System.out.println("kodea: " + rs.getObject("kodea") + ", marka: " +
				rs.getObject("marca") + ", eredua: " + rs.getObject("eredua") + ", kolorea: " +
				rs.getObject("kolorea")+ ", matrikula: " + rs.getObject("matrikula")+ ", ekoizpen data: " + rs.getObject("ekoizpendata"));
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


