/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package testjasper;
import java.sql.Connection;
import sql.SQL;
import jasperreport.JasperReport;//libreria propia
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;

public class TestJasper {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, JRException 
    {
        
    sql.SQL con = new sql.SQL();
    
    Connection Con = con.Conexion();
    Class.forName("com.mysql.jdbc.Driver");
    Connection temp = DriverManager.getConnection("jdbc:mysql://localhost/Empresa","root","");
    jasperreport.JasperReport report = new jasperreport.JasperReport();
    
    report.CreateReport((com.mysql.jdbc.Connection) temp, 
            "C:\\Users\\S1NW-A3\\Documents\\NetBeansProjects\\TestJasper\\src\\Reporte\\report1.jasper", 
            "C:\\Users\\S1NW-A3\\Documents", 
            "pdf", 
            "MesJul");
    
    
       
        
        
        
        
        
        
    }
    
}
