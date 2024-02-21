package erp;

import java.util.Date;

public class Rechnung {
	
	private int rechnungId;
	private Date rechnungDatum;
	Auftrag auftrag;
	
	
	public int getRechnungId() {
		return rechnungId;
	}
	public void setRechnungId(int rechnungId) {
		this.rechnungId = rechnungId;
	}
	public Date getRechnungDatum() {
		return rechnungDatum;
	}
	public void setRechnungDatum(Date rechnungDatum) {
		this.rechnungDatum = rechnungDatum;
	}
	
	
	

}
