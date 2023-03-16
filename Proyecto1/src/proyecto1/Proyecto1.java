/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.util.ArrayList;
import proyecto1.elementos.Municipiocod;
import proyecto1.elementos.compracod;
import proyecto1.elementos.cotizacioncod;
import proyecto1.elementos.departamentoscod;
import proyecto1.elementos.facturacioncod;
import proyecto1.elementos.kioskocod;
import proyecto1.elementos.regionescod;
import proyecto1.elementos.registrocod;
import proyecto1.elementos.tarjetacod;
import proyecto1.ventanas.ventana;


/**
 *
 * @author Pedro
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList <registrocod> listadatos = new ArrayList <registrocod>();
    static ArrayList <regionescod> listaregiones = new ArrayList <regionescod>();
    static ArrayList <departamentoscod> listadeptos = new ArrayList <departamentoscod>();
    static ArrayList <Municipiocod> listamunicipios = new ArrayList <Municipiocod>();
    static ArrayList <kioskocod> listakioskos = new ArrayList <kioskocod>();
    static ArrayList <tarjetacod> listatarjetas = new ArrayList <tarjetacod>();
    static ArrayList <facturacioncod> listafacturacion = new ArrayList <facturacioncod>();
    static ArrayList <cotizacioncod> listacotizacion = new ArrayList <cotizacioncod>();
    static ArrayList <compracod> listacompras = new ArrayList <compracod>();
    
    
    
    public static void main(String[] args) {
        ventana v = new ventana();
        v.setVisible(true);
        
    }
    
}
