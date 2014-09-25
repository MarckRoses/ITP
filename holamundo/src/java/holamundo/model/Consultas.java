/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holamundo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author S1NW-A3
 */
public class Consultas extends Conexion{
    

    public ResultSet getdatos() throws SQLException
    {
        String query = "select * from Empleados";  
        ResultSet rs = null;
        Statement st = con.createStatement();
        rs = st.executeQuery(query);
        
        return rs;

    }
    
    public boolean Autenticacion(String usuario,String contraseña) throws SQLException
    {
        boolean opt = false;
        
         String query = "select * from Empleados";  
        ResultSet rs = null;
        Statement st = con.createStatement();
        rs = st.executeQuery(query);
       
        while(rs.next())
        {
            if(usuario.equals(rs.getString("usuario")) && contraseña.equals(rs.getString("contraseña")))
            return true;
        }
        
  
        return opt;
        
    }
    
    public void Insertar(String usuario,String password) throws SQLException
    {
          String query = "insert into empleados value (null,'"+usuario+"','"+password+"');";//consulta  
          Statement st = con.createStatement();//toma la conexion para ejecutar sql
          st.execute(query);//ejecuta la consulta

    }
    
    public void Delete(String nombre) throws SQLException
    {
          String query = "delete from empleados where usuario = '"+nombre+"';";//consulta  
          Statement st = con.createStatement();//toma la conexion para ejecutar sql
          st.execute(query);//ejecuta la consulta

    }
    
    
    public static void main(String args[]) throws SQLException
    {
        Consultas con = new Consultas();
        System.out.println(con.Autenticacion("David", "123456"));
        //con.Insertar("Karina", "789");
        
        con.Delete("Karina");
    }
    
    
    
}

