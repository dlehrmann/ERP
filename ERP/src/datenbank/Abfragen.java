package datenbank;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erp.Artikel;

public class Abfragen {
	
	

public static List<Artikel> getAll() throws SQLException {
	
	ResultSet resultSet = DatenbankConnection.query("SELECT * FROM azubi_poltavets_lehrmann.artikel;");
	List<Artikel> artikelList = new ArrayList<>();
	while (resultSet.next()) {
        Artikel artikel = new Artikel();
        artikel.setArtikelId(resultSet.getInt("ArtikelId"));
        artikel.setKurzBezeichnung(resultSet.getString("KurzBezeichnung"));
        artikel.setBeschreibung(resultSet.getString("Beschreibung"));
        artikelList.add(artikel);
    	}
		return artikelList;
	}
}
