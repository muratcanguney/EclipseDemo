package oopOdev;

public class Main {

	public static void main(String[] args) {
		Kategori kategori1 = new Kategori(1, "Programlama");
		Kategori kategori2 = new Kategori(2, "Siber Güvenlik");

		Kategori[] kategoriler = { kategori1, kategori2 };

		for (Kategori kategori : kategoriler) {
			System.out.println(kategori.id + " - " + kategori.kategoriAdi);
		}
		System.out.println("--------------------------------------------------------------------------- \n");

		Dersler dersler1 = new Dersler(1, "Programlamaya Giriþ Ýçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demiroð", 0.0);
		Dersler dersler2 = new Dersler(2, "C# + ANGULAR",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demiroð", 0.0);
		Dersler dersler3 = new Dersler(3, "JAVA + REACT",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demiroð", 26.26);

		Dersler[] dersler = { dersler1, dersler2, dersler3 };
		DerslerManager derslerManager = new DerslerManager();

		for (Dersler ders : dersler) {
			System.out.println("Ders: " + ders.dersAdi + "\n" + ders.dersAciklama + "\n" + "Eðitmen: "
					+ ders.ogretmenAdi + "\t\t" + derslerManager.dersUcreti(ders) + "\n");
		}

		System.out.println("---------------------------------------------------------------------------");
		derslerManager.dersEkle(dersler1);
		derslerManager.dersSil(dersler2);
	}
}
