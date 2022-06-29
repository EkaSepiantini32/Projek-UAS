package promhs;

import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author 20103295
 */
public class dbkoneksi {
    String DB_URL = "jdbc:mysql://localhost/mhs";
    String USER = "root";
    String PASS = "";
    
    private static Connection koneksi;
    
    public Connection koneksi(){
        if(this.koneksi == null){
            try{
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                this.koneksi= DriverManager.getConnection(DB_URL, USER, PASS);
            }catch(Exception e){
                System.out.println("Error Pada Saat Membuat Koneksi Ke DBMS");
            }
        }
        return this.koneksi;
    }
}

