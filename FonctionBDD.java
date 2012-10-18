import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FonctionBDD {
	
	public FonctionBDD(){
		
	}

	private Connection connexionBDD() {
		Connection connexion = null; 

		try {
			Class.forName("org.postgresql.Driver");
			try {
				connexion = DriverManager.getConnection("jdbc:postgresql:dbnasr", "rnasr", "RodN=1813");
			} 
			
			catch (SQLException e) {
				
				System.out.println("Erreur lors de la connexion !" + e);
			} 
		} 

		catch (ClassNotFoundException e) {
			System.out.println("Driver non charg� ! " + e); 
		}
		return connexion;
		
	}
	
	public void requeteSQL() {
		
		Connection connexion = connexionBDD(); 
		Statement st = null;
		
		try {
			st = connexion.createStatement();
		} 
		
		catch (SQLException e) {
			System.out.println("ERREUR ! " + e);;
		}
		
		String sql = "INSERT INTO Pilotes VALUES ('idPilote.getText()', 'nomPilote.getText()', 'prenomPilote.getText()');";
		try {
			
			ResultSet  rsRequete = st.executeQuery (sql) ;
				rsRequete.close() ;   // Permet de lib�rer la m�moire utilis�e.
	
		} 
		catch (SQLException e) {
			System.out.println("Erreur dans la requ�te ! " + e);
		}
	}
}
