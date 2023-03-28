package ata;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
	
	String jmbag;
	ArrayList<Predmet> listaPredmeta;
	
	

	public ArrayList<Predmet> getListaPredmeta() {
		return listaPredmeta;
	}



	public void setListaPredmeta(ArrayList<Predmet> listaPredmeta) {
		this.listaPredmeta = listaPredmeta;
	}



	public Student(String i, String p, String o, String adresa, String datRod,String JMBAG, ArrayList<Predmet> predmeti) {
		super(i, p, o, adresa, datRod);
		// TODO Auto-generated constructor stub
		jmbag = JMBAG;
		listaPredmeta = predmeti;
	}



	public static void main(String[] args) {
		Predmet p1 = new Predmet("CMS", 9);
		Predmet p2 = new Predmet("PMA", 10);
		Predmet p3 = new Predmet("OWP", 9);
		Predmet p4 = new Predmet("ATA", 15);
		Predmet p5 = new Predmet("PIS", 12);
		Predmet p6 = new Predmet("SPJ", 9);
		Predmet p7 = new Predmet("WPSP", 9);
		Predmet p8 = new Predmet("BP", 6);
		ArrayList<Predmet> predmeti1 = new ArrayList<Predmet>();
		predmeti1.add(p1);
		predmeti1.add(p2);
		predmeti1.add(p3);
		predmeti1.add(p4);
		predmeti1.add(p5);
		
		ArrayList<Predmet> predmeti2 = new ArrayList<Predmet>();
		predmeti2.add(p7);
		predmeti2.add(p6);
		predmeti2.add(p3);
		predmeti2.add(p4);
		predmeti2.add(p5);
		
		ArrayList<Predmet> predmeti3 = new ArrayList<Predmet>();
		predmeti3.add(p7);
		predmeti3.add(p8);
		predmeti3.add(p1);
		predmeti3.add(p2);
		predmeti3.add(p3);
		
		
		Student s1 = new Student("Ime", "Prezime", "02145874569", "A.G.matosa 2a", "21.5.2000", "8745874569", predmeti1);
		Student s2 = new Student("Vatroslav", "Krpan", "11111111111", "I.G.Kovacica 5", "18.11.2001", "8764879", predmeti2);
		Student s3 = new Student("Luka", "Kovac", "84587458968", "Ferde Rusana 1", "7.7.2005", "12547856329", predmeti3);
		
		List<Student> studenti = new ArrayList<Student>();
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		
		for(Student element : studenti) {
			System.out.println("Ime: " + element.ime);
			System.out.println("Prezime: " + element.prezime);
			System.out.println("OIB: " + element.oib);
			System.out.println("Adresa: " + element.adresaPrebivalista);
			System.out.println("Datum rodenja: " + element.datumRodenja);
			System.out.println("JMBAG: " + element.jmbag);
			Predmet testni = new Predmet();
			System.out.println("Zbroj ects bodova: " + testni.sumaECTS(element.getListaPredmeta()));
			System.out.println("-----------------");
			
		}
	}

}
