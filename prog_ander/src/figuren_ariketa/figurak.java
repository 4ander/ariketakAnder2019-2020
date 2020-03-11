package figuren_ariketa;

import java.io.Serializable;

public class figurak implements Serializable{
	private int altuera;
	private int oinarria;
	private String mota;
	protected static double azalera;
	protected static double perimetroa;
	
	figurak( String mota, int altuera, int oinarria){
		this.mota=mota;
		this.altuera=altuera;
		this.oinarria=oinarria;
	}
	public int getaltuera() {
		return altuera;
	}
	public int getoinarria() {
		return oinarria;
	}
	public String getmota() {
		return mota;
	}
	public double getazalera() {
		return azalera;
	}
	public double getperimetroa() {
		return perimetroa;
	}
	
}
