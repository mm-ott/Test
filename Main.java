import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) {
		InsererPilote nouveauPilote = new InsererPilote();
		
//		String sql = "INSERT INTO Pilotes VALUES ('idPilote.getText()', 'nomPilote.getText()', 'prenomPilote.getText()');";
//		try {
//			
//			ResultSet  rsRequete = st.executeQuery (sql) ;
//			while (rsRequete.next()) {
//				int numPilote = rsRequete.getInt("numPilote");
//				String nomPilote = rsRequete.getString(2);
//				         System.out.println("Pilote n°" + numPilote + " | Nom : " + nomPilote) ;
//				}
//				rsRequete.close() ;   // Permet de libérer la mémoire utilisée.
	}
}
