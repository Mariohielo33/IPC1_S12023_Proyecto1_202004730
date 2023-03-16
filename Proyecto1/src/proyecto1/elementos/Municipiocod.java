/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class Municipiocod {
    private String CodDeptt;
    private String Nmunicipio;

    public Municipiocod() {
    }

    public Municipiocod(String CodDeptt, String Nmunicipio) {
        this.CodDeptt = CodDeptt;
        this.Nmunicipio = Nmunicipio;
    }

    public String getCodDeptt() {
        return CodDeptt;
    }

    public String getNmunicipio() {
        return Nmunicipio;
    }

    public void setCodDeptt(String CodDeptt) {
        this.CodDeptt = CodDeptt;
    }

    public void setNmunicipio(String Nmunicipio) {
        this.Nmunicipio = Nmunicipio;
    }
    
    
}
