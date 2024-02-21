package erp;


public class Kunde extends Kontakte{
	

	private int kundenId;
	AnsprechpartnerKunde anKu;
	Lieferanschrift lieferanschrift;
	
	

	public int getKundenId() {
		return kundenId;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}

	

	@Override
	public String getStrasse() {
		return this.strasse;
	}

	@Override
	public void setStrasse(String strasse) {
		this.strasse = strasse;
		
	}

	@Override
	public String getPlz() {
		return this.plz;
	}

	@Override
	public void setPlz(String plz) {
		this.plz = plz;
		
	}

	@Override
	public String getOrt() {
		return this.ort;
	}

	@Override
	public void setOrt(String ort) {
		this.ort = ort;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
	this.name = name;
		
	}

	@Override
	public String getMail() {
		return this.mail;
	}

	@Override
	public void setMail(String mail) {
		this.mail = mail;
		
	}

	@Override
	public String getTelefon() {
		return this.telefon;
	}

	@Override
	public void setTelefon(String telefon) {
	this.telefon = telefon;
	}
	
}
