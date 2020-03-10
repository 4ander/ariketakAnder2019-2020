package figuren_ariketa;

public class triangelua extends figurak{
	private int aldea1;
	private int aldea2;
	private int aldea3;

	triangelua(String mota, int altuera, int oinarria, int aldea1, int aldea2, int aldea3) {
		super(mota, oinarria, altuera);
		this.aldea1=aldea1;
		this.aldea2=aldea2;
		this.aldea3=aldea3;
		
		
	}
	public double az() {
		double aza=getoinarria()*getaltuera()/2;
		return aza;
	}
	public double per() {
		double peri=aldea1+aldea2+aldea3;
		return peri;
	}

}
