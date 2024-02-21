package erp;


import datenbank.DatenbankConnection;
import datenbank.Eingabe;

public class ERP {

	public static void main(String[] args) throws ClassNotFoundException {
		
		DatenbankConnection.connect();
		
		Kunde kunde1 = new Kunde();
		kunde1.setName("FirmaXY");
		kunde1.setStrasse("Birkenweg 12");
		kunde1.setPlz("57080");
		kunde1.setMail("hkihihjolijl@bj");
		
		
		
		System.out.println("Kunde: " + kunde1.getName() + ", " + kunde1.getStrasse() + ", "
							+ kunde1.getPlz() + ", Mail: " + kunde1.getMail() + "," + kunde1.anKu + "," + kunde1.lieferanschrift);
		
		
		
		Eingabe.hauptmenue();

	}

}
