
package modelo;

public class Usuario {
    private String nombreU;
    private String contrasena;
    private double sueldo; 

    public Usuario() {
    }

    public Usuario(String nombreU, String contrasena, double sueldo) {
        this.nombreU = nombreU;
        this.contrasena = contrasena;
        this.sueldo = sueldo;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
