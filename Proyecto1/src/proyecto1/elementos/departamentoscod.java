/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class departamentoscod {
    
    private String codreg;
    private String nregion;
    private String ndepto;
    private String coddept;

    public departamentoscod() {
      codreg="";  
      nregion="";  
      ndepto="";  
      coddept="";  
    }

    public departamentoscod(String codreg, String nregion, String ndepto, String coddept) {
        this.codreg = codreg;
        this.nregion = nregion;
        this.ndepto = ndepto;
        this.coddept = coddept;
    }

    public String getCodreg() {
        return codreg;
    }

    public String getNregion() {
        return nregion;
    }

    public String getNdepto() {
        return ndepto;
    }
    
     public String getCoddept() {
        return coddept;
    }

    public void setCodreg(String codreg) {
        this.codreg = codreg;
    }

    public void setNregion(String nregion) {
        this.nregion = nregion;
    }

    public void setNdepto(String ndepto) {
        this.ndepto = ndepto;
    }
    public void setCoddept(String coddept) {
        this.coddept = coddept;
    }
    
    
}

