package erp;

public abstract class Kontakte {
	
	protected String name;
	protected String strasse;
	protected String plz;
	protected String ort;
	protected String mail;
	protected String telefon;
	
	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract String getStrasse();
	public abstract void setStrasse(String strasse);
	
	public abstract String getPlz();
	public abstract void setPlz(String plz);
	
	public abstract String getOrt();
	public abstract void setOrt(String ort);
	
	public abstract String getMail();
	public abstract void setMail(String mail);
	
	public abstract String getTelefon();
	public abstract void setTelefon(String telefon);

}
