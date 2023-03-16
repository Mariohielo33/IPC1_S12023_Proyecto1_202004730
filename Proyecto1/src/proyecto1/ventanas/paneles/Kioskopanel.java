/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto1.elementos.Municipiocod;
import proyecto1.elementos.departamentoscod;
import proyecto1.elementos.kioskocod;

/**
 *
 * @author Pedro
 */
public class Kioskopanel extends javax.swing.JPanel {
private String cood="";
    /**
     * Creates new form Kioskopanel
     */
    public Kioskopanel() {
        initComponents();
    }


 
    public boolean verikio(){
           for(int vvr =0;vvr<listakioskos.size();vvr++){
        kioskocod tempoki = new kioskocod();
        tempoki=listakioskos.get(vvr);
        if (tempoki.getNkiosko().equals(Nkiostext.getText())) {
          JOptionPane.showMessageDialog(null, "El nombre del kiosko ya ha sido registrado","Error", JOptionPane.WARNING_MESSAGE);
            return true;  
        }         
  }
    return false;  
    }
    
    
 
    public boolean verikioc(){
       for(int vvc =0;vvc<listakioskos.size();vvc++){
        kioskocod tempokic = new kioskocod();
        tempokic=listakioskos.get(vvc);
        if (tempokic.getCodkiosko().equals(codkiostext.getText())) {
          JOptionPane.showMessageDialog(null, "El codigo del kiosko ya ha sido registrado","Error", JOptionPane.WARNING_MESSAGE);
            return true;  
        }         
  }
    return false;  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codkiostext = new javax.swing.JTextField();
        Nkiostext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        depcombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        municombo = new javax.swing.JComboBox<>();
        mdepto = new javax.swing.JButton();
        mmun = new javax.swing.JButton();

        jLabel1.setText("Registro de kioskos");

        jLabel2.setText("Codigo de Kisko");

        jLabel3.setText("Nombre del kiosko");

        jLabel4.setText("Codigo de la region");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M)", "(NT)", "(NO)", "(SO)", "(SOC)", "(NOC)" }));

        jLabel5.setText("Departamento");

        jLabel6.setText("Municipio");

        mdepto.setText("Mostrar depto");
        mdepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdeptoActionPerformed(evt);
            }
        });

        mmun.setText("Mostar municipio");
        mmun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(municombo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(mmun))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(depcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mdepto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(Nkiostext))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(34, 34, 34)
                                    .addComponent(codkiostext, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codkiostext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nkiostext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(mdepto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(municombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mmun))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(codkiostext.getText().isEmpty() && Nkiostext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
        }else if (!verikioc()&& !verikio()) {
    listakioskos.add(new kioskocod(codkiostext.getText(), Nkiostext.getText(), (String) jComboBox1.getSelectedItem(), (String) depcombo.getSelectedItem(), (String) municombo.getSelectedItem()));
    JOptionPane.showMessageDialog(null, "Dato anadido exitosamente","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            for(int i =0;i<listakioskos.size();i++){
            kioskocod temporal = new kioskocod();
            temporal=listakioskos.get(i);
            System.out.println(temporal.getCodkiosko()+" "+temporal.getNkiosko()+" "+temporal.getCodregion());
        } 
}
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mdeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdeptoActionPerformed
        depcombo.removeAllItems();
        for (int uu = 0; uu < listadeptos.size(); uu++) {
                departamentoscod temporal67 = new departamentoscod();
                temporal67=listadeptos.get(uu);
                if (temporal67.getCodreg().equals(jComboBox1.getSelectedItem())) {
                depcombo.addItem(temporal67.getNdepto());
                cood=temporal67.getCoddept();
            }

        }
    }//GEN-LAST:event_mdeptoActionPerformed

    private void mmunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmunActionPerformed
        municombo.removeAllItems();
        for(int z=0; z<listamunicipios.size();z++){
            Municipiocod temporal3 = new Municipiocod();
            temporal3 = listamunicipios.get(z);

            System.out.println(temporal3.getCodDeptt());
//            System.out.println(cood);
            if (temporal3.getCodDeptt().equals(cood)) {
                municombo.addItem(temporal3.getNmunicipio());
            }
                        
        } 
        
    }//GEN-LAST:event_mmunActionPerformed
static ArrayList <kioskocod> listakioskos = new ArrayList <kioskocod>();
static ArrayList <departamentoscod> listadeptos = new ArrayList <departamentoscod>();
static ArrayList <Municipiocod> listamunicipios = new ArrayList <Municipiocod>();

 public void setListaDeptos2(ArrayList <departamentoscod> listadeptos){
        this.listadeptos=listadeptos;
    }
  public void setListaDeptos3(ArrayList <Municipiocod> listamunicipios){
        this.listamunicipios=listamunicipios;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nkiostext;
    private javax.swing.JTextField codkiostext;
    private javax.swing.JComboBox<String> depcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton mdepto;
    private javax.swing.JButton mmun;
    private javax.swing.JComboBox<String> municombo;
    // End of variables declaration//GEN-END:variables
public ArrayList<kioskocod> getkioskocod() {
        return listakioskos;
    }
}
