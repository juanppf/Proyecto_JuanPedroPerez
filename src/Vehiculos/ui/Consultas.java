
package Vehiculos.ui;

import Vehiculos.util.HibernateUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import Vehiculos.entity.Coches;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanPe
 */
/**
 * 
 * @version 1.0 - 09/06/2016 
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        dispose();
    }
    // Consultas preparadas
    private static String QUERY_BASED_ON_matricula = "from Coches a where a.matricula like '";
    private static String QUERY_BASED_ON_TABLA = "from Coches";
/**
 * @param  metodo que realiza una consulta a la tabla
 */
    private void runQueryBasedOnTABLA() {
        executeHQLQuery(QUERY_BASED_ON_TABLA);
    }
/**
 * @param metodo que realiza una consulta a una columna de la tabla
 */
    private void runQueryBasedOnMATRICULA() {
        executeHQLQuery(QUERY_BASED_ON_matricula + mat.getText() + "%'");
    }
/**
 * 
 * @param hql llama hibernate para ejecutar la consulta seleccionada. 
 * Este m�todo hace uso de la clase de utilidad HibernateUtil.java para obtener la sesi�n de Hibernate.
 */
    private void executeHQLQuery(String hql) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            nombresCabecera(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }
/**
 * 
 * @param resultList m�todo que inserta los nombres registros de la BD en la tabla de la aplicaci�n
 */
    private void nombresCabecera(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Registro");
        tableHeaders.add("Matricula");
        tableHeaders.add("Modelo");
        tableHeaders.add("Reparaci�n");
        tableHeaders.add("Fecha");
        tableHeaders.add("kilometros");
        tableHeaders.add("Operario-Taller");
        for (Object o : resultList) {
            Coches c2 = (Coches) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(c2.getIdVehiculo());
            oneRow.add(c2.getMatricula());
            oneRow.add(c2.getModelo());
            oneRow.add(c2.getReparacion());
            oneRow.add(c2.getFechaRep());
            oneRow.add(c2.getKilometros());
            oneRow.add(c2.getOperario());
            tableData.add(oneRow);
        }
        resultTable.setModel(new DefaultTableModel(tableData, tableHeaders));
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
        resultTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        retroceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mat = new javax.swing.JTextField();
        reg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        all = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Registro", "Matricula", "Modelo", "Reparaci�n", "Fecha", "Kilometros", "Operario-Taller"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("BORRAR REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        consultar.setForeground(new java.awt.Color(0, 0, 255));
        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        retroceder.setForeground(new java.awt.Color(0, 153, 0));
        retroceder.setText("VOLVER");
        retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocederActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("MATRICULA :");

        mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matActionPerformed(evt);
            }
        });

        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("REGISTRO :");

        limpiar.setForeground(new java.awt.Color(0, 0, 255));
        limpiar.setText("LIMPIAR CAMPOS");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        all.setForeground(new java.awt.Color(0, 0, 255));
        all.setText("CONSULTAR TODO");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retroceder)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar)
                    .addComponent(all))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(reg)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retroceder)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matActionPerformed
/**
 * 
 * @param evt  realiza una consulta de un registro(matricula)
 */
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        try {
            if (!mat.getText().trim().equals("")) {
                runQueryBasedOnMATRICULA();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("No se encuentran registros con esa matr�cula");
        }
    }//GEN-LAST:event_consultarActionPerformed
/**
 * 
 * @param evt  retroceder a la ventana anterior
 */
    private void retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocederActionPerformed
        PrincipalVehiculos p1 = new PrincipalVehiculos();
        p1.setVisible(true);
        dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_retrocederActionPerformed
/**
 * 
 * @param evt  borra el registro que se le indique al pulsar
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery("from Coches where idVehiculo='" + reg.getText() + "'");
            List resultList = q.list();
            Coches c = (Coches) resultList.get(0);
            session.delete(c);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Registro Borrado Correctamente",
                    "Borrado", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("No se pudo borrar el registro");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * 
 * @param evt limpia los campos al pulsar
 */
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        try {
            mat.setText("");
            reg.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("No se pudo limpiar los campos");
        }// TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regActionPerformed
/**
 * 
 * @param evt realiza la consulta de toda la tabla al pulsar
 */
    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        try {
            runQueryBasedOnTABLA();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("No se pudo realizar la consulta");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_allActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JButton consultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mat;
    private javax.swing.JTextField reg;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton retroceder;
    // End of variables declaration//GEN-END:variables
}
