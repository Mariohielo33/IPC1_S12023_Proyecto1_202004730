/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto1.elementos.departamentoscod;
import proyecto1.elementos.regionescod;

/**
 *
 * @author Pedro
 */
public class departpanel extends javax.swing.JPanel {

//    public void Depquemados(){
//        listadeptos.add(new departamentoscod("(M)","Metropolitana","Guatemala","1001"));
//        listadeptos.add(new departamentoscod("(NT)","Norte","Chiquimula","1002"));
//        listadeptos.add(new departamentoscod("(NO)","Nororiente","Zacapa","1003"));
//        listadeptos.add(new departamentoscod("(SO)","Suroriente","Jutiapa","1004"));
//        listadeptos.add(new departamentoscod("(SOC)","Suroccidente","Quetzaltenango","1005"));
//        listadeptos.add(new departamentoscod("(NOC)","Noroccidente","Quiche","1006"));
//    }
    
    regionescod Metropolitana = new regionescod();
    regionescod Norte = new regionescod();
    regionescod Nororiente = new regionescod();
    regionescod Suroriente = new regionescod();
    regionescod Suroccidente = new regionescod();
    regionescod Noroccidente = new regionescod();

    /**
     * Creates new form departpanel
     */
    public departpanel() {
        initComponents();
        listadeptos.add(new departamentoscod("(M)","Metropolitana","Guatemala","1001"));
        listadeptos.add(new departamentoscod("(NT)","Norte","Chiquimula","1002"));
        listadeptos.add(new departamentoscod("(NO)","Nororiente","Zacapa","1003"));
        listadeptos.add(new departamentoscod("(SO)","Suroriente","Jutiapa","1004"));
        listadeptos.add(new departamentoscod("(SOC)","Suroccidente","Quetzaltenango","1005"));
        listadeptos.add(new departamentoscod("(NOC)","Noroccidente","Quiche","1006"));

    }
    
    public boolean veridep(){

        for(int verid =0;verid<listadeptos.size();verid++){
        departamentoscod tempodep = new departamentoscod();
        tempodep=listadeptos.get(verid);
        if (tempodep.getNdepto().equals(Depttext.getText())) {
            JOptionPane.showMessageDialog(null, "El departamento ya ha sido ingresado","Error", JOptionPane.WARNING_MESSAGE);
           return true; 
        }       
        }return false; 
    }
        public boolean veridepcod(){

        for(int vc =0;vc<listadeptos.size();vc++){
        departamentoscod tempodepc = new departamentoscod();
        tempodepc=listadeptos.get(vc);
        if (tempodepc.getCoddept().equals(coddeptext.getText())) {
            JOptionPane.showMessageDialog(null, "El codigo ya ha sido ingresado","Error", JOptionPane.WARNING_MESSAGE);
           return true; 
        }       
        }return false; 
    }


    public void setRegiones(regionescod Metropolitana, regionescod Norte, regionescod Nororiente, regionescod Suroriente, regionescod Suroccidente, regionescod Noroccidente){
       this.Metropolitana=Metropolitana;
        this.Norte = Norte; 
        this.Nororiente = Nororiente;
        this.Suroriente = Suroriente;
        this.Suroccidente = Suroccidente;
        this.Noroccidente = Noroccidente;
        
    }
    public regionescod getMetropolitana() {
        return Metropolitana;
    }

    public regionescod getNorte() {
        return Norte;
    }

    public regionescod getNororiente() {
        return Nororiente;
    }

    public regionescod getSuroriente() {
        return Suroriente;
    }

    public regionescod getSuroccidente() {
        return Suroccidente;
    }

    public regionescod getNoroccidente() {
        return Noroccidente;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Codtext = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        regtext = new javax.swing.JTextField();
        Depttext = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        coddeptext = new javax.swing.JTextField();

        jLabel1.setText("Region");

        Codtext.setText("Codigo Region");

        jLabel3.setText("Departamento");

        jButton1.setText("Mostrar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metropolitana", "Norte", "Nororiente", "Suroriente", "Suroccidente", "Noroccidente" }));

        regtext.setEnabled(false);

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo departamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coddeptext))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Codtext, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regtext, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(Depttext)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codtext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Depttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(coddeptext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               String opcion = jComboBox1.getSelectedItem().toString();
        switch(opcion){
            case  "Metropolitana":{
            regtext.setText(Metropolitana.getCodreg()+"");
            break;}
           case  "Norte":{
              regtext.setText(Norte.getCodreg());  
           break;}
            case "Nororiente":{
                regtext.setText(Nororiente.getCodreg());
            break;}
            case "Suroriente":{
                regtext.setText(Suroriente.getCodreg());
            break;}
            case "Suroccidente":{
                regtext.setText(Suroccidente.getCodreg());
            break;}
            case "Noroccidente": {   
              regtext.setText(Noroccidente.getCodreg());
            break;}           
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Depttext.getText().isEmpty() && coddeptext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
        }else if (!veridepcod()&&!veridep()) {
            listadeptos.add(new departamentoscod(regtext.getText(),(String) jComboBox1.getSelectedItem(),Depttext.getText(),coddeptext.getText()));
            JOptionPane.showMessageDialog(null, "Dato anadido exitosamente","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            for(int i =0;i<listadeptos.size();i++){
            departamentoscod temporal = new departamentoscod();
            temporal=listadeptos.get(i);
            System.out.println(temporal.getCodreg()+" "+temporal.getNregion()+" "+temporal.getNdepto()+" "+temporal.getCoddept());
            } 

        }
    }//GEN-LAST:event_jButton2ActionPerformed

static ArrayList <departamentoscod> listadeptos = new ArrayList <departamentoscod>();

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codtext;
    private javax.swing.JTextField Depttext;
    private javax.swing.JTextField coddeptext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField regtext;
    // End of variables declaration//GEN-END:variables
public ArrayList<departamentoscod> getdeptoscod() {
        return listadeptos;
    }
}
