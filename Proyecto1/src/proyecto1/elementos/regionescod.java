/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class regionescod {
    
    private String codreg;
    private String nombrereg;
    private double precioest;
    private double precioesp;
    
    
    public regionescod(){
        codreg="";
        nombrereg="";
        precioest=0.00;
        precioesp=0.00;       
    }
    
    public regionescod(String codreg, String nombrereg, double precioest, double precioesp){
        this.codreg = codreg;
        this.nombrereg=nombrereg;
        this.precioest=precioest;
        this.precioesp=precioesp;               
    }
    
    public String getCodreg(){
        return codreg;
    }
    public void setCodreg(String codreg){
        this.codreg = codreg;
    }
    
    public String getnombrereg(){
        return nombrereg;
    }
    public void setnombrereg(String nombrereg){
        this.nombrereg = nombrereg;
    }
    public double getprecioest(){
        return precioest;
    }
    
    public void setprecioest(double precioest){
        this.precioest = precioest;
    }
    
    public double getprecioesp(){
        return precioesp;
    }
    
    public void setprecioesp(double precioesp){
        this.precioesp = precioesp;
    }
}
