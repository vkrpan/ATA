package ata;

import java.util.ArrayList;

public class Predmet {

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getECTS() {
		return ECTS;
	}

	public void setECTS(int eCTS) {
		ECTS = eCTS;
	}


	String ime;
	int ECTS;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Predmet(String ime, int eCTS) {
		super();
		this.ime = ime;
		this.ECTS = eCTS;
	}
	
	public Predmet() {
		ECTS = 0;
	}


	public int sumaECTS(ArrayList<Predmet> predmeti) {
		int counter = 0;
		for(Predmet element : predmeti) {
			counter += element.getECTS();
		}
		return counter;
	}

}
