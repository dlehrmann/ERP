package erp;

import java.util.Date;

public class Auftrag {
	
	private int auftragId;
	private Date lieferDatum;
	BestellteArtikel[] pos;
	Kunde kunde;
	
	
	
	public int getAuftragId() {
		return auftragId;
	}
	public void setAuftragId(int auftragId) {
		this.auftragId = auftragId;
	}
	public Date getLieferDatum() {
		return lieferDatum;
	}
	public void setLieferDatum(Date lieferDatum) {
		this.lieferDatum = lieferDatum;
	}
	
	
	



}
