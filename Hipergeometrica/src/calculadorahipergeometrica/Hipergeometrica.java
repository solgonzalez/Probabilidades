
package calculadorahipergeometrica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hipergeometrica extends javax.swing.JFrame {

    /**
     * Creates new form Hipergeometrica
     */
    Controlador controlador = new Controlador();
    
    public Hipergeometrica() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/media/calculator.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgInfoTipos = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnCloseInfoTipos = new javax.swing.JButton();
        PanelCalculadora = new javax.swing.JPanel();
        btnMostrarEjemplos = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtInfoTipo1 = new javax.swing.JTextField();
        txtInfoTipo2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnInfoTipos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPoblacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPoblacionTipo1 = new javax.swing.JTextField();
        txtPoblacionTipo2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTotalMuestra = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtMuestraTipo2 = new javax.swing.JTextField();
        txtMuestraTipo1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PanelCapasEjemplos = new javax.swing.JLayeredPane();
        PanelEjemplo2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        dlgInfoTipos.setLocation(new java.awt.Point(400, 200));
        dlgInfoTipos.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        dlgInfoTipos.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        dlgInfoTipos.setSize(new java.awt.Dimension(308, 252));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setText("<html>Breve descripción de los dos tipos<br> presentes en el ejercicio. <br><br>Esto se utilizará solamente como <br>una referencia. Este campo es opcional.</html>");
        jLabel19.setMaximumSize(new java.awt.Dimension(295, 200));
        jLabel19.setMinimumSize(new java.awt.Dimension(295, 200));
        jLabel19.setPreferredSize(new java.awt.Dimension(295, 200));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel22.setText("Tipos");

        btnCloseInfoTipos.setText("OK");
        btnCloseInfoTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseInfoTiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgInfoTiposLayout = new javax.swing.GroupLayout(dlgInfoTipos.getContentPane());
        dlgInfoTipos.getContentPane().setLayout(dlgInfoTiposLayout);
        dlgInfoTiposLayout.setHorizontalGroup(
            dlgInfoTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgInfoTiposLayout.createSequentialGroup()
                .addGroup(dlgInfoTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgInfoTiposLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel22))
                    .addGroup(dlgInfoTiposLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgInfoTiposLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnCloseInfoTipos)))
                .addGap(3, 3, 3))
        );
        dlgInfoTiposLayout.setVerticalGroup(
            dlgInfoTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgInfoTiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnCloseInfoTipos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 10));

        PanelCalculadora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24))); // NOI18N
        PanelCalculadora.setMaximumSize(new java.awt.Dimension(800, 700));
        PanelCalculadora.setMinimumSize(new java.awt.Dimension(600, 500));
        PanelCalculadora.setPreferredSize(new java.awt.Dimension(800, 700));

        btnMostrarEjemplos.setText("Mostrar Ejemplos");
        btnMostrarEjemplos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEjemplosActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Resultado");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Los elementos de la población se dividen en los siguientes tipos:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Tipo 1");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("Tipo 2");

        txtInfoTipo1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtInfoTipo2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        btnInfoTipos.setText("?");
        btnInfoTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoTiposActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("Población");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("Total");

        txtTotalPoblacion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtTotalPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPoblacionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel14.setText("{");

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Tipo 1");

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 153, 0));
        jLabel28.setText("Tipo 2");

        txtPoblacionTipo1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtPoblacionTipo2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel29.setText("Muestra");

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel30.setText("Total");

        txtTotalMuestra.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel31.setText("{");

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 102));
        jLabel32.setText("Tipo 1");

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 153, 0));
        jLabel33.setText("Tipo 2");

        txtMuestraTipo2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtMuestraTipo1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PanelCalculadoraLayout = new javax.swing.GroupLayout(PanelCalculadora);
        PanelCalculadora.setLayout(PanelCalculadoraLayout);
        PanelCalculadoraLayout.setHorizontalGroup(
            PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalculadoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarEjemplos)
                .addContainerGap())
            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addGap(10, 10, 10)
                                .addComponent(txtTotalMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMuestraTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMuestraTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnInfoTipos)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCalculadoraLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(77, 77, 77))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCalculadoraLayout.createSequentialGroup()
                                        .addComponent(txtInfoTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtInfoTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCalculadoraLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtTotalPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPoblacionTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPoblacionTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalcular)
                                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel16))))
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCalculadoraLayout.setVerticalGroup(
            PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalculadoraLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInfoTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInfoTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfoTipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtPoblacionTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtPoblacionTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))))
                        .addGap(18, 18, 18))
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtMuestraTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtMuestraTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnMostrarEjemplos)
                .addContainerGap())
        );

        PanelCapasEjemplos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelCapasEjemplos.setLayout(new javax.swing.OverlayLayout(PanelCapasEjemplos));

        PanelEjemplo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ejemplos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24))); // NOI18N
        PanelEjemplo2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PanelEjemplo2.setMaximumSize(new java.awt.Dimension(475, 700));
        PanelEjemplo2.setMinimumSize(new java.awt.Dimension(475, 400));
        PanelEjemplo2.setName(""); // NOI18N
        PanelEjemplo2.setPreferredSize(new java.awt.Dimension(453, 700));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("<html>Carlos y Rebeca juegan cartas, pero se dan cuenta de que su baraja <br>está incompleta, pues\nposee únicamente <font color='blue'>19 cartas negras</font> y <br><font color='green'>17 cartas rojas</font>. </html>");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>a) ¿Cuál es la probabilidad de que luego de revolver las cartas <br><font color='red'>seleccionen 5 de ellas</font> de forma aleatoria y que <font color='blue'>3 sean<br> negras</font> y <font color='green'>2 rojas</font>? </html>");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Tipo 1");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setText("Tipo 2");

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField9.setText("Cartas Negras");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField10.setText("Cartas Rojas");

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField11.setText("19 + 17 = 36");

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField13.setText("17");

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setText("Población");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel21.setText("{");

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField12.setText("19");

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 153, 0));
        jLabel35.setText("Tipo 2");

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("Tipo 1");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setText("Total");

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField16.setText("3");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField15.setText("2");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField14.setText("5");

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel36.setText("Muestra");

        jLabel38.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel38.setText("{");

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 0));
        jLabel37.setText("Total");

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 255));
        jLabel39.setText("Tipo 1");

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 153, 0));
        jLabel40.setText("Tipo 2");

        javax.swing.GroupLayout PanelEjemplo2Layout = new javax.swing.GroupLayout(PanelEjemplo2);
        PanelEjemplo2.setLayout(PanelEjemplo2Layout);
        PanelEjemplo2Layout.setHorizontalGroup(
            PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                                .addComponent(jLabel34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator5)))
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel15))
                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEjemplo2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))))
                .addContainerGap())
        );
        PanelEjemplo2Layout.setVerticalGroup(
            PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addComponent(jLabel18))
                .addGap(22, 22, 22)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEjemplo2Layout.createSequentialGroup()
                                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEjemplo2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PanelEjemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addGap(7, 7, 7)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        PanelCapasEjemplos.add(PanelEjemplo2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCapasEjemplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCapasEjemplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarEjemplosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEjemplosActionPerformed
        if(PanelCapasEjemplos.isVisible()){
            PanelCapasEjemplos.setVisible(false);
        }else{
            PanelCapasEjemplos.setVisible(true);
        }
    }//GEN-LAST:event_btnMostrarEjemplosActionPerformed

    private void btnInfoTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoTiposActionPerformed
        dlgInfoTipos.setVisible(true);
    }//GEN-LAST:event_btnInfoTiposActionPerformed

    private void btnCloseInfoTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseInfoTiposActionPerformed
        dlgInfoTipos.setVisible(false);
    }//GEN-LAST:event_btnCloseInfoTiposActionPerformed

    private void txtTotalPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPoblacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPoblacionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(!controlador.validarNumero(txtTotalPoblacion.getText())){
            JOptionPane.showMessageDialog(this, "Población total inválida.");
            txtTotalPoblacion.setText("");
        }else if(!controlador.validarNumero(txtPoblacionTipo1.getText())){
            JOptionPane.showMessageDialog(this, "Población de tipo 1 inválida.");
            txtPoblacionTipo1.setText("");
        }else if(!controlador.validarNumero(txtPoblacionTipo2.getText())){
            JOptionPane.showMessageDialog(this, "Población de tipo 2 inválida.");
            txtPoblacionTipo2.setText("");
        }else if(!controlador.validarNumero(txtTotalMuestra.getText())){
            JOptionPane.showMessageDialog(this, "Total de muestra inválido.");
            txtTotalMuestra.setText("");
        }else if(!controlador.validarNumero(txtMuestraTipo1.getText())){
            JOptionPane.showMessageDialog(this, "Muestra de tipo 1 inválida.");
            txtMuestraTipo1.setText("");
        }else if(!controlador.validarNumero(txtMuestraTipo2.getText())){
            JOptionPane.showMessageDialog(this, "Muestra de tipo 2 inválida.");
            txtMuestraTipo2.setText("");
        }else{
            int poblacionTotal = Integer.parseInt(txtTotalPoblacion.getText());
            int poblacionTipo1 = Integer.parseInt(txtPoblacionTipo1.getText());
            int poblacionTipo2 = Integer.parseInt(txtPoblacionTipo2.getText());
            int muestraTotal = Integer.parseInt(txtTotalMuestra.getText());
            int muestraTipo1 = Integer.parseInt(txtMuestraTipo1.getText());
            int muestraTipo2 = Integer.parseInt(txtMuestraTipo2.getText());
            if(controlador.validarPoblacion(poblacionTotal, poblacionTipo1, poblacionTipo2)){
                if(controlador.validarPoblacion(muestraTotal, muestraTipo1, muestraTipo2)){
                    if(poblacionTotal >= muestraTotal){
                        double resultado = controlador.calcularHipergeometrica(poblacionTotal, poblacionTipo1,
                                muestraTotal, muestraTipo1);
                        if(resultado != -1){
                            txtResultado.setText(String.valueOf(resultado));
                        }else{
                            JOptionPane.showMessageDialog(this, "Número no computable.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Muestra debe ser menor"
                                + " o igual a población total.");
                        txtTotalMuestra.setText("");
                        txtMuestraTipo1.setText("");
                        txtMuestraTipo2.setText("");
                    }
                }else{
                JOptionPane.showMessageDialog(this, "Suma de tipos de muestra"
                        + " total no corresponde. Total = Tipo 1 + Tipo 2.");
                txtTotalMuestra.setText("");
                txtMuestraTipo1.setText("");
                txtMuestraTipo2.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Suma de tipos de población"
                        + " total no corresponde. Total = Tipo 1 + Tipo 2.");
                txtTotalPoblacion.setText("");
                txtPoblacionTipo1.setText("");
                txtPoblacionTipo2.setText("");
            }
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Hipergeometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hipergeometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hipergeometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hipergeometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hipergeometrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCalculadora;
    private javax.swing.JLayeredPane PanelCapasEjemplos;
    private javax.swing.JPanel PanelEjemplo2;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCloseInfoTipos;
    private javax.swing.JButton btnInfoTipos;
    private javax.swing.JButton btnMostrarEjemplos;
    private javax.swing.JDialog dlgInfoTipos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtInfoTipo1;
    private javax.swing.JTextField txtInfoTipo2;
    private javax.swing.JTextField txtMuestraTipo1;
    private javax.swing.JTextField txtMuestraTipo2;
    private javax.swing.JTextField txtPoblacionTipo1;
    private javax.swing.JTextField txtPoblacionTipo2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtTotalMuestra;
    private javax.swing.JTextField txtTotalPoblacion;
    // End of variables declaration//GEN-END:variables
}
