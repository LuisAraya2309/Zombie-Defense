/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiedefense;

/**
 *
 * @author DELL
 */
public class PreviewZombi extends javax.swing.JFrame {

    /**
     * Creates new form PreviewZombi
     */
    public PreviewZombi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegresar = new javax.swing.JLabel();
        jLabelZombi = new javax.swing.JLabel();
        jLabelZombi2 = new javax.swing.JLabel();
        jLabelZombi3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RZZ.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 0, 250, 80));

        jLabelZombi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/latest.png"))); // NOI18N
        getContentPane().add(jLabelZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 250));

        jLabelZombi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/de3917a38484181e442832746be7eb9c.png"))); // NOI18N
        getContentPane().add(jLabelZombi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 250));

        jLabelZombi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Zombi3.jpg"))); // NOI18N
        getContentPane().add(jLabelZombi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 180, 250));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Calvo");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 160));

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Calvo");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, 160));

        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Calvo");
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.setEditable(false);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 180, 160));

        jLabelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jLabelFondo.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabelFondo.setForeground(new java.awt.Color(51, 0, 0));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/121634-aleni.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
        VentanaInicio cambioRZ= new VentanaInicio();
        cambioRZ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(PreviewZombi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviewZombi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviewZombi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviewZombi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviewZombi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelZombi;
    private javax.swing.JLabel jLabelZombi2;
    private javax.swing.JLabel jLabelZombi3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}