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
public class ViewEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpleados
     */
    public ViewEmpleados() {
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
        JT_Empleados = new javax.swing.JTable();
        JB_AgregarEmpleado = new javax.swing.JButton();
        JB_EliminarEmpleado = new javax.swing.JButton();
        JB_ModificarEmpleado = new javax.swing.JButton();
        JL_Empleados = new javax.swing.JLabel();
        JL_Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_Empleados.setBackground(new java.awt.Color(255, 204, 51));
        JT_Empleados.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        JT_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "RFC", "Dirección", "ID Banco", "NSS", "ID Ferreteria"
            }
        ));
        jScrollPane1.setViewportView(JT_Empleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 82, 943, 340));

        JB_AgregarEmpleado.setBackground(new java.awt.Color(255, 153, 0));
        JB_AgregarEmpleado.setForeground(new java.awt.Color(255, 204, 51));
        JB_AgregarEmpleado.setText("+");
        add(JB_AgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        JB_EliminarEmpleado.setBackground(new java.awt.Color(255, 153, 0));
        JB_EliminarEmpleado.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        JB_EliminarEmpleado.setText("Eliminar Empleado");
        add(JB_EliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 244, -1));

        JB_ModificarEmpleado.setBackground(new java.awt.Color(255, 153, 0));
        JB_ModificarEmpleado.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        JB_ModificarEmpleado.setText("Modificar Empleado");
        add(JB_ModificarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 244, -1));

        JL_Empleados.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        JL_Empleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleados.png"))); // NOI18N
        add(JL_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 50));

        JL_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        add(JL_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 510));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_AgregarEmpleado;
    public javax.swing.JButton JB_EliminarEmpleado;
    public javax.swing.JButton JB_ModificarEmpleado;
    private javax.swing.JLabel JL_Background;
    public javax.swing.JLabel JL_Empleados;
    public javax.swing.JTable JT_Empleados;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}