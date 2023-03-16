/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.elementos;

/**
 *
 * @author Pedro
 */
public class registrocod {
    private String Correo;
    private String Nombre;
    private String Apellido;
    private String contra;
    private String dpi;
    private String fecha;
    private String genero;
    private String nacionalidad;
    private String sobrenombre;
    private String telefono;
    private String rol;
    private String rutaFoto;
    private String ynkiosko;
    
    public registrocod(){
        Correo ="";
        Nombre="";
        Apellido="";
        contra="";
        dpi="";
        fecha="";
        genero="";
        nacionalidad="";
        sobrenombre="";
        telefono="";
        rol="";
        rutaFoto="";
        ynkiosko="";
    }
    public registrocod(String Correo, String Nombre, String Apellido, String contra, String dpi, String fecha, String genero, String nacionalidad, String sobrenombre, String telefono, String rol, String rutaFoto, String ynkiosko){
      this.Correo=Correo;
      this.Nombre=Nombre;
      this.Apellido=Apellido;
      this.contra=contra;
      this.dpi=dpi;
      this.fecha=fecha;
      this.genero=genero;
      this.nacionalidad=nacionalidad;
      this.sobrenombre=sobrenombre;
      this.telefono=telefono;
      this.rol=rol;
      this.rutaFoto = rutaFoto;
      this.ynkiosko = ynkiosko;
  
    }
    
     public String getCorreo(){
        return Correo;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getcontra(){
        return contra;
    }
    public String getdpi(){
        return dpi;
    }
    public String getfecha(){
        return fecha;
    }
    public String getgenero(){
        return genero;
    }
    public String getnacionalidad(){
        return nacionalidad;
    }
    public String getsobrenombre(){
        return sobrenombre;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getrol(){
        return rol;
    }
    public String getrutaFoto(){
        return rutaFoto;
    }
    public String getynkiosko(){
        return ynkiosko;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public void setYnkiosko(String ynkiosko) {
        this.ynkiosko = ynkiosko;
    }
    
    
}

