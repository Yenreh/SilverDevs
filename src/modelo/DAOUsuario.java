package modelo;

public class DAOUsuario extends Usuario{
    controlador.ControladorConectarDB objConecta;
    
    public DAOUsuario(){
        objConecta = new controlador.ControladorConectarDB();
    }
    
    public boolean valide(){
        String SQL ="SELECT loginU, contrasenna FROM Usuario where loginU='"+ super.getNombreU()+"' and contrasenna='"+ super.getContrasena()+"'";
        if(objConecta.validar(SQL)==false){
            return false;
        }else{
            return true;
        }
    }
}
