/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto1.elementos.Municipiocod;
import proyecto1.elementos.departamentoscod;

/**
 *
 * @author Pedro
 */
public class Municipiopanel extends javax.swing.JPanel {
//private departpanel deptotab = new departpanel();

    /**
     * Creates new form Municipiopanel
     */
    public Municipiopanel() {
        initComponents();

        listamunicipios.add(new Municipiocod("1001","Guatemala"));
        listamunicipios.add(new Municipiocod("1001","Santa Catarina Pinula"));
        listamunicipios.add(new Municipiocod("1001","San Jose Pinula"));
        listamunicipios.add(new Municipiocod("1001","San Jose del Golfo"));
        listamunicipios.add(new Municipiocod("1001","Palencia"));
        listamunicipios.add(new Municipiocod("1002","Chiquimula"));
        listamunicipios.add(new Municipiocod("1002","San Jose La Arada"));
        listamunicipios.add(new Municipiocod("1002","San Juan Hermita"));
        listamunicipios.add(new Municipiocod("1002","Jocotan"));
        listamunicipios.add(new Municipiocod("1002","Camotan"));
        listamunicipios.add(new Municipiocod("1003","Zacapa"));
        listamunicipios.add(new Municipiocod("1003","Estanzuela"));
        listamunicipios.add(new Municipiocod("1003","Rio Hondo"));
        listamunicipios.add(new Municipiocod("1003","Gualan"));
        listamunicipios.add(new Municipiocod("1003","Teculutan"));
        listamunicipios.add(new Municipiocod("1004","Jutiapa"));
        listamunicipios.add(new Municipiocod("1004","El Progreso"));
        listamunicipios.add(new Municipiocod("1004","Santa Catarina Mita"));
        listamunicipios.add(new Municipiocod("1004","Agua Blanca"));
        listamunicipios.add(new Municipiocod("1004","Asusncion Mita"));
        listamunicipios.add(new Municipiocod("1005","Quetzaltenango"));
        listamunicipios.add(new Municipiocod("1005","Salcaja"));
        listamunicipios.add(new Municipiocod("1005","Olintepeque"));
        listamunicipios.add(new Municipiocod("1005","San Carlos Sija"));
        listamunicipios.add(new Municipiocod("1005","Sibilia"));
        listamunicipios.add(new Municipiocod("1006","Santa Cruz del Quiche"));
        listamunicipios.add(new Municipiocod("1006","Chiche"));
        listamunicipios.add(new Municipiocod("1006","Chinique"));
        listamunicipios.add(new Municipiocod("1006","Zacualpa"));
        listamunicipios.add(new Municipiocod("1006","Chajul"));
        
       
    }

     public void crearListaDesplegable(){
        jComboBox1.removeAllItems();
        for(int x=0; x<listadeptos.size();x++){
            departamentoscod temporal10 = new departamentoscod();
            temporal10 = listadeptos.get(x);
            //textoProductos = textoProductos+"Producto: "+temporal.getNombre()+" -> Precio: "+temporal.getPrecio()+'\n';
            jComboBox1.addItem(temporal10.getCoddept());            
//            System.out.println(temporal10.getCoddept());
            System.out.println(listadeptos.size());
        }        
    }
     
     public boolean verimun(){
         for(int vm =0;vm<listamunicipios.size();vm++){
        Municipiocod tempomu = new Municipiocod();
        tempomu=listamunicipios.get(vm);
        if (tempomu.getNmunicipio().equals(jTextField1.getText())) {
            JOptionPane.showMessageDialog(null, "El municipio ya ha sido agregado anteriormente","Error", JOptionPane.WARNING_MESSAGE);
           return true; 
        }       
        }return false; 
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Codigo de departamento");

        jLabel2.setText("Nombre del municipio");

        jButton1.setText("Agregar");
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 131, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
        }else if (!verimun()) {          
            listamunicipios.add(new Municipiocod((String) jComboBox1.getSelectedItem(), jTextField1.getText()) );
            JOptionPane.showMessageDialog(null, "Dato anadido exitosamente","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            for(int i =0;i<listamunicipios.size();i++){
            Municipiocod temporal = new Municipiocod();
            temporal=listamunicipios.get(i);
            System.out.println(temporal.getCodDeptt()+" "+temporal.getNmunicipio());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 public void setListaDeptos(ArrayList <departamentoscod> listadeptos){
        this.listadeptos=listadeptos;
    }
    
static   ArrayList <departamentoscod> listadeptos = new ArrayList <departamentoscod>();
static ArrayList <Municipiocod> listamunicipios = new ArrayList <Municipiocod>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public ArrayList<Municipiocod> getMunicipiocod() {
        return listamunicipios;
    }
}
