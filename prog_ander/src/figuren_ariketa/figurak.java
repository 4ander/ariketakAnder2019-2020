package figuren_ariketa;

import java.io.Serializable;

public abstract class figurak implements Serializable{
	private static final long serialVersionUID = 1234567L;
	private int altuera;
	private int oinarria;
	private String mota;
	
	
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
	public abstract double azalera();
	public abstract double perimetroa();
	
}
