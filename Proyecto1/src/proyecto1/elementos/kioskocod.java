/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class kioskocod {
    
    private String codkiosko;
    private String nkiosko;
    private String codregion;
    private String deptokiosko;
    private String munikiosko;

    public kioskocod() {
    }

    public kioskocod(String codkiosko, String nkiosko, String codregion, String deptokiosko, String munikiosko) {
        this.codkiosko = codkiosko;
        this.nkiosko = nkiosko;
        this.codregion = codregion;
        this.deptokiosko=deptokiosko;
        this.munikiosko=munikiosko;
    }

    public void setDeptokiosko(String deptokiosko) {
        this.deptokiosko = deptokiosko;
    }

    public void setMunikiosko(String munikiosko) {
        this.munikiosko = munikiosko;
    }

    public String getDeptokiosko() {
        return deptokiosko;
    }

    public String getMunikiosko() {
        return munikiosko;
    }

    public String getCodkiosko() {
        return codkiosko;
    }

    public String getNkiosko() {
        return nkiosko;
    }

    public String getCodregion() {
        return codregion;
    }

    public void setCodkiosko(String codkiosko) {
        this.codkiosko = codkiosko;
    }

    public void setNkiosko(String nkiosko) {
        this.nkiosko = nkiosko;
    }

    public void setCodregion(String codregion) {
        this.codregion = codregion;
    }
    
}
