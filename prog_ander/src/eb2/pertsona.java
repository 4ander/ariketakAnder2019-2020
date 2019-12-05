package eb2;

public class pertsona {

	private String izena;
	private String abizena;
	private String NAN;
	private int adina;
	
	
	public void ikasleaaurkeztu() {
		System.out.println("ikaslearen izena: "+getIzena());
		System.out.println("ikaslearen NAN-a: "+getNAN());
		System.out.println("ikaslearen adina: "+getAdina());
		System.out.println("ikaslearen abizena: "+getAbizena());
		
	}
	public void datuaksartu(String NAN, String abizena, String izena, int adina) {
		
		setNAN(NAN);
		setIzena(izena);
		setAbizena(abizena);
		setAdina(adina);
	}
	private String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		if(izena.equals("sergio")) {
			izena="Ana";
		}
		
		this.izena = izena;
	}
	private String getAbizena() {
		return abizena;
	}
	private void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	private String getNAN() {
		return NAN;
	}
	private void setNAN(String nAN) {
		NAN = nAN;
	}
	private int getAdina() {
		return adina;
	}
	private void setAdina(int adina) {
		this.adina = adina;
	}
	
	public pertsona(){
		System.out.println("sortu da lehen pertsona");
		String izena="izen berria";
		String abizena="abizen berria";
		String NAN="nanberria";
		int adina=0;
		System.out.print(izena);
		System.out.println(abizena);
		System.out.println(NAN);
		System.out.println(adina);
		
	}
}
