package controlador;

import java.sql.*;
public class ControladorConectarDB {
    
    java.sql.Connection con; //para cargarel Driver  de  JDBC para postgresql 
    java.sql.Statement st; //para conectarse con el motor de DB 
    java.sql.ResultSet res; //procesar las consultas (informacion)
    
    
    public ControladorConectarDB(){
        //Este constructor sera usado para establecer la conexion con la base de datos
        try{
            try{
                Class.forName("org.postgresql.Driver"); //cargar el driver  
                System.out.println("Driver correcto");
                
            }catch(ClassNotFoundException ex){
                System.out.println("ERROR CARGAANDO");
            }
            
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SilverStoreManagerDB", "postgres"," ");
        }catch(SQLException ex){
            System.out.println("No se pudo conectar");
        }
        
    }
    
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado = null;
        try{
            st=con.createStatement(); // se conectacon el motor
            hoja_resultado = st.executeQuery(sql);
            if(hoja_resultado.next()){// si los datos  estan en la DB
                return true;
            }else{//el registro no esta en la DB
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error consultando: "+ e.toString());
            return false;
        }
    }
}
