package figuren_ariketa;

public class laukia extends figurak{

	private static double laukiaza;
	private double laukiperi;
	
	laukia(String mota, int altuera, int oinarria) {
		super(mota, oinarria, altuera);
	}
	public double perimetroa() {
		double perimetroa=getaltuera()*getoinarria();
		return perimetroa;
	}
	public double azalera() {
		double azalera=Math.pow(getaltuera(), 2);
		return azalera;
	}
	

}
