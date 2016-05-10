package application;

import utils.MongoAccess;

public class Main_rapport {
	
	public static void main(String[] args) {
		
		MongoAccess.connect();
		
		Rapport_xls.export_xls_materiel();
		Rapport_xls.export_xls_destinataire();
	}

}
