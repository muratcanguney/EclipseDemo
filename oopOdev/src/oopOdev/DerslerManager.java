package oopOdev;

public class DerslerManager {
	
	public void dersEkle(Dersler dersler) {
		System.out.println(dersler.dersAdi + " Dersine Ba�ar�yla Kay�t Oldunuz.." );
	}
	
	public void dersSil(Dersler dersler) {
		System.out.println(dersler.dersAdi + " Dersindeki Kayd�n�z Silinmi�tir.." );
	}
	
	public String dersUcreti(Dersler dersler) {
		if(dersler.dersUcreti == 0.0) {
		return	"�CRETS�Z";
		} else {
		return dersler.dersUcreti + "TL";
		}
	}

}
