package eb2;
import java.util.Scanner;

public class konplexu {
	int erreala=1;
	int irudikaria=1;
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + erreala;
		result = prime * result + irudikaria;
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		konplexu other = (konplexu) obj;
		if (erreala != other.erreala)
			return false;
		if (irudikaria != other.irudikaria)
			return false;
		return true;
	}
	public String toString() {
		return "konplexu [erreala=" + erreala + ", irudikaria=" + irudikaria + " *i]";
	}
	public int getErreala() {
		return erreala;
	}
	public void setErreala(int erreala) {
		this.erreala = erreala;
	}
	public int getIrudikaria() {
		return irudikaria;
	}
	public void setIrudikaria(int irudikaria) {
		this.irudikaria = irudikaria;
	}
	public void irakurri() {
		Scanner teklatua=new Scanner(System.in);
		System.out.println("esan alde erreala: ");
		this.erreala=teklatua.nextInt();
		System.out.println("esan alde irudikaria: ");
		this.irudikaria=teklatua.nextInt();
		System.out.println(toString());
	}
	public int compareTo(konplexu k){
		if (erreala>k.erreala){ 
			return 1;
		}
		else if (erreala<k.erreala){ 
			return -1; 
			} 
		else {
		if (irudikaria>k.irudikaria){
			return 1; 
			} 
		else {
			if (irudikaria<k.irudikaria){
				return -1; 
				}
			else{ 
	}
		
		 
				return 0;
			}
		}
	} 
		 
}
