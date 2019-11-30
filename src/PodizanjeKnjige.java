import java.util.Date;

public class PodizanjeKnjige {

	private int brojRacuna;
	private int brojKnjige;
	private Date datumPodizanja;

	// konstruktori
	public PodizanjeKnjige() {

	}

	public PodizanjeKnjige(int brojRacuna, int brojKnjige, Date datumPodizanja) {
		this.brojRacuna = brojRacuna;
		this.brojKnjige = brojKnjige;
		this.datumPodizanja = datumPodizanja;
	}

	// getteri i setteri
	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}

	public Date getDatumPodizanja() {
		return datumPodizanja;
	}

	public void setDatumPodizanja(Date datumPodizanja) {
		this.datumPodizanja = datumPodizanja;
	}
}
