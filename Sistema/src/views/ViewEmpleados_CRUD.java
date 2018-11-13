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
public class ViewEmpleados_CRUD extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpleados_CRUD
     */
    public ViewEmpleados_CRUD() {
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
        JL_Empleados = new javax.swing.JLabel();
        JB_Buscar = new javax.swing.JButton();
        JTF_Busqueda = new javax.swing.JTextField();
        JL_NoFerreteria = new javax.swing.JLabel();
        JL_NoFerreteria1 = new javax.swing.JLabel();
        JL_Ferreteria3 = new javax.swing.JLabel();
        JL_TipoUsuario = new javax.swing.JLabel();
        JL_Usuario = new javax.swing.JLabel();
        JP_Datos = new javax.swing.JPanel();
        JL_ID = new javax.swing.JLabel();
        JL_Nombre = new javax.swing.JLabel();
        JL_AP = new javax.swing.JLabel();
        JL_AM = new javax.swing.JLabel();
        JL_Telefono = new javax.swing.JLabel();
        JL_RFC = new javax.swing.JLabel();
        JL_Payback = new javax.swing.JLabel();
        JL_Banco = new javax.swing.JLabel();
        JL_Direccion = new javax.swing.JLabel();
        JB_RFC = new javax.swing.JButton();
        JTF_ID = new javax.swing.JTextField();
        JTF_Nombre = new javax.swing.JTextField();
        JTF_AP = new javax.swing.JTextField();
        JTF_AM = new javax.swing.JTextField();
        JTF_Telefono = new javax.swing.JTextField();
        JTF_RFC = new javax.swing.JTextField();
        JTF_Payback = new javax.swing.JTextField();
        JTF_Email = new javax.swing.JTextField();
        JTF_Direccion = new javax.swing.JTextField();
        JB_Direccion = new javax.swing.JButton();
        JB_CURP = new javax.swing.JButton();
        JB_Banco = new javax.swing.JButton();
        JL_Ferreteria = new javax.swing.JLabel();
        JTF_Banco = new javax.swing.JTextField();
        JB_Ferreteria = new javax.swing.JButton();
        JL_NSS = new javax.swing.JLabel();
        JTF_NSS = new javax.swing.JTextField();
        JP_Controles = new javax.swing.JPanel();
        JB_Nuevo = new javax.swing.JButton();
        JB_Agregar = new javax.swing.JButton();
        JB_Modificar = new javax.swing.JButton();
        JB_Cancelar = new javax.swing.JButton();
        JB_Eliminar = new javax.swing.JButton();
        JL_Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JT_Empleados.setBackground(new java.awt.Color(255, 204, 51));
        JT_Empleados.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        JT_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "RFC", "CURP", "Dirección", "Banco", "NSS", "Ferreteria"
            }
        ));
        jScrollPane1.setViewportView(JT_Empleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 943, 90));

        JL_Empleados.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        JL_Empleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleados.png"))); // NOI18N
        add(JL_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 50));

        JB_Buscar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Buscar.setText("Buscar");
        add(JB_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 70, -1));

        JTF_Busqueda.setBackground(new java.awt.Color(255, 204, 0));
        JTF_Busqueda.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        add(JTF_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 20, 320, 30));

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

        JP_Datos.setBackground(new java.awt.Color(255, 204, 0));
        JP_Datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JP_Datos.setForeground(new java.awt.Color(255, 204, 0));
        JP_Datos.setOpaque(false);

        JL_ID.setBackground(new java.awt.Color(255, 204, 102));
        JL_ID.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ID.setText("ID");
        JL_ID.setOpaque(true);

        JL_Nombre.setBackground(new java.awt.Color(255, 204, 102));
        JL_Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Nombre.setText("Nombre");
        JL_Nombre.setOpaque(true);

        JL_AP.setBackground(new java.awt.Color(255, 204, 102));
        JL_AP.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_AP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_AP.setText("Apellido Paterno");
        JL_AP.setOpaque(true);

        JL_AM.setBackground(new java.awt.Color(255, 204, 102));
        JL_AM.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_AM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_AM.setText("Apellido Materno");
        JL_AM.setOpaque(true);

        JL_Telefono.setBackground(new java.awt.Color(255, 204, 102));
        JL_Telefono.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Telefono.setText("Telefono");
        JL_Telefono.setOpaque(true);

        JL_RFC.setBackground(new java.awt.Color(255, 204, 102));
        JL_RFC.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_RFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_RFC.setText("RFC");
        JL_RFC.setOpaque(true);

        JL_Payback.setBackground(new java.awt.Color(255, 204, 102));
        JL_Payback.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Payback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Payback.setText("CURP");
        JL_Payback.setOpaque(true);

        JL_Banco.setBackground(new java.awt.Color(255, 204, 102));
        JL_Banco.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Banco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Banco.setText("Banco");
        JL_Banco.setOpaque(true);

        JL_Direccion.setBackground(new java.awt.Color(255, 204, 102));
        JL_Direccion.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Direccion.setText("Dirección");
        JL_Direccion.setOpaque(true);

        JB_RFC.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_RFC.setText("Generar");

        JTF_ID.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        JTF_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_IDActionPerformed(evt);
            }
        });

        JTF_Nombre.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_AP.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_AM.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_Telefono.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_RFC.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_Payback.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_Email.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JTF_Direccion.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JB_Direccion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Direccion.setText("Agregar");

        JB_CURP.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_CURP.setText("Generar");

        JB_Banco.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Banco.setText("Agregar");

        JL_Ferreteria.setBackground(new java.awt.Color(255, 204, 102));
        JL_Ferreteria.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_Ferreteria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Ferreteria.setText("Ferreteria");
        JL_Ferreteria.setOpaque(true);

        JTF_Banco.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        JB_Ferreteria.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Ferreteria.setText("Agregar");

        JL_NSS.setBackground(new java.awt.Color(255, 204, 102));
        JL_NSS.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        JL_NSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_NSS.setText("No.SeguroSocial");
        JL_NSS.setOpaque(true);

        JTF_NSS.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        javax.swing.GroupLayout JP_DatosLayout = new javax.swing.GroupLayout(JP_Datos);
        JP_Datos.setLayout(JP_DatosLayout);
        JP_DatosLayout.setHorizontalGroup(
            JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosLayout.createSequentialGroup()
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_AP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_AM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Payback, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JL_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JL_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_ID)
                            .addComponent(JTF_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTF_AP)
                            .addComponent(JTF_AM)
                            .addComponent(JTF_Telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JTF_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JTF_Payback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(JTF_RFC, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(JTF_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JB_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(JB_RFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_CURP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_Banco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JP_DatosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                .addComponent(JL_NSS, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTF_NSS)
                                .addGap(1, 1, 1))
                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                .addComponent(JL_Ferreteria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTF_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_Ferreteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        JP_DatosLayout.setVerticalGroup(
            JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JP_DatosLayout.createSequentialGroup()
                                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(JP_DatosLayout.createSequentialGroup()
                                                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(JL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29))
                                            .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JL_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29))
                                    .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JTF_AP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JL_AP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addComponent(JTF_AM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(JP_DatosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(JL_AM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_Payback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Payback, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_CURP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_NSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_NSS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Ferreteria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Ferreteria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(JP_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 520, 370));

        JP_Controles.setBackground(new java.awt.Color(255, 204, 0));
        JP_Controles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JP_Controles.setForeground(new java.awt.Color(255, 204, 0));
        JP_Controles.setToolTipText("");
        JP_Controles.setOpaque(false);

        JB_Nuevo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Nuevo.setText("Nuevo");

        JB_Agregar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Agregar.setText("Guardar");

        JB_Modificar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Modificar.setText("Guardar Cambios");

        JB_Cancelar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Cancelar.setText("Cancelar");

        JB_Eliminar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        JB_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout JP_ControlesLayout = new javax.swing.GroupLayout(JP_Controles);
        JP_Controles.setLayout(JP_ControlesLayout);
        JP_ControlesLayout.setHorizontalGroup(
            JP_ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_ControlesLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(JP_ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JB_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
        );
        JP_ControlesLayout.setVerticalGroup(
            JP_ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_ControlesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JB_Nuevo)
                .addGap(20, 20, 20)
                .addComponent(JB_Agregar)
                .addGap(20, 20, 20)
                .addComponent(JB_Modificar)
                .addGap(20, 20, 20)
                .addComponent(JB_Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(JB_Eliminar)
                .addGap(34, 34, 34))
        );

        add(JP_Controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 400, 300));

        JL_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        add(JL_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_IDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Banco;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_CURP;
    private javax.swing.JButton JB_Cancelar;
    private javax.swing.JButton JB_Direccion;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Ferreteria;
    private javax.swing.JButton JB_Modificar;
    private javax.swing.JButton JB_Nuevo;
    private javax.swing.JButton JB_RFC;
    public javax.swing.JLabel JL_AM;
    public javax.swing.JLabel JL_AP;
    private javax.swing.JLabel JL_Background;
    public javax.swing.JLabel JL_Banco;
    public javax.swing.JLabel JL_Direccion;
    public javax.swing.JLabel JL_Empleados;
    public javax.swing.JLabel JL_Ferreteria;
    public javax.swing.JLabel JL_Ferreteria3;
    public javax.swing.JLabel JL_ID;
    public javax.swing.JLabel JL_NSS;
    public javax.swing.JLabel JL_NoFerreteria;
    public javax.swing.JLabel JL_NoFerreteria1;
    public javax.swing.JLabel JL_Nombre;
    public javax.swing.JLabel JL_Payback;
    public javax.swing.JLabel JL_RFC;
    public javax.swing.JLabel JL_Telefono;
    public javax.swing.JLabel JL_TipoUsuario;
    public javax.swing.JLabel JL_Usuario;
    private javax.swing.JPanel JP_Controles;
    private javax.swing.JPanel JP_Datos;
    private javax.swing.JTextField JTF_AM;
    private javax.swing.JTextField JTF_AP;
    private javax.swing.JTextField JTF_Banco;
    private javax.swing.JTextField JTF_Busqueda;
    private javax.swing.JTextField JTF_Direccion;
    private javax.swing.JTextField JTF_Email;
    private javax.swing.JTextField JTF_ID;
    private javax.swing.JTextField JTF_NSS;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_Payback;
    private javax.swing.JTextField JTF_RFC;
    private javax.swing.JTextField JTF_Telefono;
    public javax.swing.JTable JT_Empleados;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}