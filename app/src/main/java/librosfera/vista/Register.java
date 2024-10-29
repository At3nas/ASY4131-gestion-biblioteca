package librosfera.vista;

public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Register() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelImg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRegister = new javax.swing.JPanel();
        panelRegisterForm = new javax.swing.JPanel();
        panelEmail = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        panelPassword = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        panelCreateAccount = new javax.swing.JPanel();
        labelAccountExists = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        labelLoginTitle = new javax.swing.JLabel();
        labelLoginSubtitle = new javax.swing.JLabel();
        panelEmail1 = new javax.swing.JPanel();
        labelEmail1 = new javax.swing.JLabel();
        fieldEmail1 = new javax.swing.JTextField();
        panelEmail2 = new javax.swing.JPanel();
        labelEmail2 = new javax.swing.JLabel();
        fieldEmail2 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        setLayout(new java.awt.GridLayout(0, 2));

        panelImg.setBackground(new java.awt.Color(255, 243, 235));
        panelImg.setLayout(new java.awt.GridBagLayout());

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ilustración");
        panelImg.add(jLabel1, new java.awt.GridBagConstraints());

        add(panelImg);

        panelRegister.setBackground(new java.awt.Color(250, 250, 250));
        panelRegister.setMaximumSize(new java.awt.Dimension(700, 252));
        panelRegister.setLayout(new java.awt.GridBagLayout());

        panelRegisterForm.setBackground(new java.awt.Color(250, 250, 250));
        panelRegisterForm.setMaximumSize(new java.awt.Dimension(550, 500));
        panelRegisterForm.setMinimumSize(new java.awt.Dimension(550, 500));
        panelRegisterForm.setPreferredSize(new java.awt.Dimension(550, 500));
        java.awt.GridBagLayout panelLoginFormLayout = new java.awt.GridBagLayout();
        panelLoginFormLayout.columnWidths = new int[] {0};
        panelLoginFormLayout.rowHeights = new int[] {0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0};
        panelRegisterForm.setLayout(panelLoginFormLayout);

        panelEmail.setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout panelEmailLayout = new java.awt.GridBagLayout();
        panelEmailLayout.columnWidths = new int[] {0};
        panelEmailLayout.rowHeights = new int[] {0, 6, 0};
        panelEmail.setLayout(panelEmailLayout);

        labelEmail.setBackground(new java.awt.Color(51, 51, 51));
        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmail.setText("Apellido");
        labelEmail.setMaximumSize(new java.awt.Dimension(350, 16));
        labelEmail.setMinimumSize(new java.awt.Dimension(350, 16));
        labelEmail.setPreferredSize(new java.awt.Dimension(350, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelEmail.add(labelEmail, gridBagConstraints);

        fieldEmail.setBackground(new java.awt.Color(238, 238, 238));
        fieldEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        fieldEmail.setMaximumSize(new java.awt.Dimension(400, 30));
        fieldEmail.setMinimumSize(new java.awt.Dimension(400, 30));
        fieldEmail.setPreferredSize(new java.awt.Dimension(400, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelEmail.add(fieldEmail, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelRegisterForm.add(panelEmail, gridBagConstraints);

        panelPassword.setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout panelPasswordLayout = new java.awt.GridBagLayout();
        panelPasswordLayout.columnWidths = new int[] {0, 0, 0};
        panelPasswordLayout.rowHeights = new int[] {0, 6, 0};
        panelPassword.setLayout(panelPasswordLayout);

        labelPassword.setBackground(new java.awt.Color(51, 51, 51));
        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPassword.setText("Contraseña");
        labelPassword.setMaximumSize(new java.awt.Dimension(350, 16));
        labelPassword.setMinimumSize(new java.awt.Dimension(350, 16));
        labelPassword.setPreferredSize(new java.awt.Dimension(350, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelPassword.add(labelPassword, gridBagConstraints);

        fieldPassword.setBackground(new java.awt.Color(238, 238, 238));
        fieldPassword.setForeground(new java.awt.Color(51, 51, 51));
        fieldPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        fieldPassword.setMaximumSize(new java.awt.Dimension(400, 30));
        fieldPassword.setMinimumSize(new java.awt.Dimension(400, 30));
        fieldPassword.setPreferredSize(new java.awt.Dimension(400, 30));
        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelPassword.add(fieldPassword, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelRegisterForm.add(panelPassword, gridBagConstraints);

        btnRegister.setBackground(new java.awt.Color(135, 23, 35));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registrarse");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setMaximumSize(new java.awt.Dimension(170, 40));
        btnRegister.setMinimumSize(new java.awt.Dimension(170, 40));
        btnRegister.setPreferredSize(new java.awt.Dimension(170, 40));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        panelRegisterForm.add(btnRegister, gridBagConstraints);

        panelCreateAccount.setBackground(new java.awt.Color(250, 250, 250));
        panelCreateAccount.setMaximumSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setMinimumSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setPreferredSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setLayout(new java.awt.GridBagLayout());

        labelAccountExists.setForeground(new java.awt.Color(51, 51, 51));
        labelAccountExists.setText("¿Ya tienes una cuenta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        panelCreateAccount.add(labelAccountExists, gridBagConstraints);

        labelLogin.setForeground(new java.awt.Color(0, 51, 153));
        labelLogin.setText("Inicia sesión");
        labelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCreateAccount.add(labelLogin, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        panelRegisterForm.add(panelCreateAccount, gridBagConstraints);

        panelHeader.setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout panelHeaderLayout = new java.awt.GridBagLayout();
        panelHeaderLayout.columnWidths = new int[] {0};
        panelHeaderLayout.rowHeights = new int[] {0, 8, 0};
        panelHeader.setLayout(panelHeaderLayout);

        labelLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLoginTitle.setForeground(new java.awt.Color(0, 0, 0));
        labelLoginTitle.setText("Registrarse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelHeader.add(labelLoginTitle, gridBagConstraints);

        labelLoginSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        labelLoginSubtitle.setText("¡Nos alegra que te unas a nuestra comunidad! ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelHeader.add(labelLoginSubtitle, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 32, 0);
        panelRegisterForm.add(panelHeader, gridBagConstraints);

        panelEmail1.setBackground(new java.awt.Color(250, 250, 250));
        panelEmail1.setLayout(new java.awt.GridBagLayout());

        labelEmail1.setBackground(new java.awt.Color(51, 51, 51));
        labelEmail1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmail1.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmail1.setText("Correo electrónico");
        labelEmail1.setMaximumSize(new java.awt.Dimension(350, 16));
        labelEmail1.setMinimumSize(new java.awt.Dimension(350, 16));
        labelEmail1.setPreferredSize(new java.awt.Dimension(350, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelEmail1.add(labelEmail1, gridBagConstraints);

        fieldEmail1.setBackground(new java.awt.Color(238, 238, 238));
        fieldEmail1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        fieldEmail1.setMaximumSize(new java.awt.Dimension(400, 30));
        fieldEmail1.setMinimumSize(new java.awt.Dimension(400, 30));
        fieldEmail1.setPreferredSize(new java.awt.Dimension(400, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelEmail1.add(fieldEmail1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelRegisterForm.add(panelEmail1, gridBagConstraints);

        panelEmail2.setBackground(new java.awt.Color(250, 250, 250));
        panelEmail2.setLayout(new java.awt.GridBagLayout());

        labelEmail2.setBackground(new java.awt.Color(51, 51, 51));
        labelEmail2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmail2.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmail2.setText("Nombre");
        labelEmail2.setMaximumSize(new java.awt.Dimension(350, 16));
        labelEmail2.setMinimumSize(new java.awt.Dimension(350, 16));
        labelEmail2.setPreferredSize(new java.awt.Dimension(350, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelEmail2.add(labelEmail2, gridBagConstraints);

        fieldEmail2.setBackground(new java.awt.Color(238, 238, 238));
        fieldEmail2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        fieldEmail2.setMaximumSize(new java.awt.Dimension(400, 30));
        fieldEmail2.setMinimumSize(new java.awt.Dimension(400, 30));
        fieldEmail2.setPreferredSize(new java.awt.Dimension(400, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelEmail2.add(fieldEmail2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelRegisterForm.add(panelEmail2, gridBagConstraints);

        panelRegister.add(panelRegisterForm, new java.awt.GridBagConstraints());

        add(panelRegister);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    // Llevar al Home
    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        App frameHome = new App();
        frameHome.setVisible(true);
    }//GEN-LAST:event_btnRegisterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldEmail1;
    private javax.swing.JTextField fieldEmail2;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAccountExists;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLoginSubtitle;
    private javax.swing.JLabel labelLoginTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelEmail1;
    private javax.swing.JPanel panelEmail2;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPanel panelRegisterForm;
    // End of variables declaration//GEN-END:variables
}
