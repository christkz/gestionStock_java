package Application;
import java.net.Socket;
import java.sql.*;


public class BDD {
    Connection con;
    Statement stm;
    String SQL;
  
    String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;
    
    public BDD(String url, String username, String password, String Host, int port){
        this.url = url;
        this.username = username;
        this.password = password;
       // this.Host = Host;
       // this.Port = Port;
    }
    //fonction pour faire connection au base de donnée

    
    public Connection connexionDatabase(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }catch(Exception e){System.err.println(e.getMessage());}//e.getMessage est pour afficher ou se trouver exactement
        //err est pour afficher l'err}
        
        return con; 
    }
    public Connection closeconnexion(){
        try{
            con.close();
            
        }
        catch(Exception e){System.err.println(e);}
        
        return con;
    }


   
   // pour l'execution du requete

    public ResultSet exécutionQuery(String sql){
        connexionDatabase();
        ResultSet resultSet = null;
        try{
            stm = con.createStatement();
            resultSet = stm.executeQuery(sql);
            System.out.println(sql);
            
            
        }catch(SQLException ex){System.err.println(ex);}
        return resultSet;
    }
    //pour execution du requete update

    public String exécutionUpdate(String sql){
        connexionDatabase();
        String result;
        result = "";
        try{
            stm = con.createStatement();
            stm.executeUpdate(sql);
            result = sql;
        }catch(SQLException ex){result = ex.toString();}
         return result;
    }
    // fonction de requete pour afficher tout ce qui se trouve dans la table

    
    public ResultSet querySelectAll(String nomTable){
        
        connexionDatabase();
        SQL = "Select * FROM " + nomTable;
        System.out.println(SQL);
        return this.exécutionQuery(SQL);
    }
    // fonction de requete pour afficher tous avec de parametre etat

    
    public ResultSet querySelectAll(String nomTable, String etat){
        connexionDatabase();
        SQL = "Select * FROM "+ nomTable + " WHERE " + etat;
        return this.exécutionQuery(SQL);  
    }
   // fonction de selection de données

   
    public ResultSet querySelect(String[] nomColonne, String nomTable){
        connexionDatabase();
        int i;
        SQL = "SELECT ";
        for(i = 0; i <= nomColonne.length -1;i++)
        {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1)
            {
                SQL +=",";
            }
        }
        SQL +=" FROM " + nomTable;
        return this.exécutionQuery(SQL);
    }
    
    //

    
    public ResultSet fcSelectCommand(String[] nomColonne, String nomTable, String etat){
        connexionDatabase();
        int i;
        SQL = "SELECT ";
        for(i=0; i<= nomColonne.length -1; i++)
        {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1)
            {
                SQL += ",";
            }
        }
        SQL += " FROM " + nomTable + " WHERE " + etat;
        return this.exécutionQuery(SQL);
    }
    
    // fonction d'insertion de données

    
    public String queryInsert(String nomTable, String [] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + "VALUES(";
        for(i = 0; i <= contenuTableau.length -1; i++)
        {
            SQL += "'" + contenuTableau[i] + "'";
            if(i < contenuTableau.length -1)
            {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.exécutionUpdate(SQL);
    }

    
    public String queryInsert(String nomTable, String [] nomColonne, String [] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + "(";
        for(i = 0; i <= nomColonne.length -1; i++)
        {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1)
            {
                SQL += ",";
            }
        }
        SQL += ")VALUES(";
        for(i=0; i <= contenuTableau.length -1; i++)
        {
            SQL += "'" + contenuTableau[i] + "'";
            if(i < contenuTableau.length -1)
            {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.exécutionUpdate(SQL);
    }
    
    //

     public String queryUpdate(String nomTable, String [] nomColonne, String [] contenuTableau, String etat){
        connexionDatabase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";
        
        for(i = 0; i <= nomColonne.length -1; i++)
        {
            SQL += nomColonne[i] + "='" +contenuTableau[i] + "'";
            if(i < nomColonne.length -1)
            {
                SQL += ",";
            }
        }
        SQL += " WHERE " + etat;
        return this.exécutionUpdate(SQL);
    }
     
    //fonction pour la requete supprimer sans parametre
 
    public String queryDelete(String nomtable){
        connexionDatabase();
        SQL = "DELETE FROM " + nomtable;
        return this.exécutionUpdate(SQL);
    }
    // fonction pour la requete supprimer avec parametre
    

    public String queryDelete(String nomTable, String etat){
        connexionDatabase();
        SQL = "DELETE FROM " + nomTable + " WHERE " + etat;
        return this.exécutionUpdate(SQL);
    }

    
}
