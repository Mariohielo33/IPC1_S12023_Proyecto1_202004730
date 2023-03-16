/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class tarjetacod {
    private String usuarioact;
    private String Nombretarj;
    private String Numerotarjet;
    private String fechavenci;
    private String cvvte;

    public tarjetacod() {
    }

    public tarjetacod(String usuarioact, String Nombretarj, String Numerotarjet, String fechavenci,String cvvte) {
        this.usuarioact = usuarioact;
        this.Nombretarj = Nombretarj;
        this.Numerotarjet = Numerotarjet;
        this.fechavenci = fechavenci;
        this.cvvte=cvvte;
    }

    public String getCvvte() {
        return cvvte;
    }

    public void setCvvte(String cvvte) {
        this.cvvte = cvvte;
    }
    

    public String getUsuarioact() {
        return usuarioact;
    }

    public String getNombretarj() {
        return Nombretarj;
    }

    public String getNumerotarjet() {
        return Numerotarjet;
    }

    public String getFechavenci() {
        return fechavenci;
    }

    public void setUsuarioact(String usuarioact) {
        this.usuarioact = usuarioact;
    }

    public void setNombretarj(String Nombretarj) {
        this.Nombretarj = Nombretarj;
    }

    public void setNumerotarjet(String Numerotarjet) {
        this.Numerotarjet = Numerotarjet;
    }

    public void setFechavenci(String fechavenci) {
        this.fechavenci = fechavenci;
    }
    
    
}
