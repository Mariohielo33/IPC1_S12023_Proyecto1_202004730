/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class cotizacioncod {
    private String nombreusuario;
    private String deporigen;
    private String muniorigen;
    private String depdestino;
    private String munidestino;
    private String dir1;
    private String dir2;
    private double numpaquetes;
    private String tamanpaquetes;
    private double tampaq;
    private String tipservicio;
    private double tipserv;
    private double totalcot;
    private int codigo;
    public cotizacioncod() {
    }

    public cotizacioncod(String nombreusuario, String deporigen, String muniorigen, String depdestino, String munidestino, String dir1, String dir2, double numpaquetes, String tamanpaquetes, double tampaq, String tipservicio, double tipserv, double totalcot, int codigo) {
        this.nombreusuario = nombreusuario;
        this.deporigen = deporigen;
        this.muniorigen = muniorigen;
        this.depdestino = depdestino;
        this.munidestino = munidestino;
        this.dir1 = dir1;
        this.dir2 = dir2;
        this.numpaquetes = numpaquetes;
        this.tamanpaquetes = tamanpaquetes;
        this.tampaq = tampaq;
        this.tipservicio = tipservicio;
        this.tipserv = tipserv;
        this.totalcot=totalcot;
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public void setTotalcot(double totalcot) {
        this.totalcot = totalcot;
    }

    public double getTotalcot() {
        return totalcot;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getDeporigen() {
        return deporigen;
    }

    public String getMuniorigen() {
        return muniorigen;
    }

    public String getDepdestino() {
        return depdestino;
    }

    public String getMunidestino() {
        return munidestino;
    }

    public String getDir1() {
        return dir1;
    }

    public String getDir2() {
        return dir2;
    }

    public double getNumpaquetes() {
        return numpaquetes;
    }

    public String getTamanpaquetes() {
        return tamanpaquetes;
    }

    public double getTampaq() {
        return tampaq;
    }

    public String getTipservicio() {
        return tipservicio;
    }

    public double getTipserv() {
        return tipserv;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setDeporigen(String deporigen) {
        this.deporigen = deporigen;
    }

    public void setMuniorigen(String muniorigen) {
        this.muniorigen = muniorigen;
    }

    public void setDepdestino(String depdestino) {
        this.depdestino = depdestino;
    }

    public void setMunidestino(String munidestino) {
        this.munidestino = munidestino;
    }

    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }

    public void setDir2(String dir2) {
        this.dir2 = dir2;
    }

    public void setNumpaquetes(double numpaquetes) {
        this.numpaquetes = numpaquetes;
    }

    public void setTamanpaquetes(String tamanpaquetes) {
        this.tamanpaquetes = tamanpaquetes;
    }

    public void setTampaq(double tampaq) {
        this.tampaq = tampaq;
    }

    public void setTipservicio(String tipservicio) {
        this.tipservicio = tipservicio;
    }

    public void setTipserv(double tipserv) {
        this.tipserv = tipserv;
    }
    
    
    
}
