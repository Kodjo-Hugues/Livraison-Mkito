package eu.ensup.MockDao.fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	public UserDao(){
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				

				System.out.println("sauvergarder");
				//LireEnBaase();
	}
public static void sauverEnBase(String personne){
		
		
		// Information d'accès à la base de donées

		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		//String passwd = "utilisateur";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		//ResultSet rs = null;

		try {
			// Etape 1 : Chargemet du driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2 : récupération de la conneion
			cn = DriverManager.getConnection(url, login, passwd);
			// Etape 3 Création d'un staement
			st = cn.createStatement();
		
			String sql = "INSERT INTO `personne`(`nom`) VALUES ('"+ personne +"')";
			// Etape 4 excécution requte
			 st.executeUpdate(sql);
			// Etape 5 ( parcours Resultset)
			
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {// Etape 5 : libérer ressource de la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
 public  boolean LireEnBaase(){
	 

		// Information d'accès à la base de donées

		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		//String passwd = "utilisateur";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		//ResultSet rs = null;

		try {
			// Etape 1 : Chargemet du driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2 : récupération de la conneion
			cn = DriverManager.getConnection(url, login, passwd);
			// Etape 3 Création d'un staement
			st = cn.createStatement();
		
			String sql = "SELECT * from personne";
			// Etape 4 excécution requte
			 ResultSet rs = st.executeQuery(sql);
			// Etape 5 ( parcours Resultset)
			 while (rs.next()){
				 System.out.println(rs.getString("nom"));
			 }
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {// Etape 5 : libérer ressource de la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	 
 }
 
 public  boolean supprimerEnbase(){
	 
		// Information d'accès à la base de donées

		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		//String passwd = "utilisateur";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		//ResultSet rs = null;

		try {
			// Etape 1 : Chargemet du driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2 : récupération de la conneion
			cn = DriverManager.getConnection(url, login, passwd);
			// Etape 3 Création d'un staement
			st = cn.createStatement();
		
			String sql = "DELETE FROM `personne` WHERE nom = ('"+ "" +"')";
			// Etape 4 excécution requte
			 st.executeUpdate(sql);
			// Etape 5 ( parcours Resultset)
			
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {// Etape 5 : libérer ressource de la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return true;
 }
	
 
 public static void updatEnbase(String personne,String param){
	 
		// Information d'accès à la base de donées

		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		//String passwd = "utilisateur";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		//ResultSet rs = null;

		try {
			// Etape 1 : Chargemet du driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2 : récupération de la conneion
			cn = DriverManager.getConnection(url, login, passwd);
			// Etape 3 Création d'un staement
			st = cn.createStatement();
		
			String sql = "UPDATE  `personne` set nom = ('"+ personne +"') where nom = ('"+ param +"')";
			// Etape 4 excécution requte
			 st.executeUpdate(sql);
			// Etape 5 ( parcours Resultset)
			
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {// Etape 5 : libérer ressource de la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}

public boolean create() {
	// TODO Auto-generated method stub
	
	return true;
	
	
}

}