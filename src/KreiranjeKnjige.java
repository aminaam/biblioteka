
public class KreiranjeKnjige {
	
	private int brojKnjige;
	private String imeKnjige;
	private boolean statusKnjige; // da li je knjiga izdata ili ne
	
	//konstruktori
	public KreiranjeKnjige() {
		
	}
	
	public KreiranjeKnjige(int brojKnjige, String imeKnjige, boolean statusKnjige) {
		if(brojKnjige < 0) {
			throw new ArithmeticException("Broj knjige ne smije biti negativan broj! ");
		}
		else {
			this.brojKnjige = brojKnjige;
		}
		this.imeKnjige = imeKnjige;
		this.statusKnjige = statusKnjige;
	}
	
	//getteri i setteri
	public int getBrojKnjige() {
		return brojKnjige;
	}
	
	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}
	
	public String getImeKnjige() {
		return imeKnjige;
	}
	
	public void setImeKnjige(String imeKnjige) {
		this.imeKnjige = imeKnjige;
	}
	
	public boolean getStatusKnjige() {
		return statusKnjige;
	}
	
	public void setStatusKnjige(boolean statusKnjige) {
		this.statusKnjige = statusKnjige;
	}
	
	public void ispis() {
		System.out.println("Broj knjige: " + getBrojKnjige());
		System.out.println("Ime knjige: " + getImeKnjige());
		System.out.println("Status knjige: " + getStatusKnjige());
	}
}
