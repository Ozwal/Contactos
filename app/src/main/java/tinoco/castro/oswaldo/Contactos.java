package tinoco.castro.oswaldo;

import java.io.Serializable;

public class Contactos implements Serializable {
    private String usuario;
    private String email;
    private String twitter;
    private String telefono;
    private String fecha_nac;

    public Contactos(String usuario, String email, String twitter, String telefono, String fecha_nac){
        this.usuario=usuario;
        this.email=email;
        this.twitter=twitter;
        this.telefono=telefono;
        this.fecha_nac=fecha_nac;
    }

    public String mensaje(){
        return this.usuario + "\n" + this.email;
    }
}
