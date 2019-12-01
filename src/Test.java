import java.util.ArrayList;

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

		for (int i = 0; i < racun.size(); i++) {
			for (int j = i + 1; j < racun.size(); j++) {
				if (racun.get(i).getBrojRacuna() == racun.get(j).getBrojRacuna()) {
					throw new ArithmeticException("Broj racuna " + racun.get(j).getBrojRacuna() + " nije validan!");
				}
			}
		}

		for (int i = 0; i < knjiga.size(); i++) {
			for (int j = i + 1; j < knjiga.size(); j++) {
				if (knjiga.get(i).getBrojKnjige() == knjiga.get(j).getBrojKnjige()) {
					throw new ArithmeticException("Broj knjige " + knjiga.get(j).getBrojKnjige() + " nije validan!");
				}
			}
		}

	}

}
