/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXUIFactory;
import controlador.Controller;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Equipos;
import pojo.Jugadores;

/**
 *
 * @author jesuk
 */
public class AgregarJugador extends javax.swing.JFrame {

    private Session mSession;
    private Transaction mTransaction;
    private Criteria mCriteria;
    private ArrayList<Equipos> mArrayListEquipos;

    /**
     * Creates new form AgregarJugador
     */
    public AgregarJugador() {
        initComponents();
        setTitle("Agregar jugador");
        setLocationRelativeTo(null);

        mSession = controlador.Controller.getSessionFactory().openSession();
        mCriteria = mSession.createCriteria(Equipos.class);

        mArrayListEquipos = new ArrayList(mCriteria.list());

        int longitud = mArrayListEquipos.size() + 1;
        String[] values = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            if (i == 0) {
                values[i] = "Seleccione un equipo";
            } else {
                values[i] = mArrayListEquipos.get(i - 1).getNombre();
            }
        }

        selectEquipo.setModel(new DefaultComboBoxModel<>(values));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imputNombreJugador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        imputApellidoJugador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        imputPosicionJugador = new javax.swing.JTextField();
        imputDorsalJugador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarJugador = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        imputDNIJugador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        imputEdadJugador = new javax.swing.JTextField();
        selectEquipo = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Dorsal");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        imputApellidoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputApellidoJugadorActionPerformed(evt);
            }
        });

        jLabel3.setText("Posición ");

        imputPosicionJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputPosicionJugadorActionPerformed(evt);
            }
        });

        imputDorsalJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputDorsalJugadorActionPerformed(evt);
            }
        });

        jLabel5.setText("Dorsal");

        jLabel6.setText("Equipo");

        btnGuardarJugador.setText("Guardar");
        btnGuardarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarJugadorActionPerformed(evt);
            }
        });

        jLabel7.setText("DNI");

        jLabel8.setText("Edad");

        imputEdadJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputEdadJugadorActionPerformed(evt);
            }
        });

        selectEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel5)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imputEdadJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imputPosicionJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(imputDorsalJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(selectEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imputDNIJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imputApellidoJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(imputNombreJugador)))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(imputDNIJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(imputNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imputApellidoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(imputEdadJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(imputPosicionJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imputDorsalJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarJugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imputApellidoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputApellidoJugadorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_imputApellidoJugadorActionPerformed

    private void imputPosicionJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputPosicionJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputPosicionJugadorActionPerformed

    private void imputDorsalJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputDorsalJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputDorsalJugadorActionPerformed

    private void btnGuardarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarJugadorActionPerformed

        if (Validarcampo()) {
            mTransaction = mSession.beginTransaction();

            int DNI = Integer.parseInt(imputDNIJugador.getText().toString().trim());
            String nombre = imputNombreJugador.getText().toString().trim();
            String apellido = imputApellidoJugador.getText().toString().trim();
            int edad = Integer.parseInt(imputEdadJugador.getText().toString().trim());
            String posicion = imputPosicionJugador.getText().toString().trim();
            int dorsal = Integer.parseInt(imputDorsalJugador.getText().toString().trim());

            Equipos equipoJugador = mArrayListEquipos.get(selectEquipo.getSelectedIndex() - 1);

            Jugadores jugador = new Jugadores();
            jugador.setDni(DNI);
            jugador.setNombre(nombre);
            jugador.setApellido(apellido);
            jugador.setEdad(edad);
            jugador.setPosicion(posicion);
            jugador.setDorsal(dorsal);
            jugador.setEquipos(equipoJugador);
            
            mSession.save(jugador);
            mTransaction.commit();
            
            JOptionPane.showMessageDialog(rootPane, "El jugador "+jugador.getNombre()+" se agregó correctamente","Enhorabuena!",JOptionPane.INFORMATION_MESSAGE);
            
            imputDNIJugador.setText("");
            imputNombreJugador.setText("");
            imputApellidoJugador.setText("");
            imputEdadJugador.setText("");
            imputPosicionJugador.setText("");
            imputDorsalJugador.setText("");
            selectEquipo.setSelectedIndex(0);
            
            imputDNIJugador.requestFocus();
            mTransaction = null;
        }

        /*Jugadores nuevoJugador = new Jugadores();
        nuevoJugador.setDni(DNI);
        nuevoJugador.setNombre(nombre);
        nuevoJugador.setApellidos(apellido);
        nuevoJugador.setEdad(edad);
        nuevoJugador.setPosicion(posicion);
        nuevoJugador.setDorsal(dorsal);
        nuevoJugador.setEquipos(new Equipos("Cavaliers", 11, 46, "Resultado Path"));

        mSession.save(nuevoJugador);
        mTransaction.commit();*/

    }//GEN-LAST:event_btnGuardarJugadorActionPerformed
    private boolean Validarcampo() {

        if (imputDNIJugador.getText().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el DNI", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            imputDNIJugador.requestFocus();
            return false;
        }

        if (imputNombreJugador.getText().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre", "Atención", JOptionPane.INFORMATION_MESSAGE);
            imputNombreJugador.requestFocus();
            return false;
        }
        if (imputApellidoJugador.getText().toString().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el apellido", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            imputApellidoJugador.requestFocus();
            return false;
        }
        if (imputEdadJugador.getText().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe introducir la edad", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            imputEdadJugador.requestFocus();
            return false;
        }
        if (imputPosicionJugador.getText().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe introducir la Posicion", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            imputPosicionJugador.requestFocus();
            return false;
        }
        if (imputDorsalJugador.getText().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe introducir el dorsal", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            imputDorsalJugador.requestFocus();
            return false;

        }

        if (selectEquipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un equipo", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;
    }
    private void imputEdadJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputEdadJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputEdadJugadorActionPerformed

    @Override
    public void setDefaultCloseOperation(int operation) {
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarJugador;
    private javax.swing.JTextField imputApellidoJugador;
    private javax.swing.JTextField imputDNIJugador;
    private javax.swing.JTextField imputDorsalJugador;
    private javax.swing.JTextField imputEdadJugador;
    private javax.swing.JTextField imputNombreJugador;
    private javax.swing.JTextField imputPosicionJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> selectEquipo;
    // End of variables declaration//GEN-END:variables
}