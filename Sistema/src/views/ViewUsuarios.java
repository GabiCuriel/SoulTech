/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Juan Pablo
 */
public class ViewUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form ViewUsuarios
     */
    public ViewUsuarios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Usuarios = new javax.swing.JTable();
        JL_Usuarios = new javax.swing.JLabel();
        JTF_Busqueda = new javax.swing.JTextField();
        JB_Buscar = new javax.swing.JButton();
        JL_NoFerreteria = new javax.swing.JLabel();
        JL_NoFerreteria1 = new javax.swing.JLabel();
        JL_Ferreteria3 = new javax.swing.JLabel();
        JL_TipoUsuario = new javax.swing.JLabel();
        JL_Usuario = new javax.swing.JLabel();
        JL_Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_Usuarios.setBackground(new java.awt.Color(255, 204, 51));
        JT_Usuarios.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        JT_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre de usuario", "Tipo de usuario", "Nombre de Empleado", "Apellido Paterno", "Apellido Materno", "Telefono", "RFC"
            }
        ));
        jScrollPane1.setViewportView(JT_Usuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 82, 943, 420));

        JL_Usuarios.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        JL_Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarios.png"))); // NOI18N
        add(JL_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 50));

        JTF_Busqueda.setBackground(new java.awt.Color(255, 204, 0));
        JTF_Busqueda.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        add(JTF_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 20, 370, 30));

        JB_Buscar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Buscar.setText("Buscar");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });
        add(JB_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 70, -1));

        JL_NoFerreteria.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_NoFerreteria.setText("1");
        add(JL_NoFerreteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 50, 20));

        JL_NoFerreteria1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_NoFerreteria1.setText("Ferreteria :");
        add(JL_NoFerreteria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 100, 20));

        JL_Ferreteria3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Ferreteria3.setText("Ferreterias \"Acme\"");
        add(JL_Ferreteria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 170, 20));

        JL_TipoUsuario.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_TipoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_TipoUsuario.setText("Encargado de Ventas");
        add(JL_TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 240, 20));

        JL_Usuario.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Usuario.setText("Usuario 12");
        add(JL_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 170, 20));

        JL_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        add(JL_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1040, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JLabel JL_Background;
    public javax.swing.JLabel JL_Ferreteria3;
    public javax.swing.JLabel JL_NoFerreteria;
    public javax.swing.JLabel JL_NoFerreteria1;
    public javax.swing.JLabel JL_TipoUsuario;
    public javax.swing.JLabel JL_Usuario;
    public javax.swing.JLabel JL_Usuarios;
    private javax.swing.JTextField JTF_Busqueda;
    public javax.swing.JTable JT_Usuarios;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
