/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package librosfera.vista;

/**
 *
 * @author Cetecom
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Home() {
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

        panelSidebar = new javax.swing.JPanel();
        itemInicio = new javax.swing.JLabel();
        itemListas = new javax.swing.JLabel();
        itemExplorar = new javax.swing.JLabel();
        itemHistorial = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();

        panelSidebar.setBackground(new java.awt.Color(102, 102, 102));
        panelSidebar.setMaximumSize(new java.awt.Dimension(270, 1024));
        panelSidebar.setMinimumSize(new java.awt.Dimension(270, 1024));

        itemInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemInicio.setForeground(new java.awt.Color(255, 255, 255));
        itemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librosfera/icons/house.png"))); // NOI18N
        itemInicio.setText("Inicio");

        itemListas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemListas.setForeground(new java.awt.Color(255, 255, 255));
        itemListas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librosfera/icons/list.png"))); // NOI18N
        itemListas.setText("Listas");

        itemExplorar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemExplorar.setForeground(new java.awt.Color(255, 255, 255));
        itemExplorar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librosfera/icons/search.png"))); // NOI18N
        itemExplorar.setText("Explorar");

        itemHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemHistorial.setForeground(new java.awt.Color(255, 255, 255));
        itemHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librosfera/icons/history.png"))); // NOI18N
        itemHistorial.setText("Historial");

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemInicio)
                    .addComponent(itemListas)
                    .addComponent(itemExplorar)
                    .addComponent(itemHistorial))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(itemInicio)
                .addGap(32, 32, 32)
                .addComponent(itemListas)
                .addGap(32, 32, 32)
                .addComponent(itemExplorar)
                .addGap(32, 32, 32)
                .addComponent(itemHistorial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemExplorar;
    private javax.swing.JLabel itemHistorial;
    private javax.swing.JLabel itemInicio;
    private javax.swing.JLabel itemListas;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}