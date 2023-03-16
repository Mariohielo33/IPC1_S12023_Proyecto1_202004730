/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class compracod {
    private String nombreusuario;
    private int paqcod;
    private String tipodepago;
    private double recargoo;
    private String ntarj;
    private String cvvv;
    private String datosfactu;
    private double totalQQ;
    private String codigof;
    private String fecha;

    public compracod() {
    }

    public compracod(String nombreusuario, int paqcod, String tipodepago, double recargoo, String ntarj, String cvvv, String datosfactu, double totalQQ, String codigof, String fecha) {
        this.nombreusuario = nombreusuario;
        this.paqcod = paqcod;
        this.tipodepago = tipodepago;
        this.recargoo = recargoo;
        this.ntarj = ntarj;
        this.cvvv = cvvv;
        this.datosfactu = datosfactu;
        this.totalQQ = totalQQ;
        this.codigof = codigof;
        this.fecha = fecha;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public int getPaqcod() {
        return paqcod;
    }

    public String getTipodepago() {
        return tipodepago;
    }

    public double getRecargoo() {
        return recargoo;
    }

    public String getNtarj() {
        return ntarj;
    }

    public String getCvvv() {
        return cvvv;
    }

    public String getDatosfactu() {
        return datosfactu;
    }

    public double getTotalQQ() {
        return totalQQ;
    }

    public String getCodigof() {
        return codigof;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setPaqcod(int paqcod) {
        this.paqcod = paqcod;
    }

    public void setTipodepago(String tipodepago) {
        this.tipodepago = tipodepago;
    }

    public void setRecargoo(double recargoo) {
        this.recargoo = recargoo;
    }

    public void setNtarj(String ntarj) {
        this.ntarj = ntarj;
    }

    public void setCvvv(String cvvv) {
        this.cvvv = cvvv;
    }

    public void setDatosfactu(String datosfactu) {
        this.datosfactu = datosfactu;
    }

    public void setTotalQQ(double totalQQ) {
        this.totalQQ = totalQQ;
    }

    public void setCodigof(String codigof) {
        this.codigof = codigof;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
