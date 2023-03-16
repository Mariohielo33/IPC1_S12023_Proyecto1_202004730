/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto1.ventanas.paneles;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto1.elementos.registrocod;

/**
 *
 * @author Pedro
 */
public class cuentapa extends javax.swing.JPanel {
private String datc;
 private String rutaFoto;

    public cuentapa() {
        initComponents();
    }
    
    public void setcor(String datc){// para obtener el valor de rol segun el array de registro
        this.datc=datc;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        imagentext = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagenbut = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        Nacionalidad = new javax.swing.JTextField();
        correoe = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fechatexxt = new javax.swing.JTextField();

        jLabel5.setText("Reingresar contraseña");

        jLabel6.setText("Dpi");

        jLabel7.setText("Rol");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha de nacimiento");

        imagentext.setText("Imagen");

        jLabel9.setText("Genero");

        imagenbut.setText("Elegir imagen");
        imagenbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenbutActionPerformed(evt);
            }
        });

        jLabel10.setText("Nacionalidad");

        jLabel11.setText("Sobrenombre(alias)");

        jLabel12.setText("Telefono");

        jButton1.setText("Guardar cambios");
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

        jLabel1.setText("Correo electronico");

        correoe.setEnabled(false);

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Contrasena");

        jButton2.setText("Mostrar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addContainerGap(176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(correoe, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(176, 176, 176)))
                                .addGap(18, 18, 18)
                                .addComponent(Nacionalidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(117, 117, 117)
                                        .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jButton2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fechatexxt))
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
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fechatexxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(correoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imagentext, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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

        JFileChooser fileChooser = new JFileChooser(); //ventana para escoger
        int result = fileChooser.showOpenDialog(this);

        if(result ==JFileChooser.APPROVE_OPTION){
            File seleccionarArchivo = fileChooser.getSelectedFile();
            rutaFoto= seleccionarArchivo.getAbsolutePath();//obtener ruta de la imagen
            fotopreview(rutaFoto);

        }
    }//GEN-LAST:event_imagenbutActionPerformed
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
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String contrasenia="";
String nueva = Contra.getText();
String revalidar = contra2.getText();
String combovalor = "";
        
if(correoe.getText().isEmpty() || nombre.getText().isEmpty()|| Apellido.getText().isEmpty() || Contra.getText().isEmpty() || contra2.getText().isEmpty() || Dpi.getText().isEmpty() || fechatexxt.getText().isEmpty() || Nacionalidad.getText().isEmpty() || alias.getText().isEmpty() || Telefono.getText().isEmpty()){
 JOptionPane.showMessageDialog(null, "Porfavor, complete los campos","Error", JOptionPane.WARNING_MESSAGE);
}else if (nueva.equals(revalidar) && !nueva.equals("") && !revalidar.equals("")) {
    
    
            if (Rol.getSelectedItem().equals("Usuario")) {//asignar valor de kiosko
            combovalor="NA";
        }else if (Rol.getSelectedItem().equals("Kiosko")) {
            combovalor=(String) jComboBox1.getSelectedItem();
        }
            
        for (int bv = 0; bv < listadatos.size(); bv++) {
            registrocod temporalmodi = new registrocod();
            temporalmodi = listadatos.get(bv);
       if (temporalmodi.getCorreo().equals(correoe.getText())) {
           temporalmodi.setNombre(nombre.getText());
           temporalmodi.setApellido(Apellido.getText());
           temporalmodi.setDpi(Dpi.getText());
           temporalmodi.setContra(Contra.getText());
           temporalmodi.setFecha(fechatexxt.getText());
           temporalmodi.setGenero((String)genero.getSelectedItem());
           temporalmodi.setNacionalidad(Nacionalidad.getText());
           temporalmodi.setRol((String) Rol.getSelectedItem());
           temporalmodi.setYnkiosko(combovalor);
           temporalmodi.setTelefono(Telefono.getText());
           temporalmodi.setSobrenombre(alias.getText());
           temporalmodi.setRutaFoto(rutaFoto);
           
       }
       JOptionPane.showMessageDialog(null, "Datos actualizados correctamente","Information", JOptionPane.INFORMATION_MESSAGE);
      
        
        }
    }else{
        JOptionPane.showMessageDialog(null, "Porfavor, verifique la contrasena y la verificacion de la misma","Error", JOptionPane.WARNING_MESSAGE);
    }
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolActionPerformed
        if (Rol.getSelectedItem().equals("Kiosko")) {
            jComboBox1.setVisible(true);
            //            comproba = "Si";
        }else{

            jComboBox1.setVisible(false);
            //            comproba = "No";

        }        // TODO add your handling code here:
    }//GEN-LAST:event_RolActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        correoe.setText(datc);
//        BufferedImage img = new BufferedImage();
//        BufferedImage img = ImageIO.read(new File(rutaFoto));
        for (int b = 0; b < listadatos.size(); b++) {
            registrocod temporaldat = new registrocod();
            temporaldat = listadatos.get(b);
            if (temporaldat.getCorreo().equals(datc)) {
                nombre.setText(temporaldat.getNombre());
                Apellido.setText(temporaldat.getApellido());
                Contra.setText(temporaldat.getcontra());
                contra2.setText(temporaldat.getcontra());
                Dpi.setText(temporaldat.getdpi());
                alias.setText(temporaldat.getsobrenombre());
                fechatexxt.setText(temporaldat.getfecha());
                Nacionalidad.setText(temporaldat.getnacionalidad());
                Telefono.setText(temporaldat.gettelefono());
                imagentext.setText(temporaldat.getrutaFoto());
                Rol.setSelectedItem(temporaldat.getrol());
                jComboBox1.setSelectedItem(temporaldat.getynkiosko());
                genero.setSelectedItem(temporaldat.getgenero());
                
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

static ArrayList <registrocod> listadatos = new ArrayList <registrocod>();
public void setListadat(ArrayList <registrocod> listadatos){
this.listadatos=listadatos;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Contra;
    private javax.swing.JTextField Dpi;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JComboBox<String> Rol;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField alias;
    private javax.swing.JTextField contra2;
    private javax.swing.JTextField correoe;
    private javax.swing.JTextField fechatexxt;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton imagenbut;
    private javax.swing.JLabel imagentext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
