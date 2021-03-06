/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Sepulveda
 */
public class Aprovisionamiento extends javax.swing.JFrame {

    public Controlador Controlador;
    public CreacionPlatos CreacionPlatos;

    public Aprovisionamiento(Controlador Controlador, CreacionPlatos CreacionPlatos) throws IOException {

        this.Controlador = Controlador;
        this.CreacionPlatos = CreacionPlatos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JFrame();
        UnidadJlabel = new javax.swing.JLabel();
        IngredienteJlabel = new javax.swing.JLabel();
        UnidadesTxtField = new javax.swing.JTextField();
        AgregarButton2 = new javax.swing.JButton();
        IngredienteTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AlmacenTable = new javax.swing.JTable();
        AgregarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Background1 = new javax.swing.JLabel();

        Agregar.setMinimumSize(new java.awt.Dimension(430, 200));
        Agregar.getContentPane().setLayout(null);

        UnidadJlabel.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        UnidadJlabel.setText("Unidades disponibles:");
        Agregar.getContentPane().add(UnidadJlabel);
        UnidadJlabel.setBounds(41, 55, 170, 17);

        IngredienteJlabel.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        IngredienteJlabel.setText("Ingrediente:");
        Agregar.getContentPane().add(IngredienteJlabel);
        IngredienteJlabel.setBounds(41, 15, 79, 17);

        UnidadesTxtField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        UnidadesTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadesTxtFieldActionPerformed(evt);
            }
        });
        UnidadesTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UnidadesTxtFieldKeyTyped(evt);
            }
        });
        Agregar.getContentPane().add(UnidadesTxtField);
        UnidadesTxtField.setBounds(241, 53, 157, 21);

        AgregarButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        AgregarButton2.setText("Agregar");
        AgregarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButton2ActionPerformed(evt);
            }
        });
        Agregar.getContentPane().add(AgregarButton2);
        AgregarButton2.setBounds(154, 107, 77, 23);

        IngredienteTxtField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        IngredienteTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngredienteTxtFieldKeyTyped(evt);
            }
        });
        Agregar.getContentPane().add(IngredienteTxtField);
        IngredienteTxtField.setBounds(241, 14, 157, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositphotos_23928845-stock-photo-green-pastel-background-design.jpg"))); // NOI18N
        Agregar.getContentPane().add(jLabel1);
        jLabel1.setBounds(-300, -190, 830, 580);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 400));
        getContentPane().setLayout(null);

        Titulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo1.setText("Sistema de registro de ingredientes");
        getContentPane().add(Titulo1);
        Titulo1.setBounds(29, 25, 309, 23);

        AlmacenTable.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        AlmacenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Unidades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AlmacenTable.getTableHeader().setResizingAllowed(false);
        AlmacenTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(AlmacenTable);
        if (AlmacenTable.getColumnModel().getColumnCount() > 0) {
            AlmacenTable.getColumnModel().getColumn(0).setResizable(false);
            AlmacenTable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 53, 366, 208);

        AgregarButton.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        AgregarButton.setText("Agregar");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarButton);
        AgregarButton.setBounds(40, 290, 77, 23);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setText("Enviar a Creacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 290, 130, 23);

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositphotos_23928845-stock-photo-green-pastel-background-design.jpg"))); // NOI18N
        getContentPane().add(Background1);
        Background1.setBounds(0, 0, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed

        IngredienteTxtField.setText("");
        UnidadesTxtField.setText("");
        Agregar.setVisible(true);
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void UnidadesTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadesTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnidadesTxtFieldActionPerformed

    private void UnidadesTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnidadesTxtFieldKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_UnidadesTxtFieldKeyTyped

    private void AgregarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) AlmacenTable.getModel();

        int unidades = parseInt(UnidadesTxtField.getText());
        String nombre = IngredienteTxtField.getText();
        model.addRow(new Object[]{nombre, unidades});
        Agregar.setVisible(false);


    }//GEN-LAST:event_AgregarButton2ActionPerformed

    private void IngredienteTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngredienteTxtFieldKeyTyped

        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }

    }//GEN-LAST:event_IngredienteTxtFieldKeyTyped

    void mostrarAviso(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = AlmacenTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) AlmacenTable.getModel();

        try {
            Controlador.AgregarIngredientesAlmacen(model, fila);
        } catch (IOException ex) {
            Logger.getLogger(Aprovisionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarAviso("Ingredientes enviados", "Puede proceder a crear alimentos con los ingredientes en creacion de platos");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aprovisionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aprovisionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aprovisionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aprovisionamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Controlador c = null;
                    CreacionPlatos k = null;
                    new Aprovisionamiento(c, k).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Aprovisionamiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Agregar;
    private javax.swing.JButton AgregarButton;
    private javax.swing.JButton AgregarButton2;
    public javax.swing.JTable AlmacenTable;
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel IngredienteJlabel;
    private javax.swing.JTextField IngredienteTxtField;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel UnidadJlabel;
    private javax.swing.JTextField UnidadesTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
