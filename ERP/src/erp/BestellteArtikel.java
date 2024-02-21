package erp;

import java.util.Date;

public class BestellteArtikel extends Artikel{
	
	Rabatt rabatt;
	Steuersatz steuersatz;
	private double anzahl;
	private Date bestellDatum;
	
	
	
	
	public double getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(double anzahl) {
		this.anzahl = anzahl;
	}
	public Date getBestellDatum() {
		return bestellDatum;
	}
	public void setBestellDatum(Date bestellDatum) {
		this.bestellDatum = bestellDatum;
	}
	
	
	

}
