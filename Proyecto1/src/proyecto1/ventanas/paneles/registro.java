/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto1.elementos.kioskocod;
import proyecto1.elementos.registrocod;


/**
 *
 * @author Pedro
 */
public class registro extends javax.swing.JPanel {
private Kioskopanel kiostab = new Kioskopanel();
 private String rutaFoto;
//public String comproba;
    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
        listadatos.add(new registrocod("ipc1_202004730@ipc1delivery.com","admin","admin","202004730", "Admin", "Admin", "Admin", "Admin", "Admin", "Admin", "Admin","Admin", "Admin"));
        jComboBox1.setVisible(false);
    }

      public void crearListaDesplegable4(){
        jComboBox1.removeAllItems();
        for(int a=0; a<listakioskos.size();a++){
            kioskocod temporal4 = new kioskocod();
            temporal4 = listakioskos.get(a);
            jComboBox1.addItem(temporal4.getNkiosko());            
        }        
    }

public boolean vericorreo(){
    for(int io =0;io<listadatos.size();io++){
        registrocod tempocor = new registrocod();
        tempocor=listadatos.get(io);
        if (tempocor.getCorreo().equals(correoe.getText())) {
          JOptionPane.showMessageDialog(null, "El correo ya ha sido ingresado anteriormente","Error", JOptionPane.WARNING_MESSAGE);
            return true;  

        }         
  }
    return false; 
  }
      
public boolean veridepi(){
    for(int iu =0;iu<listadatos.size();iu++){
        registrocod tempodpi = new registrocod();
        tempodpi=listadatos.get(iu);
        if (tempodpi.getdpi().equals(Dpi.getText())) {
          JOptionPane.showMessageDialog(null, "El dpi ya ha sido ingresado anteriormente","Error", JOptionPane.WARNING_MESSAGE);
            return true;  

        }         
  }
    return false; 
  }

public boolean veritel(){
    for(int ui =0;ui<listadatos.size();ui++){
        registrocod tempotel = new registrocod();
        tempotel=listadatos.get(ui);
        if (tempotel.gettelefono().equals(Telefono.getText())) {
          JOptionPane.showMessageDialog(null, "El telefono ya ha sido registrado anteriormente","Error", JOptionPane.WARNING_MESSAGE);
            return true;  

        }         
  }
    return false; 
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        correoe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Apellido = new javax.swing.JTextField();
        Contra = new javax.swing.JTextField();
        contra2 = new javax.swing.JTextField();
        Dpi = new javax.swing.JTextField();
        Rol = new javax.swing.JComboBox<>();
        Telefono = new javax.swing.JTextField();
        alias = new javax.swing.JTextField();
        Nacionalidad = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<>();
        dd = new javax.swing.JTextField();
        mm = new javax.swing.JTextField();
        aaaa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        imagentext = new javax.swing.JLabel();
        imagenbut = new javax.swing.JButton();

        jLabel14.setText("mm");

        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setText("Correo electronico");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Contrasena");

        jLabel5.setText("Reingresar contraseña");

        jLabel6.setText("Dpi");

        jLabel7.setText("Rol");

        jLabel8.setText("Fecha de nacimiento");

        jLabel9.setText("Genero");

        jLabel10.setText("Nacionalidad");

        jLabel11.setText("Sobrenombre(alias)");

        jLabel12.setText("Telefono");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Kiosko" }));
        Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolActionPerformed(evt);
            }
        });

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jLabel13.setText("dd");

        jLabel15.setText("mm");

        jLabel16.setText("aaaa");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        imagentext.setText("Imagen");

        imagenbut.setText("Elegir imagen");
        imagenbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contra2)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButton1)))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(correoe, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel13))
                                            .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel15))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aaaa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(Nacionalidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(imagentext, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(imagenbut)
                                .addGap(42, 42, 42))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aaaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagentext, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Apellido))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(imagenbut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolActionPerformed
        if (Rol.getSelectedItem().equals("Kiosko")) {
            jComboBox1.setVisible(true); 

        }else{

            jComboBox1.setVisible(false);

            
        }        
    }//GEN-LAST:event_RolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
String fechas=dd.getText()+ "/"+mm.getText()+"/"+aaaa.getText();

String contrasenia="";
String nueva = Contra.getText();
String revalidar = contra2.getText();
String combovalor = ""; 


if(correoe.getText().isEmpty() || nombre.getText().isEmpty()|| Apellido.getText().isEmpty() || Contra.getText().isEmpty() || contra2.getText().isEmpty() || Dpi.getText().isEmpty() || dd.getText().isEmpty() ||mm.getText().isEmpty() || aaaa.getText().isEmpty() || Nacionalidad.getText().isEmpty() || alias.getText().isEmpty() || Telefono.getText().isEmpty()){
 JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
}else if(!vericorreo() && !veridepi() && !veritel())    {//verificaciones de no repetidos   

    if (nueva.equals(revalidar) && !nueva.equals("") && !revalidar.equals("")) {
        
       contrasenia=nueva;
       //
        if (Rol.getSelectedItem().equals("Usuario")) {//asignar valor de kiosko
            combovalor="NA";
        }else if (Rol.getSelectedItem().equals("Kiosko")) {
            combovalor=(String) jComboBox1.getSelectedItem();
        }

        
        listadatos.add(new registrocod(correoe.getText(),nombre.getText(),Apellido.getText(),contrasenia, Dpi.getText(), fechas, (String) genero.getSelectedItem(), Nacionalidad.getText(), alias.getText(), Telefono.getText(), (String) Rol.getSelectedItem(),rutaFoto ,combovalor));

        for(int i =0;i<listadatos.size();i++){
            registrocod temporal = new registrocod();
            temporal=listadatos.get(i);
            System.out.println(temporal.getCorreo()+" "+temporal.getcontra()+" " + temporal.getynkiosko());

        } 
        nombre.setText("");
        correoe.setText("");
        Apellido.setText("");
        Contra.setText("");
        contra2.setText("");
        Dpi.setText("");
        dd.setText("");
        mm.setText("");
        aaaa.setText("");
        Nacionalidad.setText("");
        alias.setText("");
        Telefono.setText("");
        combovalor="";
        //
    }else{
        JOptionPane.showMessageDialog(null, "Porfavor, verifique la contrasena y la verificacion de la misma","Error", JOptionPane.WARNING_MESSAGE);
                }
           
}
//del primer else  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void fotopreview(String origen){
    ImageIcon imageIcon = new ImageIcon(origen);//para poder usar un icono
    Image image = imageIcon.getImage();//para guradar la imagen
    Image scaledImage = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);//cambio de tamano
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);//para poner el tamanno desesado anteriormente
    imagentext.setIcon(scaledImageIcon);//cambiar la etiqueta
    this.repaint();
    
    }
    
    private void imagenbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenbutActionPerformed
//    ImageIcon imageIcon = new ImageIcon();    
JFileChooser fileChooser = new JFileChooser(); //ventana para escoger
int result = fileChooser.showOpenDialog(this);

if(result ==JFileChooser.APPROVE_OPTION){
            File seleccionarArchivo = fileChooser.getSelectedFile();
            rutaFoto= seleccionarArchivo.getAbsolutePath();//obtener ruta de la imagen
            fotopreview(rutaFoto);
    
}
    }//GEN-LAST:event_imagenbutActionPerformed

    
static ArrayList <kioskocod> listakioskos = new ArrayList <kioskocod>();
static ArrayList <registrocod> listadatos = new ArrayList <registrocod>();


       public void setListaKioskos(ArrayList <kioskocod> listakiosk){
        this.listakioskos=listakiosk;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Contra;
    private javax.swing.JTextField Dpi;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JComboBox<String> Rol;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField aaaa;
    private javax.swing.JTextField alias;
    private javax.swing.JTextField contra2;
    private javax.swing.JTextField correoe;
    private javax.swing.JTextField dd;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton imagenbut;
    private javax.swing.JLabel imagentext;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mm;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
 public ArrayList<registrocod> getregistrocod() {
        return listadatos;
    }
}
