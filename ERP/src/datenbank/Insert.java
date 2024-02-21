package datenbank;

import erp.Kunde;

public class Insert {
	
	
	public static void insert(Kunde kunde) {
		
		DatenbankConnection.update("INSERT INTO azubi_poltavets_lehrmann.kunde(name, strasse, plz, ort, mail, telefon)\r\n"
						+" VALUES('" + kunde.getName() + "','" + kunde.getStrasse() +"','" + kunde.getPlz() + "','"
						+ kunde.getOrt() + "','" + kunde.getMail() + "','" + kunde.getTelefon());
	}

}
