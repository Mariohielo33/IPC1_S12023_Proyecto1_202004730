/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.util.ArrayList;
import proyecto1.elementos.compracod;
import proyecto1.elementos.cotizacioncod;

/**
 *
 * @author Pedro
 */
public class enviossolittab extends javax.swing.JPanel {

    private String datooo;
    
    public void setDatosf(String datooo){
        this.datooo = datooo;
    }
    public enviossolittab() {
        initComponents();
    }

public void obtenercoti1(){
        for(int f=0; f<listacotizacion.size();f++){
        cotizacioncod temporalf = new cotizacioncod();
        temporalf = listacotizacion.get(f);
        if (temporalf.getNombreusuario().equals(datooo)){

//                    jComboBox1.addItem(temporalu.getCodigo()+"");            
//        datoanterior=temporalu.getTotalcot();
        }

        
    }
}

    public void setTextArea(String texto){
        jTextPane1.setText(texto);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        jTextPane1.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("Envios solicitados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addGap(276, 322, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    static ArrayList <cotizacioncod> listacotizacion = new ArrayList <cotizacioncod>();
    static ArrayList <compracod> listacompras = new ArrayList <compracod>();
    
      public void setListacoti(ArrayList <cotizacioncod> listacotizacion){
        this.listacotizacion=listacotizacion;
    }
        public void setListacomp(ArrayList <compracod> listacompras){
        this.listacompras=listacompras;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
