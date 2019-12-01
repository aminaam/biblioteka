
public class KreiranjeRacuna {
	
	private int brojRacuna;
	private String imeMusterije;
	private int brojPosudjenihKnjiga;

	// konstruktori
	public KreiranjeRacuna() {

	}

	public KreiranjeRacuna(int brojRacuna, String imeMusterije, int brojPosudjenihKnjiga) {
			
		if (brojRacuna < 0) {
			throw new ArithmeticException("Broj racuna ne smije biti negativan broj!");
		} else {
			this.brojRacuna = brojRacuna;
		}
		this.imeMusterije = imeMusterije;
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
	}

	// getteri i setteri
	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeMusterije() {
		return imeMusterije;
	}

	public void setImeMusterije(String imeMusterije) {
		this.imeMusterije = imeMusterije;
	}

	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}

	public void setBrojPosudjenihKnjiga(int brojPosudjenihKnjiga) {
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
	}
	
	public void ispis() {
		System.out.println("Broj racuna musterije: " + getBrojRacuna());
		System.out.println("Ime vlasnika racuna: " + getImeMusterije());
		System.out.println("Broj posudjenih knjiga: " + getBrojPosudjenihKnjiga());
	}

}
