package oopOdev;

public class Dersler {

	int id;
	String dersAdi = "";
	String dersAciklama = "";
	String ogretmenAdi = "";
	double dersUcreti;

	public Dersler() {

	}

	public Dersler(int id, String dersAdi, String dersAciklama, String ogretmenAdi, double dersUcreti) {
		this.id = id;
		this.dersAdi = dersAdi;
		this.dersAciklama = dersAciklama;
		this.ogretmenAdi = ogretmenAdi;
		this.dersUcreti = dersUcreti;
	}

}
