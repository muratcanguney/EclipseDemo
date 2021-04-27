package oopOdev;

public class DerslerManager {
	
	public void dersEkle(Dersler dersler) {
		System.out.println(dersler.dersAdi + " Dersine Baþarýyla Kayýt Oldunuz.." );
	}
	
	public void dersSil(Dersler dersler) {
		System.out.println(dersler.dersAdi + " Dersindeki Kaydýnýz Silinmiþtir.." );
	}
	
	public String dersUcreti(Dersler dersler) {
		if(dersler.dersUcreti == 0.0) {
		return	"ÜCRETSÝZ";
		} else {
		return dersler.dersUcreti + "TL";
		}
	}

}
