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
			System.out.println("Driver non chargé ! " + e); 
		}
		return connexion;
		
	}
	
	public void requeteSQL(String nom, String prenom) {
		
		Connection connexion = connexionBDD(); 
		Statement st = null;
		
		try {
			st = connexion.createStatement();
		} 
		
		catch (SQLException e) {
			System.out.println("ERREUR ! " + e);
		}
		
		String sql = "INSERT INTO Pilotes(NomPilote, PrenomPilote) VALUES ('" + nom + "', '" + prenom + "');";
		
		System.out.println(sql + "\n");

		try {
			
			st.executeUpdate(sql) ;
		} 
		catch (SQLException e) {
			System.out.println("Erreur dans la requête ! " + e);
		}
	}
	
	public ResultSet consulterPilote() {
		Connection connexion = connexionBDD(); 
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = connexion.createStatement();
		} 
		
		catch (SQLException e) {
			System.out.println("ERREUR ! " + e);
		}
		
		try {
			rs = st.executeQuery ("SELECT * FROM Pilotes;");
			
			System.out.println("Contenu de la table Pilotes : \n");
			
			while (rs.next()) {
				String nom = rs.getString(2);
				         System.out.print("Nom : " + nom + " | ") ;
				String prenom = rs.getString(3);
				         System.out.println("Prénom : " + prenom) ;
				}
				rs.close() ;
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return rs;
	}
}

// test git
// test GIT 2
