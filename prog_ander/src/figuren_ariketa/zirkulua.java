package figuren_ariketa;

public class zirkulua extends figurak{
	private int radioa;
	public final double pi=3.1415;
	
	zirkulua(String mota, int altuera, int oinarria, int radioa){
		super(mota,altuera,oinarria);
		this.radioa=radioa;
	}
	
	public double perimetroa() {
		double perimetroa=pi*radioa*2;
		return perimetroa;
	}
	public double azalera() {
		double azalera=Math.pow((pi*radioa),2);
		return azalera;
	}

}
