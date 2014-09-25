/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;


  import com.mysql.jdbc.Connection; 
 import java.sql.DriverManager; 
 import java.sql.DriverManager; 
 import com.mysql.jdbc.Connection; 
import java.sql.SQLException; 
 
 
 /** 
  * 
  * @author hackro 
  */ 
 public class SQL 
 { 
      
     public static final String USERNAME = "root"; 
     public static final String PASSWORD = ""; 
     public static final String HOST = "localhost"; 
     public static final String PORT = "3306"; 
     public static final String DATABASE = "Empresa"; 
     public static final String CLASSNAME = "com.mysql.jdbc.Driver"; 
     public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE; 
      
      public java.sql.Connection con; 
       
      
      
        public SQL() { 
    
         try { 
            Class.forName(CLASSNAME); 
             con = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
         } catch (ClassNotFoundException e) { 
             System.out.println("Error"); 
         } catch (SQLException e) { 
             System.out.println("Error"); 
         } 
 } 
        
        public java.sql.Connection Conexion()
        {
                return con;
         }
        
 } 











