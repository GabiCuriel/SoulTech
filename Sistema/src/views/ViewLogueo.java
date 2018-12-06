/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author TeddyBear
 */
public class ViewLogueo extends javax.swing.JFrame {

    /**
     * Creates new form viewLogueo
     */
    public ViewLogueo() {
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

        jLabel1 = new javax.swing.JLabel();
        JP_Loguin = new javax.swing.JPanel();
        JL_IconoAcceso = new javax.swing.JLabel();
        JTF_Usuario = new javax.swing.JTextField();
        JB_Loguear = new javax.swing.JButton();
        JL_IconoUser = new javax.swing.JLabel();
        JTF_Password = new javax.swing.JPasswordField();
        JL_Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Loguin.setBackground(new java.awt.Color(255, 255, 255));

        JL_IconoAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acceso.png"))); // NOI18N

        JTF_Usuario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        JTF_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_Usuario.setText("Usuario");

        JB_Loguear.setBackground(new java.awt.Color(255, 255, 255));
        JB_Loguear.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        JB_Loguear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        JB_Loguear.setText(" Entrar");
        JB_Loguear.setToolTipText("");

        JL_IconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        JTF_Password.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        JTF_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_Password.setText("Contraseña");
        JTF_Password.setToolTipText("");

        javax.swing.GroupLayout JP_LoguinLayout = new javax.swing.GroupLayout(JP_Loguin);
        JP_Loguin.setLayout(JP_LoguinLayout);
        JP_LoguinLayout.setHorizontalGroup(
            JP_LoguinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LoguinLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(JP_LoguinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JB_Loguear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_LoguinLayout.createSequentialGroup()
                        .addComponent(JL_IconoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JP_LoguinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(JTF_Password))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_LoguinLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(JL_IconoUser)
                .addGap(105, 105, 105))
        );
        JP_LoguinLayout.setVerticalGroup(
            JP_LoguinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LoguinLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(JL_IconoUser)
                .addGap(57, 57, 57)
                .addGroup(JP_LoguinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_IconoAcceso)
                    .addGroup(JP_LoguinLayout.createSequentialGroup()
                        .addComponent(JTF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(JB_Loguear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(JP_Loguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 440));

        JL_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        getContentPane().add(JL_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_Loguear;
    private javax.swing.JLabel JL_Background;
    private javax.swing.JLabel JL_IconoAcceso;
    private javax.swing.JLabel JL_IconoUser;
    private javax.swing.JPanel JP_Loguin;
    public javax.swing.JPasswordField JTF_Password;
    public javax.swing.JTextField JTF_Usuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}