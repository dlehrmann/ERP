package erp;


public class Artikel {
	
	private int artikelId;
	private String kurzBezeichnung;
	private String beschreibung;
	private double ekPreis;
	private double vkPreis;
	PreisEinheiten einheit;
	
	
	public int getArtikelId() {
		return artikelId;
	}
	public void setArtikelId(int artikelId) {
		this.artikelId = artikelId;
	}
	public String getKurzBezeichnung() {
		return kurzBezeichnung;
	}
	public void setKurzBezeichnung(String kurzBezeichnung) {
		this.kurzBezeichnung = kurzBezeichnung;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public double getEkPreis() {
		return ekPreis;
	}
	public void setEkPreis(double ekPreis) {
		this.ekPreis = ekPreis;
	}
	public double getVkPreis() {
		return vkPreis;
	}
	public void setVkPreis(double vkPreis) {
		this.vkPreis = vkPreis;
	}
	
	
	

}
