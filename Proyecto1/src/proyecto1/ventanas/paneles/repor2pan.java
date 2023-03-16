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
public class repor2pan extends javax.swing.JPanel {
private double conpaquetes=0;
    /**
     * Creates new form repor2pan
     */
    public repor2pan() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Número total de paquetes enviados");

        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcular();
        jTextPane1.setText(conpaquetes+"");
        conpaquetes=0;
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setTextArea2(String texto){
        jTextPane1.setText(texto);
        
    }
    
    public void calcular(){
        
            for(int it=0; it<listacompras.size();it++){
            compracod compraa = new compracod();
            compraa = listacompras.get(it);
            for (int yu = 0; yu <listacotizacion.size() ; yu++) {
               cotizacioncod temporayi = new cotizacioncod();
            temporayi = listacotizacion.get(yu);  
                if (temporayi.getCodigo()==compraa.getPaqcod()) {
                    conpaquetes=conpaquetes+temporayi.getNumpaquetes();
                }
            }           
                }
                
    }
    
  public void setListcoot(ArrayList <cotizacioncod> listacotizacion){
        this.listacotizacion=listacotizacion;
    }
public void setListcoomp(ArrayList <compracod> listacompras){
        this.listacompras=listacompras;
    }
    static ArrayList <cotizacioncod> listacotizacion = new ArrayList <cotizacioncod>();
    static ArrayList <compracod> listacompras = new ArrayList <compracod>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
