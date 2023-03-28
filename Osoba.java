package ata;

public class Osoba {
	String ime;
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getAdresaPrebivalista() {
		return adresaPrebivalista;
	}

	public void setAdresaPrebivalista(String adresaPrebivalista) {
		this.adresaPrebivalista = adresaPrebivalista;
	}

	public String getDatumRodenja() {
		return datumRodenja;
	}

	public void setDatumRodenja(String datumRodenja) {
		this.datumRodenja = datumRodenja;
	}


	String prezime;
	String oib;
	String adresaPrebivalista;
	String datumRodenja;

	public Osoba() {
		ime = "";
		prezime = "";
		oib = "";
		}
	
	public Osoba(String i, String p, String o) {
		ime = i;
		prezime = p;
		oib = o;
		}
	public Osoba(String i, String p, String o, String adresa, String datRod) {
		ime = i;
		prezime = p;
		oib = o;
		adresaPrebivalista = adresa;
		datumRodenja = datRod;
		}

	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		System.out.println("Ime: " + o1.ime);
		System.out.println("Prezime: " + o1.prezime);
		System.out.println("OIB: " + o1.oib);
		System.out.println("-----------------");
		o1.ime = "Marko"; // definiramo ime objekta o1
		o1.prezime = "Maric"; // definiramo prezime objekta o1
		o1.oib = "01234567891"; // definiramo OIB objekta o1
		System.out.println("Ime: " + o1.ime);
		System.out.println("Prezime: " + o1.prezime);
		System.out.println("OIB: " + o1.oib);
		System.out.println("-----------------");
		 // kreiramo objekt o2 klase Osoba pozivom drugog konstruktora:
		//Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100");
		//System.out.println("Ime: " + o2.ime);
		//System.out.println("Prezime: " + o2.prezime);
		//System.out.println("OIB: " + o2.oib);
		Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100", "Matije Gupca 11", "11.14.2000");
		//o2.Ispis();
		o2.AzurirajAdresu("Ilica 111, 10000 Zagreb");
		//o2.AzurirajAdresu("");
		o2.Ispis();
		o2.ProvjeraDatuma();
		//o2.ProvjeraString(getIme());
				

	}
	
	public void Ispis() {
		System.out.println("Ime: " +ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("OIB: " + oib);
		System.out.println("Adresa: " + adresaPrebivalista);
		System.out.println("Datum rodenja: " + datumRodenja);
		}
	
	
	public void AzurirajAdresu(String a) {
		if(a != null && !a.isEmpty())
			adresaPrebivalista = a;
		else System.out.println("Pogresan unos!");;
		
	}

	
	public void ProvjeraOIB() {
		try {
		long l = Long.parseLong(oib);
		if(l < 0) {
		System.out.println("OIB ne smije biti negativan broj!");
		return;
		}
		}
		catch(NumberFormatException nfe){
		System.out.println("OIB mora sadržavati samo znamenke!");
		return;
		}
		if( oib.length()!=11) {
		System.out.println("OIB mora sadržavati 11 znamenaka!");
		return;
		}
		else {
		System.out.println("OIB je ispravnog formata.");
		}
	}
	
	
	public void ProvjeraDatuma(){
			String[] parts = this.getDatumRodenja().split("\\.");
			//int dan = Integer.valueOf(adresaPrebivalista.toString());
			int dan = Integer.parseInt(parts[0]);
			int mjesec = Integer.parseInt(parts[1]);
			int godina = Integer.parseInt(parts[2]);
			int counterError = 0;
			
			if(dan<0 || dan >= 31) {
				System.out.println("Broj dana mora biti izmedu 1 i 31!");
				return;
			}
			if(mjesec<12 || mjesec > 12) {
				System.out.println("Mjesec mora biti izmedu 1 i 12!");
				return;
			}
			if(godina<1900) {
				System.out.println("Godina rodenja mora bit veca od 1900.!");
				return;
			}
			
			System.out.println("Datum je ispravnog formata!");
	}
	
	private boolean ProvjeraString(String str) {
		if(str.isEmpty() || str == " " || str.contains(str)) {
			System.out.println("Unesen je prazan string");
			return false;
		}
		else {
			System.out.println("Unesen je ispravan string");
			return true;
		}
	}

}