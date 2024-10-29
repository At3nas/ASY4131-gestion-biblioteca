package librosfera.vista;

public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
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

        panelLogin = new javax.swing.JPanel();
        panelLoginForm = new javax.swing.JPanel();
        panelEmail = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        panelPasswordOptions = new javax.swing.JPanel();
        checkboxRememberMe = new javax.swing.JCheckBox();
        panelPasswordReset1 = new javax.swing.JPanel();
        labelForgotPassword1 = new javax.swing.JLabel();
        labelResetPassword1 = new javax.swing.JLabel();
        panelPassword = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        panelCreateAccount = new javax.swing.JPanel();
        labelForgotPassword = new javax.swing.JLabel();
        labelResetPassword = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        labelLoginTitle = new javax.swing.JLabel();
        labelLoginSubtitle = new javax.swing.JLabel();
        panelImg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        setLayout(new java.awt.GridLayout(0, 2));

        panelLogin.setBackground(new java.awt.Color(250, 250, 250));
        panelLogin.setMaximumSize(new java.awt.Dimension(700, 252));
        panelLogin.setLayout(new java.awt.GridBagLayout());

        panelLoginForm.setBackground(new java.awt.Color(250, 250, 250));
        panelLoginForm.setMaximumSize(new java.awt.Dimension(550, 400));
        panelLoginForm.setMinimumSize(new java.awt.Dimension(550, 400));
        panelLoginForm.setPreferredSize(new java.awt.Dimension(550, 400));
        java.awt.GridBagLayout panelLoginFormLayout = new java.awt.GridBagLayout();
        panelLoginFormLayout.columnWidths = new int[] {0, 0, 0};
        panelLoginFormLayout.rowHeights = new int[] {0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0};
        panelLoginForm.setLayout(panelLoginFormLayout);

        panelEmail.setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout panelEmailLayout = new java.awt.GridBagLayout();
        panelEmailLayout.columnWidths = new int[] {0};
        panelEmailLayout.rowHeights = new int[] {0, 6, 0};
        panelEmail.setLayout(panelEmailLayout);

        labelEmail.setBackground(new java.awt.Color(51, 51, 51));
        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEmail.setText("Correo electrónico");
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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelLoginForm.add(panelEmail, gridBagConstraints);

        panelPasswordOptions.setBackground(new java.awt.Color(250, 250, 250));
        panelPasswordOptions.setMaximumSize(new java.awt.Dimension(400, 30));
        panelPasswordOptions.setMinimumSize(new java.awt.Dimension(400, 30));
        panelPasswordOptions.setPreferredSize(new java.awt.Dimension(400, 30));
        java.awt.GridBagLayout panelPasswordOptionsLayout = new java.awt.GridBagLayout();
        panelPasswordOptionsLayout.columnWidths = new int[] {0, 80, 0};
        panelPasswordOptionsLayout.rowHeights = new int[] {0};
        panelPasswordOptions.setLayout(panelPasswordOptionsLayout);

        checkboxRememberMe.setBackground(new java.awt.Color(250, 250, 250));
        checkboxRememberMe.setForeground(new java.awt.Color(51, 51, 51));
        checkboxRememberMe.setText("Recordarme");
        checkboxRememberMe.setMaximumSize(new java.awt.Dimension(200, 20));
        checkboxRememberMe.setMinimumSize(new java.awt.Dimension(100, 20));
        checkboxRememberMe.setPreferredSize(new java.awt.Dimension(100, 20));
        checkboxRememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxRememberMeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelPasswordOptions.add(checkboxRememberMe, gridBagConstraints);

        panelPasswordReset1.setBackground(new java.awt.Color(250, 250, 250));
        panelPasswordReset1.setMaximumSize(new java.awt.Dimension(230, 30));
        panelPasswordReset1.setMinimumSize(new java.awt.Dimension(230, 30));
        panelPasswordReset1.setName(""); // NOI18N
        panelPasswordReset1.setPreferredSize(new java.awt.Dimension(230, 30));
        panelPasswordReset1.setLayout(new java.awt.GridBagLayout());

        labelForgotPassword1.setForeground(new java.awt.Color(51, 51, 51));
        labelForgotPassword1.setText("¿Olvidaste tu contraseña?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelPasswordReset1.add(labelForgotPassword1, gridBagConstraints);

        labelResetPassword1.setForeground(new java.awt.Color(0, 51, 153));
        labelResetPassword1.setText("Recupérala");
        labelResetPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelPasswordReset1.add(labelResetPassword1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        panelPasswordOptions.add(panelPasswordReset1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        panelLoginForm.add(panelPasswordOptions, gridBagConstraints);

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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelLoginForm.add(panelPassword, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(135, 23, 35));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar sesión");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setMaximumSize(new java.awt.Dimension(170, 40));
        btnLogin.setMinimumSize(new java.awt.Dimension(170, 40));
        btnLogin.setPreferredSize(new java.awt.Dimension(170, 40));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        panelLoginForm.add(btnLogin, gridBagConstraints);

        panelCreateAccount.setBackground(new java.awt.Color(250, 250, 250));
        panelCreateAccount.setMaximumSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setMinimumSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setPreferredSize(new java.awt.Dimension(200, 30));
        panelCreateAccount.setLayout(new java.awt.GridBagLayout());

        labelForgotPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelForgotPassword.setText("¿Aún no tienes cuenta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        panelCreateAccount.add(labelForgotPassword, gridBagConstraints);

        labelResetPassword.setForeground(new java.awt.Color(0, 51, 153));
        labelResetPassword.setText("Regístrate");
        labelResetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResetPasswordMouseClicked(evt);
            }
        });
        panelCreateAccount.add(labelResetPassword, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        panelLoginForm.add(panelCreateAccount, gridBagConstraints);

        panelHeader.setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout panelHeaderLayout = new java.awt.GridBagLayout();
        panelHeaderLayout.columnWidths = new int[] {0};
        panelHeaderLayout.rowHeights = new int[] {0, 8, 0};
        panelHeader.setLayout(panelHeaderLayout);

        labelLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLoginTitle.setForeground(new java.awt.Color(0, 0, 0));
        labelLoginTitle.setText("Iniciar sesión");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelHeader.add(labelLoginTitle, gridBagConstraints);

        labelLoginSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        labelLoginSubtitle.setText("Por favor, ingrese sus datos para iniciar sesión en su cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelHeader.add(labelLoginSubtitle, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 32, 0);
        panelLoginForm.add(panelHeader, gridBagConstraints);

        panelLogin.add(panelLoginForm, new java.awt.GridBagConstraints());

        add(panelLogin);

        panelImg.setBackground(new java.awt.Color(255, 243, 235));
        panelImg.setLayout(new java.awt.GridBagLayout());

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ilustración");
        panelImg.add(jLabel1, new java.awt.GridBagConstraints());

        add(panelImg);
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxRememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxRememberMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxRememberMeActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    // Llevar al Home
    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        App frameHome = new App();
        frameHome.setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked
    
    // Ingresar
    private void labelResetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPasswordMouseClicked
        // Agregar panel de Register al panel de contenido
        Register panelRegister = new Register();
        
    }//GEN-LAST:event_labelResetPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkboxRememberMe;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelForgotPassword;
    private javax.swing.JLabel labelForgotPassword1;
    private javax.swing.JLabel labelLoginSubtitle;
    private javax.swing.JLabel labelLoginTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelResetPassword;
    private javax.swing.JLabel labelResetPassword1;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLoginForm;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPasswordOptions;
    private javax.swing.JPanel panelPasswordReset1;
    // End of variables declaration//GEN-END:variables
}
