/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto1.elementos.compracod;
import proyecto1.elementos.cotizacioncod;
import proyecto1.elementos.facturacioncod;
import proyecto1.elementos.tarjetacod;

/**
 *
 * @author Pedro
 */
public class comprapanel extends javax.swing.JPanel {
private double recargoo=0.00;
private String tippagoo="";
private String datoo1;
private double datoanterior= 0.00;

    public void setDatos0(String datoo1){
        this.datoo1 = datoo1;
    }
    
    public comprapanel() {
        initComponents();
    }

public void crearListaDesplegablec1(){
    jComboBox1.removeAllItems();
    for(int u=0; u<listacotizacion.size();u++){
        cotizacioncod temporalu = new cotizacioncod();
        temporalu = listacotizacion.get(u);
        if (temporalu.getNombreusuario().equals(datoo1)){
                    jComboBox1.addItem(temporalu.getCodigo()+"");            
        datoanterior=temporalu.getTotalcot();
        }

        
    }
}

public void crearListaDesplegablec2(){
    combotarjeta.removeAllItems();
    for(int m=0; m<listatarjetas.size();m++){
        tarjetacod temporalm = new tarjetacod();
        temporalm = listatarjetas.get(m);
        if (temporalm.getUsuarioact().equals(datoo1)) {
           combotarjeta.addItem(temporalm.getNumerotarjet()+"");  
//String forvalues = temporalm.getNumerotarjet();
//String lastFourChars = "";  
//
//if (forvalues.length() > 4) {
//    lastFourChars = forvalues.substring(forvalues.length() - 4);
//} else {
//    lastFourChars = forvalues;
//}
        }
                   

    }
}
public void crearListaDesplegablec3(){
    jComboBox2.removeAllItems();
    for(int o=0; o<listafacturacion.size();o++){
        facturacioncod temporalo = new facturacioncod();
        temporalo = listafacturacion.get(o);
        if (temporalo.getUsuario().equals(datoo1)){
        jComboBox2.addItem(temporalo.getNombrecompl()+" Direccion: " + temporalo.getDirecc()+" NIT: " + temporalo.getNITT());            
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        combotarjeta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cvvcuadro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechatext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("Paquete de cotizacion");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de pago");

        grupo1.add(jRadioButton1);
        jRadioButton1.setText("Pago contraentrega");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        grupo1.add(jRadioButton2);
        jRadioButton2.setText("Pago con tarjeta");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cobro adicional de Q5.00");

        jLabel4.setText("Pago con tarjeta de credito/debito");

        jLabel5.setText("Datos de facturacion");

        jButton1.setText("Realizar pago y envio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combotarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotarjetaActionPerformed(evt);
            }
        });

        jLabel6.setText("No. tarjeta");

        jLabel7.setText("CVV");

        jLabel8.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addGap(28, 466, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                .addComponent(jLabel7))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(fechatext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combotarjeta, 0, 130, Short.MAX_VALUE)
                                    .addComponent(cvvcuadro)))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel6)
                    .addComponent(combotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cvvcuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       combotarjeta.setVisible(true);
       cvvcuadro.setVisible(true);
       recargoo=0.00;
       tippagoo="Pago con tarjeta";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       combotarjeta.setVisible(false);
       cvvcuadro.setVisible(false);
       recargoo=5.00;
       tippagoo="Pago contraentrega";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fechatext.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
        }else if(fechatext.getText().isEmpty()&& jRadioButton1.isEnabled() && !jRadioButton2.isEnabled()){
 JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
}else if (jRadioButton2.isEnabled() && cvvcuadro.getText().isEmpty()&&fechatext.getText().isEmpty() && !jRadioButton1.isEnabled()) {
         JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);   
        }else{
    double totalQq=recargoo+datoanterior;
    
        listacompras.add(new compracod(datoo1,Integer.parseInt((String) jComboBox1.getSelectedItem()),tippagoo,recargoo,(String) combotarjeta.getSelectedItem(), cvvcuadro.getText(),(String) jComboBox2.getSelectedItem(), totalQq, "",fechatext.getText() ));
        JOptionPane.showMessageDialog(null, "Dato anadido exitosamente","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            for(int y =0;y<listacompras.size();y++){
            compracod tempor6 = new compracod();
            tempor6=listacompras.get(y);
//            System.out.println(tempora6.getNombreusuario()+" "+tempora6.getDeporigen()+" "+tempora6.getMuniorigen()+" "+tempora6.getDepdestino() +" "+tempora6.getMunidestino() +" "+tempora6.getDir1() +" "+tempora6.getDir2() +" "+tempora6.getNumpaquetes()+" "+tempora6.getTamanpaquetes()+" "+tempora6.getTampaq()+" "+tempora6.getTipservicio()+" "+tempora6.getTipserv()+" "+tempora6.getTotalcot()+" "+tempora6.getCodigo() );
            }
            tippagoo="";
            recargoo=0.00;
            totalQq=0.00;
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void combotarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotarjetaActionPerformed
        
    }//GEN-LAST:event_combotarjetaActionPerformed
static ArrayList <compracod> listacompras = new ArrayList <compracod>();
static ArrayList <cotizacioncod> listacotizacion = new ArrayList <cotizacioncod>();
static ArrayList <tarjetacod> listatarjetas = new ArrayList <tarjetacod>();
static ArrayList <facturacioncod> listafacturacion = new ArrayList <facturacioncod>();

public void setListacoti(ArrayList <cotizacioncod> listacotizacion){
        this.listacotizacion=listacotizacion;
    }
public void setListatarj(ArrayList <tarjetacod> listatarjetas){
        this.listatarjetas=listatarjetas;
    }
public void setListafactu(ArrayList <facturacioncod> listafacturacion){
        this.listafacturacion=listafacturacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combotarjeta;
    private javax.swing.JTextField cvvcuadro;
    private javax.swing.JTextField fechatext;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
public ArrayList<compracod> getcompracod() {
        return listacompras;
    }
}
