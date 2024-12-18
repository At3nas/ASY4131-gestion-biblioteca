/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package librosfera.vista.components;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ateka
 */
public class BookCard extends javax.swing.JPanel {

    
    public BookCard(String title, String author, String isbn) throws IOException {
        initComponents();
        
        
        URL imgUrl;
        imgUrl = new URL("https://covers.openlibrary.org/b/isbn/" + isbn + "-M.jpg");
        BufferedImage image = ImageIO.read(imgUrl);
        this.imgBookCover.setIcon(new ImageIcon(image));

        this.labelAuthor.setText(author);
        this.labelTitle.setText(title);

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

        panelCover = new javax.swing.JPanel();
        imgBookCover = new javax.swing.JLabel();
        panelBookInfo = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        btnViewMore = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 16, 0};
        setLayout(layout);

        panelCover.setBackground(new java.awt.Color(225, 176, 109));
        panelCover.setMaximumSize(new java.awt.Dimension(180, 240));
        panelCover.setMinimumSize(new java.awt.Dimension(180, 240));
        panelCover.setPreferredSize(new java.awt.Dimension(180, 240));
        panelCover.setLayout(new java.awt.BorderLayout());

        imgBookCover.setForeground(new java.awt.Color(0, 0, 0));
        imgBookCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBookCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temporal-logo.png"))); // NOI18N
        imgBookCover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCover.add(imgBookCover, java.awt.BorderLayout.CENTER);

        add(panelCover, new java.awt.GridBagConstraints());

        panelBookInfo.setBackground(new java.awt.Color(250, 250, 250));
        panelBookInfo.setMaximumSize(new java.awt.Dimension(200, 84));
        panelBookInfo.setMinimumSize(new java.awt.Dimension(200, 84));
        panelBookInfo.setName(""); // NOI18N
        panelBookInfo.setPreferredSize(new java.awt.Dimension(200, 84));
        panelBookInfo.setLayout(new java.awt.GridLayout(3, 0));

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(51, 51, 51));
        labelTitle.setText("Título");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelBookInfo.add(labelTitle);

        labelAuthor.setForeground(new java.awt.Color(102, 102, 102));
        labelAuthor.setText("Autor");
        labelAuthor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelBookInfo.add(labelAuthor);

        btnViewMore.setBackground(new java.awt.Color(135, 23, 35));
        btnViewMore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewMore.setForeground(new java.awt.Color(250, 250, 250));
        btnViewMore.setText("Ver más");
        btnViewMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMore.setMaximumSize(new java.awt.Dimension(40, 23));
        btnViewMore.setMinimumSize(new java.awt.Dimension(40, 23));
        btnViewMore.setPreferredSize(new java.awt.Dimension(40, 23));
        panelBookInfo.add(btnViewMore);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(panelBookInfo, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewMore;
    private javax.swing.JLabel imgBookCover;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBookInfo;
    private javax.swing.JPanel panelCover;
    // End of variables declaration//GEN-END:variables
}
