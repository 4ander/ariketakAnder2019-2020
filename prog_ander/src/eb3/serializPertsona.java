package eb3;

import java.io.Serializable;

public class serializPertsona implements Serializable{
	private String izena;
	private String abizena;
	private String abizena2;
	
	public serializPertsona(String izena, String abizena, String abizena2) {
		this.izena=izena;
		this.abizena=abizena;
		this.abizena2=abizena2;
				
	}

	@Override
	public String toString() {
		return "serializPertsona [izena="+izena +", abizena="+abizena+", abizena2="+abizena2+"]";
	}

}
