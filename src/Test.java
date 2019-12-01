import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// objekti
		KreiranjeRacuna racun1 = new KreiranjeRacuna(10, "Amina", 3);
		KreiranjeRacuna racun2 = new KreiranjeRacuna(11, "Belma", 1);

		KreiranjeKnjige knjiga1 = new KreiranjeKnjige(111, "Ana", true);
		KreiranjeKnjige knjiga2 = new KreiranjeKnjige(112, "Rat i mir", false);

		// arayliste
		ArrayList<KreiranjeRacuna> racun = new ArrayList<>();
		racun.add(racun1);
		racun.add(racun2);

		ArrayList<KreiranjeKnjige> knjiga = new ArrayList<>();
		knjiga.add(knjiga1);
		knjiga.add(knjiga2);

		for (int i = 0; i < racun.size(); i++) { // da li imaju dva ista broja racuna
			for (int j = i + 1; j < racun.size(); j++) {
				if (racun.get(i).getBrojRacuna() == racun.get(j).getBrojRacuna()) {
					throw new ArithmeticException("Broj racuna " + racun.get(j).getBrojRacuna() + " nije validan!");
				}
			}
		}

		for (int i = 0; i < knjiga.size(); i++) { // da li imaju dva ista broja knjige
			for (int j = i + 1; j < knjiga.size(); j++) {
				if (knjiga.get(i).getBrojKnjige() == knjiga.get(j).getBrojKnjige()) {
					throw new ArithmeticException("Broj knjige " + knjiga.get(j).getBrojKnjige() + " nije validan!");
				}
			}
		}

		// PODIZANJE KNJIGE
		PodizanjeKnjige podizanjeKnjige = new PodizanjeKnjige();
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj racuna: ");
		int brojR = unos.nextInt();
		System.out.print("Unesite broj knjige: ");
		int brojK = unos.nextInt();
		System.out.println();
		unos.close();

		for (int i = 0; i < racun.size(); i++) {
			for (int j = 0; j < knjiga.size(); j++) {
				if (racun.get(i).getBrojRacuna() == brojR && knjiga.get(j).getBrojKnjige() == brojK) {
					podizanjeKnjige.setBrojRacuna(brojR);
					podizanjeKnjige.setBrojKnjige(brojK);
					if (racun.get(i).getBrojPosudjenihKnjiga() < 3) {
						if (!knjiga.get(j).getStatusKnjige()) {
							knjiga.get(j).setStatusKnjige(true);
							racun.get(i).setBrojPosudjenihKnjiga(racun.get(i).getBrojPosudjenihKnjiga() + 1);
							racun.get(i).ispis();
							System.out.println("__________________________\n");
							knjiga.get(j).ispis();
							;
							break;
						} else {
							System.out.println("Knjiga je vec podignuta.");
						}
					} else {
						System.out.println("Imate vise od 3 podignute knjige!");
					}
				}
			}
		}
		
	}
}
