package controller.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class SQLServerConnUtils_JTDS {
 
 
 // Káº¿t ná»‘i vĂ o SQLServer.
 // (Sá»­ dá»¥ng thÆ° viá»‡n Ä‘iá»�u khiá»ƒn JTDS)
 public static Connection getSQLServerConnection()
         throws SQLException, ClassNotFoundException {
     String hostName = "localhost";
     String sqlInstanceName = "SQLEXPRESS";
     String database = "simplehr";
     String userName = "sa";
     String password = "1234";
 
     return getSQLServerConnection(hostName, sqlInstanceName, database,
             userName, password);
 }
 
 
 // TrÆ°á»�ng há»£p sá»­ dá»¥ng SQLServer.
 // VĂ  thÆ° viá»‡n JTDS.
 public static Connection getSQLServerConnection(String hostName,
         String sqlInstanceName, String database, String userName,
         String password) throws ClassNotFoundException, SQLException {
     // Khai bĂ¡o class Driver cho DB SQLServer
     // Viá»‡c nĂ y cáº§n thiáº¿t vá»›i Java 5
     // Java6 tá»± Ä‘á»™ng tĂ¬m kiáº¿m Driver thĂ­ch há»£p.
     // Náº¿u báº¡n dĂ¹ng Java6, thĂ¬ ko cáº§n dĂ²ng nĂ y cÅ©ng Ä‘Æ°á»£c.
     Class.forName("net.sourceforge.jtds.jdbc.Driver");
 
     // Cáº¥u trĂºc URL Connection dĂ nh cho SQLServer
     // VĂ­ dá»¥:
     // jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
     String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/"
             + database + ";instance=" + sqlInstanceName;
 
     Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
 
}
