/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abismonegro;

import java.awt.Color;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tony
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    ImageIcon logo = new ImageIcon("src/main/java/imagenes/imagen.png");
    ImageIcon logo1 = new ImageIcon("src/main/java/imagenes/d");
    ImageIcon logo2 = new ImageIcon("src/main/java/imagenes/L.png");
//shift+alt+f
    String[] columnas = {"Lucha","Hora de funcion","Direccion","Evento","Fecha"};
    //Declaramos una matriz de objetos y definimos modelo para la tabla
    private Object[][] matriz = new Object[][]{};
    private DefaultTableModel modelo = new DefaultTableModel(matriz, columnas);
    
    public NewJFrame() throws IOException {
        initComponents();
     this.Imagen.setIcon(logo);
     this.imagen1.setIcon(logo1);
     this.Imagen2.setIcon(logo2);
     
      crear_Archivo();
      cargarDatos();
      //Color JFrame
         
        this.getContentPane().setBackground(Color.black);       
    
    
    }
    public void crear_Archivo() throws IOException {
        File f = new File("Evento.txt");
        f.createNewFile();
      
    }
    public void Escribir(String mensaje) throws IOException{
        
       BufferedWriter bw = null;
       FileWriter fw = null;

    try {
        String data = mensaje+"\n";
        File file = new File("Evento.txt");
        // Si el archivo no existe, se crea!
        if (!file.exists()) {
            file.createNewFile();
        }
        // flag true, indica adjuntar información al archivo.
        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);
        bw.write(data);
        System.out.println("información agregada!");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        //Cierra instancias de FileWriter y BufferedWriter
        if (bw != null)
            bw.close();
        if (fw != null)
            fw.close();
    }
    }
    private void cargarDatos() throws FileNotFoundException {    
        File file = new File("Evento.txt");
        if(file.exists()){ 
        Scanner scanner =new Scanner(file);
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    Scanner delimitar =new Scanner(linea);
                    delimitar.useDelimiter("\\s*,\\s*");
                    String[] event = new String[5];
                    
                    event[0] = delimitar.next();
                    event[1] = delimitar.next();
                    event[2] = delimitar.next();
                    event[3] = delimitar.next();
                    event[4] = delimitar.next();
                    
                    modelo.addRow(event);
                }
                scanner.close();
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox6 = new javax.swing.JComboBox<>();
        Luchadores = new javax.swing.JComboBox<>();
        Contrincante = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        Imagen = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        Imagen2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Luchadores.setBackground(new java.awt.Color(204, 0, 0));
        Luchadores.setForeground(new java.awt.Color(0, 0, 0));
        Luchadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Abismo negro", "Fénix", " La Parka", " Monster Clown", " Murder Clown", " Psycho Clown", "Pentagón Jr.", "Vampiro", "Crazy Boy", "Joe Líder", "Máscara Año 2000 Jr", "Super Fly", "Último Gladiador", "Soul Rocker", "Devil Rocker,", "Machine Rocker", "Gronda", "Argenis", "Argos", "Alebrije con Cuije", "El Brazo", "Pasión Cristal", "Polvo de Estrellas", "Pimpinela", "Faby apache", "laredo kid", "extreme tiger", "Myzteziz", "mistico", "Titan", " Nygma ", "Atlantis", "angel de oro", "El valiente" }));
        Luchadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuchadoresActionPerformed(evt);
            }
        });

        Contrincante.setBackground(new java.awt.Color(204, 0, 0));
        Contrincante.setForeground(new java.awt.Color(0, 0, 0));
        Contrincante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rudo", "Texano Jr.", "Cibernético", "El Mesías", "Chessman", "Silver King", "Jack Evans", "Hijo del Perro Aguayo", "Blue Demon Jr", "Electroshock", "Alan Stone", "Toscano", "Psicosis", "Daga", "Halloween", "Drago", "Dark Ozz", "Dark Cuervo", "Dark Scoria", "Dark Espíritu", "Hiedra", "Lady maravilla", "Axel", "Atomic Boy", "Aerostar", "Lady flamer", "Hechizero", "Averno", "Ultimo guerrero", "volador jr", "negro casas ", "Yuriko" }));
        Contrincante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrincanteActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(204, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horario", "7:00 pm", "7:30 pm", "8:00 pm", "8:30 pm", "9:00 pm", "9:30 pm", "10:00 pm", "10:30 pm", "11:00 pm", "11:30 pm", "12:00 pm" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setBackground(new java.awt.Color(204, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ubicacion", "República de Perú 77 Centro Histórico de la Cdad. de México Centro Cuauhtémoc 06000 Ciudad de México CDMX", " Dr. Lavista 189 Doctores Cuauhtémoc 06720 Ciudad de México CDMX", "Av. Carmelo Pérez 368 Villada 57710 Nezahualcóyotl Méx.", "Avenida Jorge Jiménez Cantú esquina con Vía Satélite Centro Urbano Cuautitlán Izcalli Méx.", "C. Emilio Cárdenas 28 Tlalnepantla Centro 54000 Ciudad de México Méx.", "C.Jdn 19 Naucalpan Centro 53000 Naucalpan de Juárez Méx.", "Av. San Francisco 5 San Francisco Cuautliquixca 55749 Ojo de Agua Méx", "A San Luis Beltrán 110A Jardin 68020 Oaxaca de Juárez Oax.", "Arena Pepe Cisneros. Calle Heroes Mexicanos Num. 412 Col Fernando Gomez Sandoval 68150 Santa Lucía del Camino Oax.", " Av. 13 Ote. 402 El Carmen 72530 Puebla Pue", "11 Sur No 13524 San Ramón 72490 Puebla Pue.", "Yaxchunal 14 59 77515 Cancún Q.R.", " Pipila 100 Santa Julia Sta Julia 42080 Pachuca de Soto Hgo.", "Calle Federico Medrano C. Analco 67 Centro 44100 Guadalajara Jal." }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setBackground(new java.awt.Color(204, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modo", "Triplemania", "Rey de reyes", "Westlemania", "Heroes inmortales", "Extreme rules", "Money in the bank" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(255, 0, 0));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cerrar.setBackground(new java.awt.Color(255, 0, 0));
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Engravers MT", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VS");

        jCalendar2.setBackground(new java.awt.Color(204, 0, 0));
        jCalendar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null));
        jCalendar2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Engravers MT", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona luchador");

        tabla.setModel(modelo);
        Scroll.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Luchadores, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Contrincante, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Luchadores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Contrincante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cerrar)
                            .addComponent(Guardar))
                        .addGap(39, 39, 39)
                        .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleParent(Imagen);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LuchadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuchadoresActionPerformed
    }//GEN-LAST:event_LuchadoresActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        
        String nombre = Luchadores.getSelectedItem().toString();
        String Contrincante1 = Contrincante.getSelectedItem().toString();
        String horario = jComboBox3.getSelectedItem().toString();
        String Ubicacion = jComboBox4.getSelectedItem().toString();
        String Modo = jComboBox5.getSelectedItem().toString();
        Date fecha = jCalendar2.getCalendar().getTime();
        //contatenar datos
       // String tony="\n"+"Lucha: "+nombre + " vs  " + Contrincante1 + "\n"+"Hora de funcion: "+horario+"\n"+"Direccion: "+Ubicacion+"\n" + "Evento: "+Modo+"\n" + "Fecha de funcion: "+fecha+"\n";
     String tony = nombre + " vs  " + Contrincante1 + "," + horario + "," + Ubicacion + "," + Modo + "," + fecha;
//   Resultados.setText(tony);
       Object[] temp = {nombre + " vs  " + Contrincante1, horario, Ubicacion, Modo, fecha };
        this.modelo.addRow(temp);
        try {
            Escribir(tony);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarActionPerformed

    private void ContrincanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrincanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrincanteActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JComboBox<String> Contrincante;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JComboBox<String> Luchadores;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel imagen1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}

