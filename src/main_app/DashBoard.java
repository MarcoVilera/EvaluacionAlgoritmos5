/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_app;

import app1.ventanaMatriz;
import app2.Eval2;
import app3.Eval3;
import app4.Eval4;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author MarcoVilera
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    int xMouse, yMouse;

    public DashBoard() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraHeader = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        btnTextClose = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        btnPrueba1 = new javax.swing.JPanel();
        lbEv1 = new javax.swing.JLabel();
        btnPrueba2 = new javax.swing.JPanel();
        lbEv2 = new javax.swing.JLabel();
        btnPrueba3 = new javax.swing.JPanel();
        lbEv3 = new javax.swing.JLabel();
        btnPrueba4 = new javax.swing.JPanel();
        lbEv4 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraHeader.setBackground(new java.awt.Color(0, 105, 92));
        barraHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraHeaderMouseDragged(evt);
            }
        });
        barraHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraHeaderMousePressed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(0, 105, 92));

        btnTextClose.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnTextClose.setForeground(new java.awt.Color(255, 255, 255));
        btnTextClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTextClose.setText("X");
        btnTextClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTextCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTextCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTextCloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraHeaderLayout = new javax.swing.GroupLayout(barraHeader);
        barraHeader.setLayout(barraHeaderLayout);
        barraHeaderLayout.setHorizontalGroup(
            barraHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraHeaderLayout.createSequentialGroup()
                .addGap(0, 940, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraHeaderLayout.setVerticalGroup(
            barraHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(barraHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 31));

        headerPanel.setBackground(new java.awt.Color(0, 121, 107));

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Evaluación 5 Algoritmos y Estructuras");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 70));

        btnPrueba1.setBackground(new java.awt.Color(0, 150, 136));

        lbEv1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEv1.setForeground(new java.awt.Color(255, 255, 255));
        lbEv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEv1.setText("Evaluación 1");
        lbEv1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEv1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEv1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEv1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrueba1Layout = new javax.swing.GroupLayout(btnPrueba1);
        btnPrueba1.setLayout(btnPrueba1Layout);
        btnPrueba1Layout.setHorizontalGroup(
            btnPrueba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnPrueba1Layout.setVerticalGroup(
            btnPrueba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrueba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        btnPrueba2.setBackground(new java.awt.Color(0, 150, 136));

        lbEv2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEv2.setForeground(new java.awt.Color(255, 255, 255));
        lbEv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEv2.setText("Evaluación 2");
        lbEv2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEv2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEv2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEv2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEv2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrueba2Layout = new javax.swing.GroupLayout(btnPrueba2);
        btnPrueba2.setLayout(btnPrueba2Layout);
        btnPrueba2Layout.setHorizontalGroup(
            btnPrueba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnPrueba2Layout.setVerticalGroup(
            btnPrueba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrueba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        btnPrueba3.setBackground(new java.awt.Color(0, 150, 136));

        lbEv3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEv3.setForeground(new java.awt.Color(255, 255, 255));
        lbEv3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEv3.setText("Evaluación 3");
        lbEv3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEv3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEv3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEv3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEv3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrueba3Layout = new javax.swing.GroupLayout(btnPrueba3);
        btnPrueba3.setLayout(btnPrueba3Layout);
        btnPrueba3Layout.setHorizontalGroup(
            btnPrueba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnPrueba3Layout.setVerticalGroup(
            btnPrueba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrueba3Layout.createSequentialGroup()
                .addComponent(lbEv3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnPrueba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        btnPrueba4.setBackground(new java.awt.Color(0, 150, 136));

        lbEv4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEv4.setForeground(new java.awt.Color(255, 255, 255));
        lbEv4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEv4.setText("Evaluación 4");
        lbEv4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEv4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEv4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEv4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEv4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrueba4Layout = new javax.swing.GroupLayout(btnPrueba4);
        btnPrueba4.setLayout(btnPrueba4Layout);
        btnPrueba4Layout.setHorizontalGroup(
            btnPrueba4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnPrueba4Layout.setVerticalGroup(
            btnPrueba4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEv4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrueba4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 250, 70));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(1000, 560));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1000, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTextCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnTextCloseMouseClicked

    private void btnTextCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextCloseMouseEntered
        btnClose.setBackground(Color.red);
        btnTextClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnTextCloseMouseEntered

    private void btnTextCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextCloseMouseExited
        btnClose.setBackground(new java.awt.Color(0, 105, 92));
    }//GEN-LAST:event_btnTextCloseMouseExited

    private void btnTextCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextCloseMousePressed
        btnClose.setBackground(new java.awt.Color(204, 51, 0));
    }//GEN-LAST:event_btnTextCloseMousePressed

    private void barraHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraHeaderMouseDragged

    private void barraHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraHeaderMousePressed

    private void lbEv1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv1MouseEntered
        btnPrueba1.setBackground(new java.awt.Color(0, 105, 92));
    }//GEN-LAST:event_lbEv1MouseEntered

    private void lbEv1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv1MouseExited
        btnPrueba1.setBackground(new java.awt.Color(0, 150, 136));
    }//GEN-LAST:event_lbEv1MouseExited

    private void lbEv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv1MouseClicked
        ventanaMatriz p1 = new ventanaMatriz();
        UpdatePanel(p1);
    }//GEN-LAST:event_lbEv1MouseClicked

    private void lbEv2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv2MouseEntered
        btnPrueba2.setBackground(new java.awt.Color(0, 105, 92));
    }//GEN-LAST:event_lbEv2MouseEntered

    private void lbEv2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv2MouseExited
        btnPrueba2.setBackground(new java.awt.Color(0, 150, 136));
    }//GEN-LAST:event_lbEv2MouseExited

    private void lbEv2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv2MouseClicked
        Eval2 p2 = new Eval2();
        UpdatePanel(p2);
    }//GEN-LAST:event_lbEv2MouseClicked

    private void lbEv3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv3MouseEntered
        btnPrueba3.setBackground(new java.awt.Color(0, 105, 92));
    }//GEN-LAST:event_lbEv3MouseEntered

    private void lbEv3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv3MouseExited
        btnPrueba3.setBackground(new java.awt.Color(0, 150, 136));
    }//GEN-LAST:event_lbEv3MouseExited

    private void lbEv3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv3MouseClicked
        Eval3 p3 = new Eval3();
        UpdatePanel(p3);
    }//GEN-LAST:event_lbEv3MouseClicked

    private void lbEv4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv4MouseEntered
        btnPrueba4.setBackground(new java.awt.Color(0, 105, 92));
    }//GEN-LAST:event_lbEv4MouseEntered

    private void lbEv4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv4MouseExited
        btnPrueba4.setBackground(new java.awt.Color(0, 150, 136));
    }//GEN-LAST:event_lbEv4MouseExited

    private void lbEv4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEv4MouseClicked
        Eval4 p4 = null;
        try {
            p4 = new Eval4();
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        UpdatePanel(p4);
    }//GEN-LAST:event_lbEv4MouseClicked
    private void UpdatePanel(JFrame p){
        content.removeAll();
        p.setLocation(0,0);
        content.add(p.getContentPane());
        content.revalidate();
        content.repaint();
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraHeader;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnPrueba1;
    private javax.swing.JPanel btnPrueba2;
    private javax.swing.JPanel btnPrueba3;
    private javax.swing.JPanel btnPrueba4;
    private javax.swing.JLabel btnTextClose;
    private javax.swing.JPanel content;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel lbEv1;
    private javax.swing.JLabel lbEv2;
    private javax.swing.JLabel lbEv3;
    private javax.swing.JLabel lbEv4;
    // End of variables declaration//GEN-END:variables
}