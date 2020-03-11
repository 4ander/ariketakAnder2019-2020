package figuren_ariketa;

public class zirkulua extends figurak{
	private int radioa;
	public final double pi=3.1415;
	
	zirkulua(String mota, int altuera, int oinarria, int radioa){
		super(mota,altuera,oinarria);
		this.radioa=radioa;
	}
	
	public void per() {
		double zirperi=pi*radioa*2;
		perimetroa= zirperi;
	}
	public void aza() {
		double ziraza=Math.pow((pi*radioa),2);
		azalera= ziraza;
	}

}
