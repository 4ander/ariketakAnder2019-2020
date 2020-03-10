package figuren_ariketa;

public class zirkulua extends figurak{
	private int radioa;
	public final double pi=3.1415;
	
	zirkulua(String mota, int altuera, int oinarria, int radioa){
		super(mota,altuera,oinarria);
		this.radioa=radioa;
	}
	
	public double perimetroa() {
		double peri=pi*radioa*2;
		return peri;
	}
	public double azalera() {
		double az=Math.pow((pi*radioa),2);
		return az;
	}

}
