package figuren_ariketa;

public class laukia extends figurak{

	laukia(String mota, int altuera, int oinarria) {
		super(mota, oinarria, altuera);
	}
	public void per() {
		double laukper=getaltuera()*getoinarria();
		perimetroa= laukper;
	}
	public void az() {
		double laukaza=Math.pow(getaltuera(), 2);
		azalera= laukaza;
	}

}
