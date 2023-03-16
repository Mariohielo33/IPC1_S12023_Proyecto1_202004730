/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class facturacioncod {
    private String usuario;
    private String nombrecompl;
    private String direcc;
    private String NITT;

    public facturacioncod() {
    }

    public facturacioncod(String usuario, String nombrecompl, String direcc, String NITT) {
        this.usuario = usuario;
        this.nombrecompl = nombrecompl;
        this.direcc = direcc;
        this.NITT = NITT;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombrecompl() {
        return nombrecompl;
    }

    public String getDirecc() {
        return direcc;
    }

    public String getNITT() {
        return NITT;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setNombrecompl(String nombrecompl) {
        this.nombrecompl = nombrecompl;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public void setNITT(String NITT) {
        this.NITT = NITT;
    }
    
    
    
}
