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
public class PreviewHeroes extends javax.swing.JFrame {

    /**
     * Creates new form PreviewHeroes
     */
    public PreviewHeroes() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RH.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ba26dbae7487041f4d7c1948cbb3bccb.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 240));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 204, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("The Revenant es un \nheroe blindado que \ntiene una cantidad \nde escudo adicional \na la vidaactual.\n");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/capitan-america-el-soldado-de-invierno-bucky-barnes-papel-pintado-15598_L.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 240));

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 204, 102));
        jTextArea2.setRows(5);
        jTextArea2.setText("Scout es un sigiloso\nexplorador que \nposee un arma a \nlargo alcance y un \nrango de vision\nmayor a los demas.");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f23be9a99232c9e58ec9a393e64fb1fc.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, 240));

        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 204, 102));
        jTextArea3.setRows(5);
        jTextArea3.setText("Dheylo es un asesino \ngenuino que tiene \nun daño muy potente\nque acaba de manera\nfácil con los zombies.\n");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 170, 170));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apocalipsis_nostradamus_biblia_fin_del_mundo_mayas.jpg_759710130.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
        VentanaInicio cambioRH= new VentanaInicio();
        cambioRH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegresarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
