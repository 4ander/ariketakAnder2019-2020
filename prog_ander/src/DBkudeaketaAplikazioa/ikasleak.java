package DBkudeaketaAplikazioa;

import java.io.Serializable;

public  class ikasleak implements Serializable{
	



	private String nana;
	private String izena;
	private String abizena;
	private String taldea;
	

	
	protected ikasleak(String nana, String izena, String abizena, String taldea){
		this.nana=nana;
		this.izena=izena;
		this.abizena=abizena;
		this.taldea=taldea;
	}



	public String getNana() {
		return nana;
	}



	public void setNana(String nana) {
		this.nana = nana;
	}



	public String getIzena() {
		return izena;
	}



	public void setIzena(String izena) {
		this.izena = izena;
	}



	public String getAbizena() {
		return abizena;
	}



	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}



	public String getTaldea() {
		return taldea;
	}



	public void setTaldea(String taldea) {
		this.taldea = taldea;
	}
	public String toString() {
		return "nana=" + nana + ", izena=" + izena + ", abizena=" + abizena + ", taldea=" + taldea;
	}
}
