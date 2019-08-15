package modelo;

public class Persona {
    protected String nombreP;
    protected String apellidoP;
    protected String cedulaP;
    protected String telP;
    protected String dirP;

    public Persona() {
    }

    public Persona(String nombreP, String apellidoP, String cedulaP, String telP, String dirP) {
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.cedulaP = cedulaP;
        this.telP = telP;
        this.dirP = dirP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    public String getTelP() {
        return telP;
    }

    public void setTelP(String telP) {
        this.telP = telP;
    }

    public String getDirP() {
        return dirP;
    }

    public void setDirP(String dirP) {
        this.dirP = dirP;
    }
    
    
}