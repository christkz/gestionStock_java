
package Application;


public class Parameter {
    public static String IPHOST = "127.0.0.1";// adresse de bouclage
    public static String HOST_DB = "jdbc:mysql://" + IPHOST + ":3306/gestion_de_donne";
    //gestion_de_donne  notre base de données
    public static String USERNAME_DB = "root";
    public static String PASSWORD_DB ="";
    
    public static int PORT = 11111;
    public static String USER;
}
