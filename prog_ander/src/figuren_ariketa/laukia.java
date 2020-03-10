package figuren_ariketa;

public class laukia extends figurak{

	laukia(String mota, int altuera, int oinarria) {
		super(mota, oinarria, altuera);
	}
	public double peri() {
		double per=getaltuera()*getoinarria();
		return per;
	}
	public double az() {
		double aza=Math.pow(getaltuera(), 2);
		return aza;
	}

}
