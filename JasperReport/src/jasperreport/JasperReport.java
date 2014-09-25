/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreport;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author S1NW-A3
 */
public class JasperReport
{

    public void CreateReport(Connection con, String report, String descarga, String format, String name) throws JRException {
        Connection Con = con;//se crea variable de coneccion y se asigna conexion activa
        JasperReport reporte = (JasperReport) JRLoader.loadObject(report);
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, null, Con);
        JRExporter exporte = null;

        switch (format.toLowerCase()) {
            case "pdf":
                exporte = new JRPdfExporter();
                format = format.toLowerCase();
                break;

            case "html":
                exporte = new JRHtmlExporter();
                format = format.toLowerCase();
                break;
            case "xls":
                exporte = new JRXlsExporter();
                format = format.toLowerCase();
                break;

            case "docx":
                exporte = new JRDocxExporter();
                format = format.toLowerCase();
                break;

        }
exporte.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);//C://Descargas/Abarrotes.pdf
exporte.setParameter(JRExporterParameter.OUTPUT_FILE,
        new java.io.File(descarga+"/"+name+"."+format));

exporte.exportReport();

        
        
        
        
        
    }

    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, JRException 
    {
        
  
    
    
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection temp 
= DriverManager.getConnection("jdbc:mysql://localhost/Empresa","root","");
    jasperreport.JasperReport report = new jasperreport.JasperReport();
    
    report.CreateReport((com.mysql.jdbc.Connection) temp, 
            "C:/Users/S1NW-A3/Documents/NetBeansProjects/TestJasper/src/Reporte/report1.jasper", 
            "C:/Users/S1NW-A3/Documents", 
            "pdf", 
            "MesJul");
    
    
       
        
        
        
        
        
        
    }
    
    
    
    
}
