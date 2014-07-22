/*
 * ImagePreviewPanel.java
 *
 * Created on 13 de Janeiro de 2008, 10:50
 */
package br.gfca.openstereogram.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author  Gustavo
 */
public class ImagePreviewPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 66254190682260638L;
    private Image image;

    /** Creates new form ImagePreviewPanel */
    public ImagePreviewPanel() {
        initComponents();
    }

    public void setImage(BufferedImage image) {
        this.image = image.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
        this.repaint();
    }

    public void resetImage() {
        this.image = null;
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (this.image == null) {
            int textSize = this.getFontMetrics(this.getFont()).stringWidth("<Click to open>");
            g.drawString("<Click to open>", (this.getWidth() - textSize) / 2, this.getHeight() / 2);
        } else {
            g.drawImage(this.image, 0, 0, null);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Codigo Gerado ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Declaracao de variaveis - nao modifique//GEN-BEGIN:variables
    // Fim da declaracao de variaveis//GEN-END:variables
}
