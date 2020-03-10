package eb3;

import java.io.Serializable;

public class frutak implements Serializable {
	String izena;
	double pisua;
	String kolorea;
	String[] bitaminak;

	frutak(String izena, double pisua, String kolorea, String[]bitaminak){
		this.izena=izena;
		this.pisua=pisua;
		this.kolorea=kolorea;
		this.bitaminak=bitaminak;
	}
	public String getIzena() {
		return izena;
	}
}

